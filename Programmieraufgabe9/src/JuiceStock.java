
public class JuiceStock {

	private int stock;

	public JuiceStock(int stock) {

		this.stock = stock;

	}

	public void buyJuice() throws OutOfStockException {
		if (this.stock > 0) {
		this.stock--;
		System.out.println("Es wurde ein Saft gekauft!");
		System.out.println("Es sind nur noch " + stock + " Säfte vorhanden");
	}else {
		throw new OutOfStockException("Keine Säfte mehr verfügbar!");
	}
		}

}
