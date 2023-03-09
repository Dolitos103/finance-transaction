package com.finance.transaction.service;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.finance.transaction.model.RequestTransfer;
import com.finance.transaction.model.Transfer;

import java.time.LocalDateTime;

public class RequestTransferTotransferConverter implements Converter<RequestTransfer, Transfer> {
    @Override
    public Transfer convert(RequestTransfer requestTransfer) {
        Transfer transfer = new Transfer();
        transfer.setOriginAccount(requestTransfer.getOriginAccount());
        transfer.setDestinationAccount(requestTransfer.getDestinationAccount());
        transfer.setValue(requestTransfer.getValue());
        transfer.setDateTransfer(LocalDateTime.parse(requestTransfer.getDateTransfer()));
        transfer.setDateScheduling(LocalDateTime.parse(requestTransfer.getDateScheduling()));

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
