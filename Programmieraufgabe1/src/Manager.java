
public class Manager extends Employee {

	private int numberOfEmployees;

	public Manager() {
		super();
	}

	public Manager(String fn, String ln, long Id, int noe) {
		super(fn,ln,Id);
		System.out.println("Es wurde ein neuer Manager mit folgenden Values angelegt: " + fn + " " + ln + " " + Id
				+ " " + noe + " ");
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

}
