package klonenProjekt;

public class CarEngine implements Cloneable {

	private String name;

	public CarEngine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CarEngine clone() {

		try {
			return (CarEngine) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("CarEngine Klonen hat nicht funktionert.");
		}

		return null;
	}

}
