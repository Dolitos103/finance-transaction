package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;
import com.finance.transaction.repository.TransferEntity;

public class TaxaTypeD implements Taxa {

    TaxaTypeA taxaTypeA;
    TaxaTypeB taxaTypeB;
    TaxaTypeC taxaTypeC;

    @Override
    public Transfer throughputCalculation(Transfer transfer) {
        if(transfer.getValue() <= 1000){
            taxaTypeA.throughputCalculation(transfer);
        }else if(transfer.getValue() >= 1001 && transfer.getValue() <= 2000) {
            taxaTypeB.throughputCalculation(transfer);
        } else if (transfer.getValue() > 2000) {
            taxaTypeC.throughputCalculation(transfer);
        }else{
            System.out.println("Erro ao tentar pegar taxa de juros");
        }

        return transfer;
    }
}
