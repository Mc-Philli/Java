
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Warehouse warehouse = new Warehouse(200);
		CashRegister cr = new CashRegister(50);
		Store store = new Store ("Lidl", warehouse, cr);
		Store store2;
		
		store2 = store.clone();
		store2.getCashRegister().setMoney(100);
		
		System.out.println(store);
		System.out.println(store2);

	}

}
