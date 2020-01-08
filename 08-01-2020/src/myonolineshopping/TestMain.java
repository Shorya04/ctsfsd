package myonolineshopping;

public class TestMain {
	
	public static void main(String[] args) {
		
		Product[] p=new Product[5];
		
		 p[0] = new TV(1000, "Samsung", "Black");
	        p[1] = new TV(2000, "Sony", "Blue");
	        p[2] = new DVDplayer(250, "Apple", "Blue");
	        p[3] = new Book(34, "ABC", 2002);
	        p[4] = new Book(15, "XYZ", 2006);
	        
	       double totalSalesPrice=0;
	       double totalRegularPrice=0;
	       
	       for(int i=0;i<p.length;i++) {
	    	   totalRegularPrice += p[i].getGetRegularPrice();
	    	   totalSalesPrice += p[i].computeSalesPrice();
	    	   
	    	   System.out.println("Item number " + i +
	                    ": Type = " + p[i].getClass().getName() +
	                    ", Regular price = " + p[i].getGetRegularPrice() +
	                    ", Sale price = " + p[i].computeSalesPrice());
	        }
	        System.out.println("TotalRegularPrice = " + totalRegularPrice);
	        System.out.println("TotalSalePrice = " + totalSalesPrice);
	    }
	    
	}
	       
	


