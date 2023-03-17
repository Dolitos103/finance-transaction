package com.finance.transaction.converter;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.finance.transaction.model.RequestTransferModel;
import com.finance.transaction.model.TransferModel;
import com.finance.transaction.service.TaxaService;
import com.finance.transaction.service.TaxaTypeAService;
import com.finance.transaction.service.TaxaTypeBService;
import com.finance.transaction.service.TaxaTypeCService;
import org.springframework.stereotype.Component;

@Component
public class RequestTransferToTransferConverter implements Converter<RequestTransferModel, TransferModel> {

    @Override
    public TransferModel convert(RequestTransferModel requestTransfer) {
        TransferModel transferModel = new TransferModel();
        transferModel.setOriginAccount(requestTransfer.getOriginAccount());
        transferModel.setDestinationAccount(requestTransfer.getDestinationAccount());
        transferModel.setValue(requestTransfer.getValue());
        transferModel.setDateTransfer(requestTransfer.getDateTransfer());
        transferModel.setDateScheduling(requestTransfer.getDateScheduling());
        TaxaService taxaServiceA = new TaxaTypeAService();
        TaxaService taxaServiceB = new TaxaTypeBService();
        TaxaService taxaServiceC = new TaxaTypeCService();
        taxaServiceA.throughputCalculation(transferModel);
        taxaServiceB.throughputCalculation(transferModel);
        taxaServiceC.throughputCalculation(transferModel);
        return transferModel;

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
