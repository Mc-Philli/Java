
public class Plate {

	public int diameter; 
	
	public Plate(int diameter) {
		this.diameter = diameter;
		
	}
	
	public int getPlate() {
		
		return this.diameter;
	}
	
	public String toString() {
		return "Ich bin ein Teller! Mein Durchmesser ist: "+ this.diameter;
	}
	
}
