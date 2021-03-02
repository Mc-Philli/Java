package klonenProjekt;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarEngine engine = new CarEngine("Diesel 1.7");
		Car car1 = new Car("BMW", 220, engine);
		Car car2 = new Car(car1);
		
		car2.setBrand("Mercedes");
		car2.getEngine().setName("Benziner 2.0");
		
		System.out.println(car1);
		System.out.println(car2);
	
	}

}
