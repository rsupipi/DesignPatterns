package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bank.Bank;
import factory.AbstractFactory;
import factory.FactoryCreator;
import loan.Loan;

public class App {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the name of Bank: ");
		String bankName = br.readLine();
		System.out.print("\n");
		
		System.out.print("Enter the type of loan: ");
		String loanName = br.readLine();
		
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);
		System.out.print("\n");
		System.out.print("Enter the interest rate for " + b.getBankName() + ": ");

		double rate = Double.parseDouble(br.readLine());
		System.out.print("\n");
		System.out.print("Enter the loan amount you want to take: ");

		double loanAmount = Double.parseDouble(br.readLine());
		System.out.print("\n");
		System.out.print("Enter the number of years to pay your entire loan amount: ");
		int years = Integer.parseInt(br.readLine());

		System.out.print("\n");
		System.out.println("you are taking the loan from " + b.getBankName());

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);
	}
}