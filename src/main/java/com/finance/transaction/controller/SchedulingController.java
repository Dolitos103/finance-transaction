package com.finance.transaction.controller;

import com.finance.transaction.model.Person;
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

    @PostMapping("/createFinanceTransaction")
    public ResponseEntity<String> createFinanceTransaction(@RequestBody RequestTransfer requestTransfer) {
        validateValueAndRate.validateValueAndRate(requestTransfer);

        return new ResponseEntity<>("Objeto salvo com sucesso!", HttpStatus.CREATED);
    }

    @PostMapping("/createPerson")
    public ResponseEntity<String> createPerson(@RequestBody Person person) {
        // lógica para salvar a pessoa
        return ResponseEntity.ok("Person created successfully");
    }
}
