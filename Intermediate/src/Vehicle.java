
public abstract class Vehicle {

	String make;
	int year, reg;
	boolean isWorking;
	int fixprice;
	

	public Vehicle(int reg, String make, int year, boolean isWorking) {

		this.reg=reg;
		this.make = make;
		this.year = year;
		this.isWorking = isWorking;
	}

	public String toString() {
		return "Vehicle Registration: " + reg+ "\n Make: "+   make + " \n" + "year: " + year + " \n" + "isWorking: " + isWorking + "\n\n";
	}
}
