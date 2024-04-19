package com.springboot.practise.BankingApp.mapper;

import com.springboot.practise.BankingApp.DTO.AccountDto;
import com.springboot.practise.BankingApp.entities.Account;

public class AccountMapper {

	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(accountDto.getId(), accountDto.getAccountHolderName(), accountDto.getBalance());
		return account;

	}

	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(account.getId(), account.getAccountHolderName(), account.getBalance());
		return accountDto;

	}
}
