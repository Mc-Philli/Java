
public class Program {
	
	public static void main(String[] args) {
		
		Heater h1 = new Heater(5);
		try {
			h1.setHeater();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Bitte eine gültige Zahl eingeben!");
//			e.printStackTrace();
		}
		
	}

}
