package myonolineshopping;

public class ExceptionExample {
	
		public void calculate(String a) throws ArithmeticException, NumberFormatException
		{
			System.out.println();
			System.out.println(Integer.parseInt(a)/0);
		}
		public static void main(String[] args) {
			
			ExceptionExample ex=new ExceptionExample();
	try {
		ex.calculate(args[0]);
	} catch (Exception e) {
		System.err.println(e.toString());
		e.printStackTrace();
		
	}
		
	}

}
