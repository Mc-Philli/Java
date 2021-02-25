
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tesla modelS= new Tesla("Model S", 400);
		Tesla model3= new Tesla("Model 3", 200);
		Tesla modelX= new Tesla("Model X", 360);
		
		Audi a4 = new Audi("A4", 170);
		Audi a7 = new Audi("A7", 330);
		
		Drivable[] array1 = new Drivable[] {modelS, model3, modelX, a4, a7};
		
		for (Drivable i : array1) {
			String model = i.getModel();
			System.out.println(model);
			if (model == "Model S") {
				i.printPosition();
				i.drive(20,100);
				i.printPosition();
			}
			
		}

	}

}
