package com.finance.transaction.service;

import com.finance.transaction.model.RequestTransferModel;
import com.finance.transaction.model.ResponseTransferModel;

public interface IValidateValueAndRateService {

     ResponseTransferModel validateValueAndRate(RequestTransferModel requestTransfer);
}
