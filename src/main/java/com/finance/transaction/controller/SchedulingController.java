package com.finance.transaction.controller;

import com.finance.transaction.model.RequestTransfer;
import com.finance.transaction.model.ResponseTransfer;
import com.finance.transaction.repository.TransferEntity;
import com.finance.transaction.repository.TransferRepository;
import com.finance.transaction.service.IValidateValueAndRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SchedulingController {
    @Autowired
    private IValidateValueAndRate validateValueAndRate;

    @Autowired
    private TransferRepository transferRepository;

    @PostMapping("/createFinanceTransaction")
    public ResponseEntity<ResponseTransfer> createFinanceTransaction(@RequestBody RequestTransfer requestTransfer) {

        ResponseTransfer responseTransfer = validateValueAndRate.validateValueAndRate(requestTransfer);

        if (responseTransfer == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(responseTransfer);
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<TransferEntity> TransactionsForId(@PathVariable Long id){
        return ResponseEntity.ok(transferRepository.findById(id).get());
    }

}
