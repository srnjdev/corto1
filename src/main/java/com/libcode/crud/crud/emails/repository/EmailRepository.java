package com.libcode.crud.crud.emails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libcode.crud.crud.emails.entities.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email,Long>{
    Email findByEmail(String email);

}
