package com.g15.jpa.repository;

import com.g15.jpa.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jonat
 */
public interface MessageRepository extends JpaRepository<Message, Long>{
    
}
