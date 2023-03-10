package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TaxaTypeC implements Taxa {
    @Override
    public Transfer throughputCalculation(Transfer transfer) {

        LocalDateTime currentDate = LocalDateTime.now();
        long differenceDays = ChronoUnit.DAYS.between(transfer.getDateScheduling(), currentDate);

        double rate;
        switch ((int) (differenceDays / 10)) {
            case 1:
                rate = 0.082; // 8.2%
                break;
            case 2:
                rate = 0.069; // 6.9%
                break;
            case 3:
                rate = 0.047; // 4.7%
                break;
            default:
                rate = 0.017; // 1.7%
                break;
        }

        transfer.setValue((int) (transfer.getValue() + transfer.getValue() * rate));

        return transfer;
    }
}
