package myonolineshopping;

public class Book extends Product {
	
	private String publisher;
	private int yearPublished;
	
	public Book(double getRegularPrice, String publisher, int yearPublished) {
		super(getRegularPrice);
		this.publisher = publisher;
		this.yearPublished = yearPublished;
	}
	
	
	
	public double computeSalesPrice() {
		return super.getGetRegularPrice() * 0.2;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public int getYearPublished() {
		return yearPublished;
	}



	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
}
