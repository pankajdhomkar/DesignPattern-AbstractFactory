package com.createabsfactdemo.bank;

public class HDFCBank implements Bank{
	private final String BNAME;
	
	public HDFCBank() {
		BNAME = "HDFC BANK";
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}
}
