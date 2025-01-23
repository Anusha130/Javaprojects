package com.task.service;

import java.util.List;

import com.task.dto.AccountDto;
import com.task.entity.Account;

public interface AccountService {

	AccountDto createAccount(AccountDto accountdto);
	
	AccountDto getAccountById(Long id);
	
	//List<AccountDto> getAll();

	//List<AccountDto> getAllaccounts();
}
