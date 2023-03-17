package com.finance.transaction.service;

import com.finance.transaction.converter.RequestTransferToTransferConverter;
import com.finance.transaction.model.RequestTransferModel;
import com.finance.transaction.model.ResponseTransferModel;
import com.finance.transaction.model.TransferModel;
import com.finance.transaction.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValueTransferService implements IValidateValueAndRateService {

    @Autowired
    TransferRepository transferRepository;
    @Autowired
    RequestTransferToTransferConverter requestTransferToTransferConverter;

    public ResponseTransferModel validateValueAndRate(RequestTransferModel requestTransfer){

        TransferModel transferModel = requestTransferToTransferConverter.convert(requestTransfer);

        transferRepository.save(transferModel);

        ResponseTransferModel responseTransferModel = new ResponseTransferModel();
        responseTransferModel.setResponse("success");
        return responseTransferModel;
    }
}
