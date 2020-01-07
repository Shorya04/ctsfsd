package comm.example;

public class WaterBus extends Transport{
	
	private double distanceCov=0;
	private double fuelConsumed=0;
	private double fuelEfficiency=0;
	public WaterBus(double startingPoint, double finalPoint, double initialFuel, double fuelLeft) {
		setStartingPoint(startingPoint);
		setFinalPoint(finalPoint);
		setInitialFuel(initialFuel);
		setFuelLeft(fuelLeft);
		
	}
	@Override
	public void calculateDistance() {
		distanceCov=getFinalPoint()-getStartingPoint();
		System.out.println("Distance Covered by WaterBus: "+distanceCov);
		
	}



	@Override
	public void calculateFuelEfficiency() {
		
		fuelConsumed=getInitialFuel()-getFuelLeft();
		fuelEfficiency=distanceCov/fuelConsumed;
		System.out.println("Fuel Consumed by Water Bus: "+fuelConsumed);
	}
	
	
	
	}



