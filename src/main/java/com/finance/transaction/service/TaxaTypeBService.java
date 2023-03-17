package com.finance.transaction.service;

import com.finance.transaction.model.TransferModel;

import java.time.temporal.ChronoUnit;

public class TaxaTypeBService implements TaxaService {

    @Override
    public TransferModel throughputCalculation(TransferModel transferModel) {
        double feeUpToTenDays = 12;
        long differenceDays = ChronoUnit.DAYS.between(transferModel.getDateTransfer(), transferModel.getDateScheduling());

        if (differenceDays != 0 && differenceDays <= 10) {
            transferModel.setValue(transferModel.getValue() + feeUpToTenDays);
        }
        return transferModel;
    }
}
