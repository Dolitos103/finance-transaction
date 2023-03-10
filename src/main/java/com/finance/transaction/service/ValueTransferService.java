package com.finance.transaction.service;

import com.finance.transaction.model.RequestTransfer;
import com.finance.transaction.model.ResponseTransfer;
import com.finance.transaction.model.Transfer;
import com.finance.transaction.repository.TransferEntity;
import org.springframework.stereotype.Service;

@Service
public class ValueTransferService implements IValidateValueAndRate {

    private Taxa taxa;

    private RequestTransferToTransferConverter requestTransferToTransferConverter;

    public ResponseTransfer validateValueAndRate(RequestTransfer requestTransfer){

        Transfer transfer = requestTransferToTransferConverter.convert(requestTransfer);
        taxa.throughputCalculation(transfer);

        ResponseTransfer responseTransfer = new ResponseTransfer();

        return responseTransfer;
    }
}
