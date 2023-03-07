package com.finance.transaction.model;

import lombok.Data;


import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
@Data
public class RequestTransfer {

    String originAccount;
    String destinationAccount;
    double value;
    String dateTransfer;
    String dateScheduling;


}
