package plans;

public abstract class Plan {
	protected int rate;

	public abstract void getRate();

	public void calculateBill(int units) {
		getRate();
		System.out.println("Rate: " + rate);
		System.out.println("Bill: " + units * rate);
	}
}
