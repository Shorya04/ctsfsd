package comm.example;

public abstract class Transport {

	public abstract void  calculateDistance();
	public abstract void calculateFuelEfficiency();
	
	private double startingPoint;
	private double finalPoint;
	private double initialFuel;
	private double fuelLeft;
	
	
	
	public double getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(double startingPoint) {
		this.startingPoint = startingPoint;
	}
	public double getFinalPoint() {
		return finalPoint;
	}
	public void setFinalPoint(double finalPoint) {
		this.finalPoint = finalPoint;
	}
	public double getInitialFuel() {
		return initialFuel;
	}
	public void setInitialFuel(double initialFuel) {
		this.initialFuel = initialFuel;
	}
	public double getFuelLeft() {
		return fuelLeft;
	}
	public void setFuelLeft(double fuelLeft) {
		this.fuelLeft = fuelLeft;
	}
		
	
	}

