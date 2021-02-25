
public class Beer extends Product{

	public Beer(double price, Currency currency, String name) {
		super(price, currency);
		this.setName(name);
	}

}
