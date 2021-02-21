
public class Person {
	
	public String vorname;
	private String nachname;
	private float geld;
	private Bank mybank;
	
	public Bank getMybank() {
		return mybank;
	}

	public void setMybank(Bank mybank) {
		this.mybank = mybank;
	}

	public Person(String fn, String ln, float money) {
		this.vorname = fn;
		this.nachname= ln;
		this.geld=money;
	}
	
	public float getGeld() {
		return geld;
	}
	public void setGeld(float geld) {
		this.geld = geld;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

}
