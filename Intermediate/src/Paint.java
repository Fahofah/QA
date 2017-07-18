
public class Paint {

	String name;
	int capacity;	// l/tin
	double price;		// £/tin
	int coverage; 	// m2/l
	double ppl;		//£/l
	
	public  Paint(String name, int capacity, double price, int coverage){
		this.name=name;
		this.capacity=capacity;
		this.price=price;
		this.coverage=coverage;
		this.ppl=price/capacity;
	}
	
}
