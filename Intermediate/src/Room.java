
public class Room {

	double roomHeight, roomLength, roomWidth;
	double area;
	
	public Room(double roomHeight, double roomLength,double roomWidth){
		
		this.roomHeight=roomHeight;
		this.roomLength=roomLength;
		this.roomWidth=roomWidth;
	}
	
	public void getPaintArea(){
		double area;
		area=(2*roomHeight*roomLength)+(2*roomHeight*roomWidth)+(roomWidth*roomLength);
		this.area=area;
	}

}
