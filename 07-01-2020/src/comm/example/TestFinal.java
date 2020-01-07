package comm.example;

public class TestFinal {
	public static void main( String[] args) {
		
		StaticExample s=new StaticExample();
		StaticExample.InnerCounter i=s.new InnerCounter();
		i.add(10,50);
		s.displayMAX();
		
	}

}
