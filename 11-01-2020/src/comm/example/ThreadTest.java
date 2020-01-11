package comm.example;

public abstract class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ThreadExample ex=new ThreadExample();
			Thread t1=new Thread(ex);
			Thread t2=new Thread(ex);
			Thread t3=new Thread(ex);
			t1.start();
			t2.start();
			t3.start();
		}

	}


