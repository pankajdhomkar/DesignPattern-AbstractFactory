package com.createabsfactdemo.bank;

public class SBIBank implements Bank{
	private final String BNAME;
	
	public SBIBank() {
		BNAME = "SBI BANK";
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}
}
