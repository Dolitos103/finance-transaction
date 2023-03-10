package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;
import com.finance.transaction.repository.TransferEntity;

import java.time.temporal.ChronoUnit;

public class TaxaTypeB implements Taxa {

    double FEE_UP_TO_TEN_DAYS = 12;

    @Override
    public Transfer throughputCalculation(Transfer transfer) {

        long differenceDays = ChronoUnit.DAYS.between(transfer.getDateTransfer(), transfer.getDateScheduling());

        if (differenceDays <= 10) {
            transfer.setValue(transfer.getValue() + FEE_UP_TO_TEN_DAYS);
        }

        return transfer;
    }
}
