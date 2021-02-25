
public class Vererbung {
	
	public double preis;
	
	public void buyProduct() {
	
		System.out.println("Preis des Produkts: " + this.preis);
		System.out.println("Artikel erfogreich gekauft.");
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	
}
