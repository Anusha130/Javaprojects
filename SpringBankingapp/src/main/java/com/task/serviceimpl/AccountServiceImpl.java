package com.task.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.Mapper.AccountMapper;
import com.task.dto.AccountDto;
import com.task.entity.Account;
import com.task.repository.AccountRepository;
import com.task.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public AccountDto createAccount(AccountDto accountdto) {
		Account account  = AccountMapper.mapToAccount(accountdto);
		Account savedAccount = accountRepository.save(account);
		// TODO Auto-generated method stub
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccountById(Long id) {
		// TODO Auto-generated method stub
	Account account =accountRepository.findById(id).get();
				
		return AccountMapper.mapToAccountDto(account);
	}

	

	

	
}
