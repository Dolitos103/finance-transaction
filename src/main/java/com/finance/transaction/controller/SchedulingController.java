package com.finance.transaction.controller;

import com.finance.transaction.model.Transfer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SchedulingController {

    @GetMapping("/mensagem")
    public String exibirMensagem() {
        return "Olá, mundo!";
    }

    @PostMapping("/salvar")
    public ResponseEntity<String> salvar(@RequestBody Transfer transfer) {
        // Lógica para salvar o objeto no banco de dados
        return new ResponseEntity<>("Objeto salvo com sucesso!", HttpStatus.CREATED);
    }
}
