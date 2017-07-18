import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> vList = new ArrayList<Vehicle>();

	public void addToList(Vehicle i) {

		vList.add(i);

	}

	public void printVList() {

		for (int i = 0; i < vList.size(); i++) {
			System.out.println(vList.get(i));

		}
	}

	public void calCost() {


		for (int i = 0; i < vList.size(); i++) {

			if (vList.get(i).isWorking == false) {

				if (vList.get(i) instanceof Car) {
					vList.get(i).fixprice = (2017 - vList.get(i).year) * 40;
				} else if (vList.get(i) instanceof Motorcycle) {
					vList.get(i).fixprice = (2017 - vList.get(i).year) * 20;
				} else if (vList.get(i) instanceof Bicycle) {
					vList.get(i).fixprice = (2017 - vList.get(i).year + 5) * 5;
				}
				
			}
			
				System.out.println(vList.get(i).make + " " + vList.get(i).year + " fixing cost is " + vList.get(i).fixprice);
			
		}
		System.out.println("\n");
	}

	public void removeVehicle(int r) {

		for (int i = 0; i < vList.size(); i++) {

			if (vList.get(i).reg == r) {
				System.out
						.println("\n ** " + vList.get(i).make + " with registration number " + r + " is deleted***\n");
				vList.remove(i);

			}

		}

	}

}
