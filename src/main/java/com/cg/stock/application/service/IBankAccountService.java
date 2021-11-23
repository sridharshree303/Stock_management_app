package com.cg.stock.application.service;

import java.util.List;

import com.cg.stock.application.dto.BankAccount;


public interface IBankAccountService {
	
	public BankAccount addBankAccount(BankAccount bankAccount);	
	public	List<BankAccount> getAllBankAccount();
	public	BankAccount getBankAccountDetails(long accountNo);
	public BankAccount updateBankAccountInfo(BankAccount info);
	public BankAccount deleteBankAccountInfo(long accountNo);
	
	
}
