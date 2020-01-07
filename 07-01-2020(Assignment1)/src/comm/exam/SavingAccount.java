package comm.exam;

public class SavingAccount {

	private Float rateOfInterest;
	private Double amount;
	
	
	public SavingAccount(Float rateOfInterest, Double amount) {
		super();
		this.rateOfInterest = rateOfInterest;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "SavingAccount [rateOfInterest=" + rateOfInterest + ", amount=" + amount + "]";
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void display() {
		System.out.println(this);

	}
	
	
}
