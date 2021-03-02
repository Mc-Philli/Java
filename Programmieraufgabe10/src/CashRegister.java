
public class CashRegister implements Cloneable{
	
	private int money;
	
	public CashRegister(int money) {
		this.money = money;
	}
	
	public CashRegister clone() {
		try {
			return (CashRegister) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("CashRegister Klonen hat nicht geklappt");

		}
		return null;
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
