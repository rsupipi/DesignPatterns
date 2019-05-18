package bank;

public class NSB implements Bank {
	private final String BNAME;

	public NSB() {
		BNAME = "NSB BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}