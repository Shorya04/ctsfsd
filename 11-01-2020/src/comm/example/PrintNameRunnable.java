package comm.example;

public class PrintNameRunnable implements Runnable {

	
	Thread thread;
	public PrintNameRunnable(String name) {
	thread= new Thread(this,name);
	thread.start();
	}
		// TODO Auto-generated constructor stub
	
	@Override
	public void run() {
		String name=thread.getName();
		for(int i=0;i<20;i++) {
			System.out.println(name);
			System.out.println(thread.getName());
		}
		
	}

}
