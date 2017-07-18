import java.util.ArrayList;

public class Intermediate {

	public static void main(String[] args) {
		int int1 = 12;
		int int2 = 5;
		int int3 = 1;
		int result;
		int temp = 92;
		boolean isSummer = false;

		// Blackjack
		result = Intermediate.blackjack(int1, int2);
		if (result == 999) {
			System.out.println("Invaild Cards in Deck!");
		} else if (result == 0) {
			System.out.println("Casino takes all!");
		} else
			System.out.println("...and the winner is " + result + " !");

		// Unique Sum
		System.out.println("The unique sum is " + Intermediate.uniqueSum(int1, int2, int3));

		// Too Hot?
		System.out.println(Intermediate.tooHot(temp, isSummer));

		// People
		People p1 = new People("Faho Fahfah", 27, "Fridge Manager");
		People p2 = new People("Labada lublub", 1546, "Spaceship Engine Technician");
		People p3 = new People("Maria Kozalis", 32, "Botanician");

		ArrayList<People> pList = new ArrayList<People>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);

		for (People i : pList) {
			System.out.println(i);
		}

		// Garage Car(String make, int year, boolean isWorking)
		Car c1 = new Car(1,"Ford", 1976, false, "diesel", 0.42);
		Motorcycle m1 = new Motorcycle(2,"Suzuki", 2001, true, true);
		Bicycle b1 = new Bicycle(3, "Corerra", 2017, false, false);

		Garage g1 = new Garage();
		g1.addToList(c1);
		g1.addToList(m1);
		g1.addToList(b1);

		g1.printVList();
		g1.calCost();
		//g1.removeVehicle(1);
		//g1.printVList();
		
		//Paint Wizard (int capacity, int price, int coverage)
		Paint c = new Paint("CheapoMax",20,19.99,10);
		Paint a = new Paint("AverageJoes",15,17.99,11);
		Paint d = new Paint("DuluxourousPaints",10,25,20);
		
		Room r1 = new Room(2.3,4,5);
		
		PaintWizard pw = new PaintWizard();
		
		pw.addToWizard(c);
		pw.addToWizard(a);
		pw.addToWizard(d);
		
		pw.minWaste();
		r1.getPaintArea();
		pw.selectCheapest(r1.area);
		
	}

	public static int blackjack(int handA, int handB) {
		if (handA > 0 && handB > 0) {
			int checkA;
			int checkB;

			checkA = 21 - handA;
			checkB = 21 - handB;

			if (checkA < 0 && checkB < 0) { // both blow
				return 0;
			} else if (checkB < 0 && checkA >= 0) { // A valid B blow
				return handA;
			} else if (checkA < 0 && checkB >= 0) { // B valid A blow
				return handB;
			} else if (checkA >= 0 && checkB >= 0) { // both valid
				if (checkA < checkB) { // A wins
					return handA;
				} else if (checkB < checkA) { // B wins
					return handB;
				}
			}
		}
		return 999;

	}

	public static int uniqueSum(int int1, int int2, int int3) {
		int sum;
		if (int1 == int2 & int2 == int3) {
			sum = 0;
		} else if (int2 == int3) {
			int2 = 0;
			sum = int1 + int2 + int3;
		} else if (int1 == int2 | int1 == int3) {
			int1 = 0;
			sum = int1 + int2 + int3;
		} else {
			sum = int1 + int2 + int3;
		}
		return sum;
	}

	public static boolean tooHot(int temp, boolean isSummer) {
		int tHi = 90;
		int tLo = 60;

		if (isSummer) {
			tHi = 100;
		}

		if (temp >= tLo & temp <= tHi) {
			return true;
		} else {
			return false;
		}
	}

}
