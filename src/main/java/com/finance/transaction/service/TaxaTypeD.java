package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;

public class TaxaTypeD implements Taxa {

    @Override
    public Transfer throughputCalculation(Transfer transfer) throws Exception {

        Taxa taxaA = new TaxaTypeA();
        Taxa taxaB = new TaxaTypeB();
        Taxa taxaC = new TaxaTypeC();

        if(transfer.getValue() == 1000){
            taxaA.throughputCalculation(transfer);
        }else if(transfer.getValue() >= 1001 && transfer.getValue() <= 2000) {
            taxaB.throughputCalculation(transfer);
        } else if (transfer.getValue() > 2000) {
            taxaC.throughputCalculation(transfer);
        }else{
            throw new Exception();
        }
        return transfer;
    }
}
