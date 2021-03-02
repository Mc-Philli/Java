package exception1;

public class Person {
	
	private int age;
	
	public Person (int age) {
		this.age=age;
		
	}
	
	public void sprint() throws Exception {
		if(this.age>65) {
			throw new ToOldException("Alter ist älter als 65, Person kann deshalb nicht Mehr sprinten!");
		}
		
//		System.out.println("Halbes Alter: " + (this.age/0));
		
		System.out.println("Die Person sprintet");
	}

}
