import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
	double[] costList = new double[100];

	public void addToList(Vehicle i) {

		vList.add(i);

	}

	public void printVList() {

		for (int i = 0; i < vList.size(); i++) {
			System.out.println(vList.get(i));

		}
	}

	public void calCost() {
		double fixCost = 0;

		for (int i = 0; i < vList.size(); i++) {

			if (vList.get(i).isWorking == false) {

				if (vList.get(i) instanceof Car) {
					fixCost = (2017 - vList.get(i).year) * 40;
				} else if (vList.get(i) instanceof Motorcycle) {
					fixCost = (2017 - vList.get(i).year) * 20;
				} else if (vList.get(i) instanceof Bicycle) {
					fixCost = (2017 - vList.get(i).year + 5) * 5;
				}
				costList[i] = fixCost;
			}
			if (costList[i] != 0) {
				System.out.println(vList.get(i).make + " " + vList.get(i).year + " fixing cost is " + costList[i]);
			}
		}
		System.out.println("\n");
	}

	public void removeVehicle(int r) {
		
	for(int i=0;i<vList.size();i++){
		
		if(vList.get(i).reg==r){
			System.out.println("\n ** " + vList.get(i).make + " with registration number " + r + " is deleted***\n");
			vList.remove(i);
			
		}

		
		
	}
		
	}

}
