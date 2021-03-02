
public class Student {
	
	private String firstName;
	private String lastName;
	private int matrikelNr;
	
	public Student(String fn, String ln, int mn) {
		this.firstName = fn;
		this.matrikelNr= mn;
		this.lastName = ln;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.firstName + " "+ this.lastName;
	}

	public int getMatrikelNr() {
		return matrikelNr;
	}

	public void setMatrikelNr(int matrikelNr) {
		this.matrikelNr = matrikelNr;
	}
	

}
