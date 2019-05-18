package factory;

import bank.Bank;
import loan.Loan;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}