package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TaxaTypeC implements Taxa {
    @Override
    public Transfer throughputCalculation(Transfer transfer) {

        LocalDateTime currentDate = LocalDateTime.now();
        long differenceDays = ChronoUnit.DAYS.between(transfer.getDateScheduling(), currentDate);
        double rate = 0;

        if (differenceDays > 10 && differenceDays <= 20) {
            rate = 0.082; // 8.2%
        } else if (differenceDays > 20 && differenceDays <= 30) {
            rate = 0.069; // 6.9%
        } else if (differenceDays > 30 && differenceDays <= 40) {
            rate = 0.047; // 4.7%
        } else if (differenceDays > 40) {
            rate = 0.017; // 1.7%
        }

        transfer.setValue(transfer.getValue()+transfer.getValue()*rate);

        return transfer;
    }
}
