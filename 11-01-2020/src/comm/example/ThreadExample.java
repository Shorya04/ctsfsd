package comm.example;

public class ThreadExample implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(i+" ");
		}
	}
}



















