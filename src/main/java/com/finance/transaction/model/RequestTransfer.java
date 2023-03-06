package com.finance.transaction.model;

import lombok.Data;


import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
@Data
public class RequestTransfer {

    @NotBlank(message = "Origin Account cannot be blank")
    String originAccount;
    @NotBlank(message = "Destination Account cannot be blank")
    String destinationAccount;
    @NotBlank(message = "value cannot be blank")
    double value;
    @NotBlank(message = "Date Transfer cannot be blank")
    LocalDateTime dateTransfer;
    @NotBlank(message = "Date Scheduling cannot be blank")
    LocalDateTime dateScheduling;


}
