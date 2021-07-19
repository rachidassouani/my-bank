package io.rachidassouani.mybank.dao;

import io.rachidassouani.mybank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Long> {
}
