
public class Motorcycle extends Vehicle {

	boolean eqReady;

	public Motorcycle(int reg, String make, int year, boolean isWorking, boolean eqReady) {
		super(reg, make, year, isWorking);
		this.eqReady = eqReady;
	}

	public String toString() {
		return "Vehicle Registration: " + reg+"\nMake: " + make + " \n" + "year: " + year + " \n" + "isWorking: " + isWorking + "\nEquipment Ready:"
				+ eqReady + "\n\n";
	}
}
