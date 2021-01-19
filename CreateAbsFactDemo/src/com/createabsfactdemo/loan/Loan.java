package com.createabsfactdemo.loan;

public abstract class Loan {
	protected double rate;

	public abstract void getIntrestRate(double rate);

	/*
	 * to calculate the monthly loan payment i.e. EMI   
              rate=annual interest rate/12*100; 
              n=number of monthly installments;            
              1year=12 months. 
              so, n=years*12; 
	 */
	public void calculateLoanPayment(double loanamount, int years) {
		double emi;
		int months;
		months = years * 12;
		
		rate = rate/ 1200;
		
		emi = (rate * Math.pow((1 + rate), months)) / ((Math.pow((1 + rate), months)) -1) * loanamount; 
		System.out.println("Your EMI is " + emi + " for the amount " + loanamount);
	}
}
