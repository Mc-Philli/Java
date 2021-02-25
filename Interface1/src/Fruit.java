
public class Fruit extends SupermarketProducts implements Buyable{
	
	private double preis = 100;

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	@Override
	public void testmethod() {
		System.out.println("Das ist eine überschriebene Methode!!");
	}

	@Override
	public void buyProduct() {
		// TODO Auto-generated method stub
		
	}
	
//	public void buyProduct () {
//		System.out.println("Preis des Produkts: " + this.preis);
//		System.out.println("Artikel erfogreich gekauft.");
//	}
	

}
