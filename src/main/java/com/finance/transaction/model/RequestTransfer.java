package com.finance.transaction.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class RequestTransfer {

    String originAccount;
    String destinationAccount;
    double value;
    LocalDateTime dateTransfer;
    LocalDateTime dateScheduling;


}
