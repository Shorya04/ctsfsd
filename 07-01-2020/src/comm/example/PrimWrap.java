package comm.example;

public class PrimWrap {

		
		private Integer wInt;
		private int pInt;
		public PrimWrap(Integer wInt, int pInt) {
			super();
			this.wInt = wInt;
			this.pInt = pInt;
		}
		@Override
		public String toString() {
			return "PrimWrap [wInt=" + wInt + ", pInt=" + pInt + "]";
		}
	
		public void display() {
			int tempP=wInt;
			Integer tempW=pInt;
			System.out.println(this);
			System.out.printf("After Auto boxing/unboxing: %d %d", wInt,pInt);
		

}
}