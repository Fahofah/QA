
public class Car extends Vehicle {

	String fuelType;
	double fuelEff;

	public Car(int reg, String make, int year, boolean isWorking, String fuelType, double fuelEff) {
		super(reg, make, year, isWorking);
		this.fuelType = fuelType;
		this.fuelEff = fuelEff;

	}

	public String toString() {
		return "Vehicle Registration: " + reg+"\nMake: " + make + " \n" + "year: " + year + " \n" + "isWorking: " + isWorking + "\nFuel Type:" + fuelType
				+ "\nFuel Efficiency" + fuelEff + "" + "\n\n";
	}

}
