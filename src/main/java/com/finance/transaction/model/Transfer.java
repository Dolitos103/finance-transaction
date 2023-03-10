package com.finance.transaction.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Transfer {

    private String originAccount;

    private String destinationAccount;

    private double value;

    private LocalDateTime dateTransfer;

    private LocalDateTime dateScheduling;
}
