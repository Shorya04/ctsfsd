package comm.example;

public class StaticExample {

	
	private static Integer count=0;
	private String temp;
	private final int MAX; 
	
	class InnerCounter{
		public void add(int a ,int b)
		{
			System.out.println("\n"+(a+b));
		}
	}
	

	public StaticExample() {
		super();
		MAX=1000;
	}
	static{
		count=0;
	}
	


	public StaticExample(String temp) {
		super();
		this.temp = temp;
		count++;
		MAX = 100;
	}



	@Override
	public String toString() {
		return "Count of objects is: "+temp+count;
	}
	
	public static String display() {
		return count.toString();
	}
	public void displayMAX() {
		System.out.println(MAX);
	}
}
