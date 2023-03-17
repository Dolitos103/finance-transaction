package com.finance.transaction.service;

import com.finance.transaction.model.TransferModel;

public class TaxaTypeDService implements TaxaService {

    @Override
    public TransferModel throughputCalculation(TransferModel transferModel) {

        TaxaService taxaServiceA = new TaxaTypeAService();
        TaxaService taxaServiceB = new TaxaTypeBService();
        TaxaService taxaServiceC = new TaxaTypeCService();

        if(transferModel.getValue() == 1000){
            taxaServiceA.throughputCalculation(transferModel);
        }else if(transferModel.getValue() >= 1001 && transferModel.getValue() <= 2000) {
            taxaServiceB.throughputCalculation(transferModel);
        } else if (transferModel.getValue() > 2000) {
            taxaServiceC.throughputCalculation(transferModel);
        }else{
            System.out.println("ocorreu um erro");
        }
        return transferModel;
    }
}
