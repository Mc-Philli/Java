
public class Person {
	
	private String firstName;
	private String lastName;

	public Person(String fn, String ln) {
		Manager tim = new Manager("Tim", "Testbenutzer", 3323830,25);
		System.out.println(tim.getLastName());
	}

	public Person() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void main(String[] args) {
		

	}

}
