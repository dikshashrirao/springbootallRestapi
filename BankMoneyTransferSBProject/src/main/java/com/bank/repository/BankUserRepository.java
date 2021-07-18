package com.bank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.User;

@Repository
public interface BankUserRepository extends JpaRepository<User, Integer>{

	User getUserByUnAndPs(String un, String ps);

	User save(Optional<User> u1);
  
}
