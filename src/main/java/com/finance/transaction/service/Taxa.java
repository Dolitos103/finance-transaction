package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;
import org.springframework.stereotype.Component;

public interface Taxa {

    public Transfer throughputCalculation(Transfer transfer);
}
