package vererbung1;

public class Tiger extends Animal{

	/*
	public void move() {
		System.out.println("Geschwindigkeit: 10 Km/h");
	}
	 */
	
	public Tiger(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move () {
		System.out.println("Geschwindigkeit: 80Km/h");
	}
}
