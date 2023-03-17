package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;

import java.util.Objects;

public class TaxaTypeA implements Taxa {

    @Override
    public Transfer throughputCalculation(Transfer transfer) {

        if(Objects.equals(transfer.getDateTransfer(), transfer.getDateScheduling())){
            double threePercent = 0.03;
            int rateValue = 3;
            double valuePlusThreePercent = transfer.getValue()*threePercent;
            transfer.setValue(transfer.getValue() + valuePlusThreePercent + rateValue);
        }
        return transfer;
    }
}
