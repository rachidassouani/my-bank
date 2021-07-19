package io.rachidassouani.mybank.dao;

import io.rachidassouani.mybank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDao extends JpaRepository<Transaction, Long> {
}
