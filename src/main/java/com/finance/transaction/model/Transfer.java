package com.finance.transaction.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Transfer {

    String originAccount;
    String destinationAccount;
    Integer value;
    LocalDateTime dateTransfer;
    LocalDateTime dateScheduling;


}
