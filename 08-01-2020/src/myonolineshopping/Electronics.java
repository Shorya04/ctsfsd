package myonolineshopping;

public class Electronics extends Product implements ElectronicsInterface {
	
	private String manufacture;

	
	public Electronics(double getRegularPrice, String manufacture) {
		super(getRegularPrice);
		this.manufacture = manufacture;
	}

	@Override
	public String getManufacture() {
		// TODO Auto-generated method stub
		return manufacture;
	}

	@Override
	public void setManufacture() {
		this.manufacture=manufacture;
		
	}

}
