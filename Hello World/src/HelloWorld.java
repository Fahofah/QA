
public class HelloWorld {

	public static void main(String[] args) {
		// Basics

		int sumA = 2;
		int sumB = 9;
		boolean selectSum = false;
		int[] numSet = { 1, 3, 4, 7, 8, 11, 14, 17, 16, 21 }; // 9
		int[] numSet2 = new int[10];

		System.out.println("Aloha World!"); // 1

		String helloWorld = "Hello World!"; // 2
		System.out.println(helloWorld); // 2

		HelloWorld.printIt(helloWorld); // 3

		System.out.println(HelloWorld.getHello()); // 4

		System.out.println(HelloWorld.sumIt(sumA, sumB, selectSum)); // 5&6&7

		for (int i = 0; i < 10; i++) { // 8
			System.out.println(HelloWorld.sumIt(i, sumB, selectSum));
		}

		System.out.println(HelloWorld.sumIt(numSet[4], numSet[9], selectSum)); // 9

		for (int i = 1; i < 9; i++) { // 8
			System.out.println(HelloWorld.sumIt(numSet[i - 1], numSet[i + 1], selectSum)); // 10
		}

		for (int i = 0; i < 10; i++) { // 11
			numSet2[i] = i;
			System.out.println(numSet2[i]);
		}

		for (int i = 0; i < 10; i++) { // 11
			numSet2[i] = numSet2[i] * 10;
			System.out.println(numSet2[i]);
		}

	}

	static public void printIt(String toPrint) { // 3

		System.out.println(toPrint);
	}

	static public String getHello() { // 4

		String sendHello = "Hello World!";
		return sendHello;
	}

	static public int sumIt(int a, int b, boolean choice) { // 5&6&7
		int result = 0;

		if (a == 0 | b == 0) {
			if (a == 0) {
				return b;
			} else {
				return a;
			}
		} else {

			if (choice == true) {
				result = a + b;

			} else if (choice == false) {
				result = a * b;
			}
			return result;
		}
	}
}
