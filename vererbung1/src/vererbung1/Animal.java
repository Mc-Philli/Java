package vererbung1;

public class Animal {

	// Attribute
	String name;
	int age;
	private String color;
	String favFood;
	
	//Konstruktor
	public Animal (String color) {
		this.color = color;
	}

	// Methoden

	public void move () {
		System.out.println("Geschwindigkeit: 10 Km/h");
	}
	
	public void sleep() {
		System.out.println("Ich schlafe gerade...");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
