package vererbung1;

public class Dog extends Animal{

	public Dog(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public void bark() {
		System.out.println("Waww");
	}
	
	public void sayColor() {
		System.out.println("Meine Farbe ist: " + this.getColor());
	}
	
}
