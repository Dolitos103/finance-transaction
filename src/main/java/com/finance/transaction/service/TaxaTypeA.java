package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;

import java.util.Objects;

public class TaxaTypeA implements Taxa {
    double RATE_OF_THREE_REAIS = 3;

    @Override
    public Transfer throughputCalculation(Transfer transfer) {

        if(Objects.equals(transfer.getDateTransfer(), transfer.getDateScheduling())){
            double ThreePercent = 0.03;
            double valuePlusThreePercent = transfer.getValue()*ThreePercent;
            transfer.setValue(transfer.getValue() + valuePlusThreePercent + RATE_OF_THREE_REAIS);
        }

        return transfer;
    }
}
