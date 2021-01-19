package com.createabsfactdemo;

import com.createabsfactdemo.bank.Bank;
import com.createabsfactdemo.bank.HDFCBank;
import com.createabsfactdemo.bank.ICICIBank;
import com.createabsfactdemo.bank.SBIBank;
import com.createabsfactdemo.loan.Loan;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		if(bank == null) {
			return null;
		}else if(bank.equalsIgnoreCase("SBI")) {
			return new SBIBank();
		}else if(bank.equalsIgnoreCase("ICICI")) {
			return new ICICIBank();
		}else if(bank.equalsIgnoreCase("HDFC")) {
			return new HDFCBank();
		}else {
			return null;
		}
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

}
