package training;

public class Vehicle {
	
	public enum ColorType { RED, BLUE, GREEN, YELLOW, BLACK, WHITE };
	
	int numSeats;
	int numDoors;
	boolean hasAC;
	ColorType color;
	
	Vehicle() {
		numSeats = 5;
		numDoors = 5;
		hasAC = true;
		color = ColorType.BLACK;
	}
	
	Vehicle(ColorType col){
		numSeats = 5;
		numDoors = 5;
		hasAC = true;
		color = col;
	}
	
	public void setColor(ColorType col) {
		color = col;
	}
	
	public ColorType getColor() {
		return color;
	}
	
	public static void main(String args[]) {
		Vehicle defaultCar = new Vehicle();
		Vehicle redCar = new Vehicle(ColorType.RED);
		
		System.out.println("defaultCar is: " + defaultCar.getColor());
		System.out.println("redCar is: " + redCar.getColor());
		
		
	}
	
	

}
