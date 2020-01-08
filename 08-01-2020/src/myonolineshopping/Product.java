package myonolineshopping;

public class Product implements ProductInterface {
	 
	private double getRegularPrice;
	
	
	

	public Product(double getRegularPrice) {
		super();
		this.getRegularPrice = getRegularPrice;

	}
	

	@Override
	public double computeSalesPrice() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double getRegularPrice(double getPrice) {
		// TODO Auto-generated method stub
		return getRegularPrice;
	}


	@Override
	public double setRegularPrice() {
		// TODO Auto-generated method stub
		return this.getRegularPrice=getRegularPrice;
	}


	public double getGetRegularPrice() {
		return getRegularPrice;
	}


	public void setGetRegularPrice(double getRegularPrice) {
		this.getRegularPrice = getRegularPrice;
	}

}
