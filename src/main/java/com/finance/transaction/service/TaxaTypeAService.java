package com.finance.transaction.service;

import com.finance.transaction.model.TransferModel;

import java.util.Objects;

public class TaxaTypeAService implements TaxaService {

    @Override
    public TransferModel throughputCalculation(TransferModel transferModel) {

        if(Objects.equals(transferModel.getDateTransfer(), transferModel.getDateScheduling())){
            double threePercent = 0.03;
            int rateValue = 3;
            double valuePlusThreePercent = transferModel.getValue()*threePercent;
            transferModel.setValue(transferModel.getValue() + valuePlusThreePercent + rateValue);
        }
        return transferModel;
    }
}
