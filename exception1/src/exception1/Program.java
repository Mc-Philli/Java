package exception1;

public class Program {
	
	public static void main(String[] args) {
		
		Person person1 = new Person(9);
		
		try {
			person1.sprint();
			
		} catch (ToOldException e) {
			// TODO Auto-generated catch block
			System.out.println("Person ist zu alt zum sprinten!");
			System.out.println("Methode Sprint kann nicht ausgeführt werden: "+ e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Durch 0 darf nicht geteilt werden!");
		} catch (Exception e) {
			System.out.println("Sonstige Exception");
		} finally {
			System.out.println("Auf Wiedersehen!");
		}
		
		System.out.println("test");

	}

}
 