package myonolineshopping;

public class DVDplayer extends Electronics {
	
	private String color;

	public DVDplayer(double getRegularPrice, String manufacture, String color) {
		super(getRegularPrice, manufacture);
		this.color = color;
	}
	
	public double computeSalesPrice() {
		return super.getGetRegularPrice() * 0.5;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
