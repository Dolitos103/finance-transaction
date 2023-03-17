package com.finance.transaction.service;

import com.finance.transaction.model.Transfer;
import com.finance.transaction.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class ConsultFinanceTransaction implements IConsultFinanceTransaction {

    @Autowired
    TransferRepository transferRepository;

    public Transfer getFinanceTransactionById(Long id){
        return transferRepository.findById(id).orElse(null);
    }

}
