package com.finance.transaction.service;

import com.finance.transaction.model.ResponseTransfer;
import com.finance.transaction.model.Transfer;

public interface IValidateValueAndRate {

     ResponseTransfer validateValueAndRate(Transfer transfer);
}
