package comm.example;

public class FinalCalculation {
	
	public static void main(String[] args) {
		
		
		Transport t=new Truck(201,303,110,65);
		t.calculateDistance();
		t.calculateFuelEfficiency();
		Transport w=new WaterBus(200,300,50,25);
		w.calculateDistance();
		w.calculateFuelEfficiency();
	}

}
