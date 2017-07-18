import java.util.ArrayList;

public class PaintWizard {
	ArrayList<Paint> pList = new ArrayList<Paint>();

	public void addToWizard(Paint a) {

		pList.add(a);
	}

	public void minWaste() {
		int temp;
		int lwTag = 0;

		temp = pList.get(0).coverage;

		for (int i = 1; i < pList.size(); i++) {
			if (pList.get(i).coverage > temp) {
				temp = pList.get(i).coverage;
				lwTag = i;
			}

		}

		System.out.println("Paint with least waste in the list is " + pList.get(lwTag).name);

	}

	public void selectCheapest(double area) {

		double ppr; // litre per room *price per room
		int fTag=0;
		ppr = (area / pList.get(0).coverage) * pList.get(0).ppl;

		// area/capacity

		for (int i = 1; i < pList.size(); i++) {
			if (ppr > ((area / pList.get(i).coverage) * pList.get(i).ppl)) {
				ppr = ((area / pList.get(i).coverage) * pList.get(i).ppl);
				fTag = i;
			}
		}
		
		System.out.println("The chepaset paint to paint this room of area " + area+ " is "+ pList.get(fTag).name + "with £"+ppr+" cost");

	}
}
