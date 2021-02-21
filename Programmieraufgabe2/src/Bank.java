
public class Bank {
	
	private String name;
	private int kreditrahmen;
	
	public Bank (int kredit) {
		
		this.kreditrahmen = kredit;
		
	}
	
	public void openBankaccount (Person p) {
		System.out.println("Hallo Herr " + p.getNachname());
		System.out.println("Sie haben Ihr Konto erfolgreich eröffnet!");
		System.out.println("Name der Bank: " + this.name);
		System.out.println("Ihr Kontostand: "+ p.getGeld());
		System.out.println("Kreditlimit: "+ kreditrahmen);
		System.out.println("Wir freuen uns auf Ihren nächsten Besuch!");
		System.out.println("************************************");
		p.setMybank(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKreditrahmen() {
		return kreditrahmen;
	}

	public void setKreditrahmen(int kreditrahmen) {
		this.kreditrahmen = kreditrahmen;
	}
	
	

}
