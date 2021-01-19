package com.createabsfactdemo;

import com.createabsfactdemo.bank.Bank;
import com.createabsfactdemo.loan.BusinessLoan;
import com.createabsfactdemo.loan.EducationLoan;
import com.createabsfactdemo.loan.HomeLoan;
import com.createabsfactdemo.loan.Loan;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		if(loan == null) {
			return null;
		}else if(loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		}else if(loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}else if(loan.equalsIgnoreCase("Business")) {
			return new BusinessLoan();
		}else {
			return null;
		}
	}

}
