package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;

public interface IConsultFinanceTransaction {

    Transfer getFinanceTransactionById(Long id);

}
