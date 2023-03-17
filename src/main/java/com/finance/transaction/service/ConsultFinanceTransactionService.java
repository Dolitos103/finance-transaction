package com.finance.transaction.service;

import com.finance.transaction.model.TransferModel;
import com.finance.transaction.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class ConsultFinanceTransactionService implements IConsultFinanceTransactionService {

    @Autowired
    TransferRepository transferRepository;

    public TransferModel getFinanceTransactionById(Long id){
        return transferRepository.findById(id).orElse(null);
    }

}
