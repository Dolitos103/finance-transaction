package com.finance.transaction.service;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.finance.transaction.model.RequestTransfer;
import com.finance.transaction.model.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

@Component
public class RequestTransferToTransferConverter implements Converter<RequestTransfer, Transfer> {

    @Override
    public Transfer convert(RequestTransfer requestTransfer) {
        Transfer transfer = new Transfer();
        transfer.setOriginAccount(requestTransfer.getOriginAccount());
        transfer.setDestinationAccount(requestTransfer.getDestinationAccount());
        transfer.setValue(requestTransfer.getValue());
        transfer.setDateTransfer(requestTransfer.getDateTransfer());
        transfer.setDateScheduling(requestTransfer.getDateScheduling());
        Taxa taxaA = new TaxaTypeA();
        Taxa taxaB = new TaxaTypeB();
        Taxa taxaC = new TaxaTypeC();
        taxaA.throughputCalculation(transfer);
        taxaB.throughputCalculation(transfer);
        taxaC.throughputCalculation(transfer);
        return transfer;

    }

    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        return null;
    }

    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        return null;
    }
}
