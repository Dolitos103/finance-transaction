package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;

import java.time.temporal.ChronoUnit;

public class TaxaTypeB implements Taxa {

    @Override
    public Transfer throughputCalculation(Transfer transfer) {
        double feeUpToTenDays = 12;
        long differenceDays = ChronoUnit.DAYS.between(transfer.getDateTransfer(), transfer.getDateScheduling());

        if (differenceDays != 0 && differenceDays <= 10) {
            transfer.setValue(transfer.getValue() + feeUpToTenDays);
        }
        return transfer;
    }
}
