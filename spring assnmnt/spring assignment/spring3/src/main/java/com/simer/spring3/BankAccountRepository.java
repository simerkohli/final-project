package com.simer.spring3;

public interface BankAccountRepository {

	public double getBalance(long accountId);
	public double updateBalance(long accountId,double accountBalance);
}
