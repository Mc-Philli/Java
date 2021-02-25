
public abstract class Product {
	
	private String name; 
	private double price;
	private Currency currency;
	
	public Product(double price, Currency currency) {
		this.price = price;
		this.currency = currency;
		
	}
	
	public void buyProduct(){
		// TODO Auto-generated method stub
		System.out.println("Das Product " + this.name+ " wurde für "+this.price+ " " +this.currency+" erfolgreich gekauft.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	

}
