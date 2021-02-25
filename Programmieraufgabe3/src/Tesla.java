
public class Tesla implements Drivable{
	
	private String model;
	private int horsePower;
	private int xPosition = 40;
	private int yPosition = 100;

	public Tesla(String model, int hp) {
		this.model = model;
		this.horsePower= hp;
		
		System.out.println("Das Tesla "+ this.model + " mit " + this.horsePower+" wurde erstellt!");
		
	}
	
	@Override
	public void drive(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Das Auto hat die neuen Koordinaten "+ x +" und "+ y+ " übernommen und fährt dorthin.");
		this.xPosition += x;
		this.yPosition += y;
		
		
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
