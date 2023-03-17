package com.finance.transaction.controller;

import com.finance.transaction.model.RequestTransferModel;
import com.finance.transaction.model.ResponseTransferModel;
import com.finance.transaction.model.TransferModel;
import com.finance.transaction.service.IConsultFinanceTransactionService;
import com.finance.transaction.service.IValidateValueAndRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SchedulingController {
    @Autowired
    IValidateValueAndRateService validateValueAndRate;

    @Autowired
    IConsultFinanceTransactionService consultFinanceTransaction;

    @PostMapping("/createFinanceTransaction")
    public ResponseEntity<ResponseTransferModel> createFinanceTransaction(@RequestBody RequestTransferModel requestTransfer) {

        ResponseTransferModel responseTransferModel = validateValueAndRate.validateValueAndRate(requestTransfer);

        if (responseTransferModel.getResponse().isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(responseTransferModel);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransferModel> getFinanceTransaction(@PathVariable Long id) {

        TransferModel transferModel = consultFinanceTransaction.getFinanceTransactionById(id);

        if (ObjectUtils.isEmpty(transferModel)) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(transferModel);
        }
    }

}
