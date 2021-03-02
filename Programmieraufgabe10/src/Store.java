
public class Store implements Cloneable{
	
	private String name;
	private Warehouse warehouse;
	private CashRegister cashRegister;
	
	public Store(String name, Warehouse warehouse, CashRegister cashRegister) {
		this.name = name;
		this.warehouse = warehouse;
		this.cashRegister = cashRegister;
		
	}
	
	public String toString() {
		return "Name des Ladens: "+this.name + " , Fläche des Warenlagers: " + warehouse.getAreaInSquareMeters() + ", Geld in der Kasse: " + cashRegister.getMoney();
	}

	public Store clone() {
		
		try {
			Store other = (Store)super.clone();
			other.cashRegister = (CashRegister) other.cashRegister.clone();
			other.warehouse = (Warehouse) other.warehouse.clone();
			return other;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println(" Store Klonen hat nicht geklappt.");
		}
		
		return null;
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public CashRegister getCashRegister() {
		return cashRegister;
	}

	public void setCashRegister(CashRegister cashRegister) {
		this.cashRegister = cashRegister;
	}
	

}
