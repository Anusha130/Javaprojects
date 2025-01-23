package com.task.Mapper;

import com.task.dto.AccountDto;
import com.task.entity.Account;

public class AccountMapper {

	
	public static Account mapToAccount(AccountDto accountdto) {
		Account account = new Account(accountdto.getId(),
				accountdto.getAccountHolderName(),
				accountdto.getBalance());
	
	return account;
	}
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountdto = new AccountDto(account.getId(),
				account.getAccountHoldername(),
				account.getBalance());
	
	return accountdto;
	}
}

