package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.createabsfactdemo.AbstractFactory;
import com.createabsfactdemo.FactoryCreator;
import com.createabsfactdemo.bank.Bank;
import com.createabsfactdemo.loan.Loan;

public class Driver {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

		System.out.print("Enter the name of Bank from where you want to take loan amount: ");  

		try {
			String bankName = br.readLine();

			System.out.print("\n");  
			System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");  

			String loanName=br.readLine();  
			AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
			Bank b=bankFactory.getBank(bankName);

			System.out.print("\n");  
			System.out.print("Enter the interest rate for "+b.getBankName()+ ": ");  

			double rate=Double.parseDouble(br.readLine());  
			System.out.print("\n");  
			System.out.print("Enter the loan amount you want to take: ");  

			double loanAmount=Double.parseDouble(br.readLine());  
			System.out.print("\n");  
			System.out.print("Enter the number of years to pay your entire loan amount: ");  
			int years=Integer.parseInt(br.readLine());  

			System.out.print("\n");  
			System.out.println("you are taking the loan from "+ b.getBankName());  

			AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
			Loan l=loanFactory.getLoan(loanName);  
			l.getIntrestRate(rate);  
			l.calculateLoanPayment(loanAmount,years);  
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
