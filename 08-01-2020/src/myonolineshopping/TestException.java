package myonolineshopping;

public class TestException {

	public static void main(String[] argv) {
		new TestException().doTheWork();
	}
		public void doTheWork() {
			Object o = null;
	        
	        for (int i=0; i<5; i++) {
	            try {
	                o = makeObj(i);
	            } catch (IllegalArgumentException e) {
	            	e.printStackTrace();
	                System.err.println("IllegalArgumentException is caught: (" + e.getMessage() + ").");
	                return;    // cut off println below if makeObj failed.
	        }
	            System.out.println(o); 
	        }
		}
		
	            
	            public Object makeObj(int type) throws IllegalArgumentException {
	                if (type == 0)  // detects an error...
	                    throw new IllegalArgumentException("Don't like type " + type);
	                return new Object();
	}

}
