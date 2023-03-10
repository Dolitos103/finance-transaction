package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;
import com.finance.transaction.repository.TransferEntity;

public interface Taxa {

    public Transfer throughputCalculation(Transfer transfer);
}
