package com.finance.transaction.service;

import com.finance.transaction.model.RequestTransfer;
import com.finance.transaction.model.ResponseTransfer;

public interface IValidateValueAndRate {

     ResponseTransfer validateValueAndRate(RequestTransfer requestTransfer);
}
