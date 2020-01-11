package comm.example;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Thread t1=new SimpleThread("BOSTON");
		t1.start();
		t1.setPriority(1);
		Thread t2=new SimpleThread("REVIN");
		t2.start();
		t2.setPriority(2);
		Thread t3=new SimpleThread("STEVEN");
		t3.start();
		t3.setPriority(3);
	}

}
