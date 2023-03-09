package com.finance.transaction.service;

import com.finance.transaction.model.RequestTransfer;
import com.finance.transaction.model.ResponseTransfer;
import com.finance.transaction.model.Transfer;

public class ValueTransferService implements IValidateValueAndRate {

    Taxa taxa;

    RequestTransferTotransferConverter requestTransferTotransferConverter;

    public ResponseTransfer validateValueAndRate(RequestTransfer requestTransfer){

        Transfer transfer = requestTransferTotransferConverter.convert(requestTransfer);
        taxa.throughputCalculation(transfer);

        ResponseTransfer responseTransfer = new ResponseTransfer();

        return responseTransfer;
    }
}
