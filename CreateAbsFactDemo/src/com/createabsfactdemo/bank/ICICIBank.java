package com.createabsfactdemo.bank;

public class ICICIBank implements Bank{
	private final String BNAME;
	
	public ICICIBank() {
		BNAME = "ICICI BANK";
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}
	
}
