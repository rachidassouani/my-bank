package io.rachidassouani.mybank.dao;

import io.rachidassouani.mybank.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Long> {

}
