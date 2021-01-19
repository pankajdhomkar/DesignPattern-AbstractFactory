package com.createabsfactdemo;

import com.createabsfactdemo.bank.Bank;
import com.createabsfactdemo.loan.Loan;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);  
	public abstract Loan getLoan(String loan);  
}
