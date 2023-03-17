package com.finance.transaction.service;

import com.finance.transaction.model.RequestTransfer;
import com.finance.transaction.model.ResponseTransfer;
import com.finance.transaction.model.Transfer;
import com.finance.transaction.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValueTransferService implements IValidateValueAndRate {

    @Autowired
    TransferRepository transferRepository;
    @Autowired
    RequestTransferToTransferConverter requestTransferToTransferConverter;

    public ResponseTransfer validateValueAndRate(RequestTransfer requestTransfer){

        Transfer transfer = requestTransferToTransferConverter.convert(requestTransfer);

        transferRepository.save(transfer);

        ResponseTransfer responseTransfer = new ResponseTransfer();
        responseTransfer.setResponse("success");
        return responseTransfer;
    }
}
