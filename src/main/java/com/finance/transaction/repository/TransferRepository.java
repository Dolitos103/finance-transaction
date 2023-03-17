package com.finance.transaction.repository;

import com.finance.transaction.model.TransferModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<TransferModel, Long> {

}
