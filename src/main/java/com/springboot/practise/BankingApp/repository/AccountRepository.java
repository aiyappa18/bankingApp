package com.springboot.practise.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.practise.BankingApp.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
