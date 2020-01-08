package myonolineshopping;

public class TV extends Electronics  {

	private String color;

	public TV(double getRegularPrice, String manufacture, String color) {
		super(getRegularPrice, manufacture);
		this.color = color;
	}
	
	public double computeSalesPrice() {
		return super.getGetRegularPrice() * 0.9;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
    
    	
    
}
