package com.finance.transaction.controller;

import com.finance.transaction.model.RequestTransfer;
import com.finance.transaction.model.ResponseTransfer;
import com.finance.transaction.model.Transfer;
import com.finance.transaction.service.IConsultFinanceTransaction;
import com.finance.transaction.service.IValidateValueAndRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SchedulingController {
    @Autowired
    IValidateValueAndRate validateValueAndRate;

    @Autowired
    IConsultFinanceTransaction consultFinanceTransaction;

    @PostMapping("/createFinanceTransaction")
    public ResponseEntity<ResponseTransfer> createFinanceTransaction(@RequestBody RequestTransfer requestTransfer) {

        ResponseTransfer responseTransfer = validateValueAndRate.validateValueAndRate(requestTransfer);

        if (responseTransfer.getResponse().isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(responseTransfer);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transfer> getFinanceTransaction(@PathVariable Long id) {

        Transfer transfer = consultFinanceTransaction.getFinanceTransactionById(id);

        if (ObjectUtils.isEmpty(transfer)) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(transfer);
        }
    }

}
