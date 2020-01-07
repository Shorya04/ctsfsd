package comm.example;



public class MyDay {
	public static void main(String[] args) {
		
		MyDay1 md=new MyDay1(Day.SUN);
		System.out.println("Today is: "+md.getDay().getDay()+" Day Number is: "+md.getDay().getDayNo());
		
	}

}
