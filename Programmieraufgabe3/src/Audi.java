
public class Audi implements Drivable{
	
	private String model;
	private int horsePower;
	private int xPosition;
	private int yPosition;

	public Audi(String model, int hp) {
		this.model = model;
		this.horsePower = hp;
		System.out.println("Der Audi "+ this.model + " mit " + this.horsePower+" wurde erstellt!");
	}
	@Override
	public void drive(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Das Auto hat die neuen Koordinaten "+ x +" und "+ y+ " übernommen und fährt dorthin.");
	}

	@Override
	public void printPosition() {
		// TODO Auto-generated method stub
		System.out.println("Die aktuelle Position von dem Auto ist x: " + this.xPosition + " und y: "+ this.yPosition);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	

}
