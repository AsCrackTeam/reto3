package com.g15.jpa.repository;


import com.g15.jpa.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jonat
 */
public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
