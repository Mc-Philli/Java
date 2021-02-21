
public class Assistant extends Employee {

	private int hoursPerWeek;

	public Assistant() {
		super();
	}

	public Assistant(String fn, String ln, long Id, int hpw) {
		super(fn, ln, Id);
		this.hoursPerWeek = hpw;
		System.out.println("Es wurde ein neuer Assistent mit folgenden Values angelegt: " + fn + " " + ln + " " + Id
				+ " " + hpw + " ");
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

}
