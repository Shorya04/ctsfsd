package comm.example;

public class ThreadGroupTest {

	public static void main(String[] args){
		/*new NewSimpleThread("Shorya").start();
		new NewSimpleThread("Gillo").start();
		new NewSimpleThread("Anshu").start();
		
		ThreadGroup gp=Thread.currentThread().getThreadGroup();
		System.out.println("Number of active threads groups: "+gp.activeCount());
       
	
	Thread[] trray=new Thread[20];
	int actualSize=gp.enumerate(trray);
	for(int i=0;i<actualSize;i++) {
		System.out.println("Thread "+trray[i].getName()+ " in thread group "+gp.getName());
	}*/
	ThreadGroup normal=new ThreadGroup("A group with normal priority");
	ThreadGroup min=new ThreadGroup("A group with minimum priority");
	ThreadGroup max=new ThreadGroup("A group with maximum priority");
		
	normal.setMaxPriority(Thread.NORM_PRIORITY);
	max.setMaxPriority(Thread.MAX_PRIORITY);
	min.setMaxPriority(Thread.MIN_PRIORITY);
	
	
	System.out.format("Group's maximum priority = %d%n",max.getMaxPriority());
	System.out.format("Group's minimun priority = %d%n",min.getMaxPriority());
	System.out.format("Group's with normal priority = %d%n",normal.getMaxPriority());
	}
}

