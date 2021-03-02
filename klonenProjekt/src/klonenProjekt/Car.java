package klonenProjekt;

public class Car implements Cloneable{
	
	String brand;
	int horsepower;
	private CarEngine engine;
	
	public Car (String brand, int ps, CarEngine engine) {
		this.brand = brand;
		this.horsepower=ps;
		this.engine= engine;
	}
	
	public Car (Car otherCar) {
		//primitive Attribute
		this.brand = otherCar.getBrand();
		this.horsepower = otherCar.getHorsepower();
		
		//komplexe Attribute
		CarEngine engine = new CarEngine(otherCar.getEngine().getName());
		this.engine = engine;
	}
	
	public String toString() {
		return "Marke: " + brand + ", PS: "+this.horsepower + ", Motor: "+ this.engine.getName();
	}
	
	public CarEngine getEngine() {
		return engine;
	}

	public void setEngine(CarEngine engine) {
		this.engine = engine;
	}

	@Override
	public Car clone () {
		try {
			Car carClone = (Car) super.clone();
			carClone.engine = (CarEngine) carClone.engine.clone();
			return carClone;
//			return (Car) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("Clonen hat nicht geklappt!");
		}
		return null;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	

}
