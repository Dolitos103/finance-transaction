package com.finance.transaction.service;

import com.finance.transaction.model.TransferModel;

public interface IConsultFinanceTransactionService {

    TransferModel getFinanceTransactionById(Long id);

}
