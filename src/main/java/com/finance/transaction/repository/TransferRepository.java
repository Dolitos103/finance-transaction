package com.finance.transaction.repository;

import com.finance.transaction.model.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {

    void saveAll(Transfer transferEntity);
}
