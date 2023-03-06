package com.finance.transaction.controller;

import com.finance.transaction.model.RequestTransfer;
import com.finance.transaction.model.Transfer;
import com.finance.transaction.service.IValidateValueAndRate;
import com.finance.transaction.service.Taxa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SchedulingController {

    IValidateValueAndRate validateValueAndRate;

    @GetMapping("/mensagem")
    public String exibirMensagem() {
        return "Olá, mundo!";
    }

    @PostMapping("/salvar")
    public ResponseEntity<String> salvar(@RequestBody RequestTransfer requestTransfer) {

        Transfer transfer = new Transfer();

        validateValueAndRate.validateValueAndRate(transfer);

        return new ResponseEntity<>("Objeto salvo com sucesso!", HttpStatus.CREATED);
    }
}
