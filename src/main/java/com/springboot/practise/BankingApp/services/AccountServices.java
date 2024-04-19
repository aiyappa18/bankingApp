package com.springboot.practise.BankingApp.services;

import java.util.List;

import com.springboot.practise.BankingApp.DTO.AccountDto;

public interface AccountServices {

	AccountDto createAccount(AccountDto account);

	AccountDto getAccountByID(Long id);

	AccountDto deposit(Long id, double amount);

	AccountDto withdraw(Long id, double amount);

	List<AccountDto> getAllAccounts();

	void deleteAccount(Long id);
}
