
public class Employee extends Person {
	
	private long employeeID;
	
	public Employee () {
		super();
		
	}
	
	public Employee (String fn, String ln, long Id) {
		super(fn,ln);
		this.employeeID=Id;
		System.out.println("Es wurde ein neuer Employee mit folgenden Values angelegt: " + fn + " " + ln + " " + Id
				+ " " );
	}

	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

}
