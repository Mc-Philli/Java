
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount myBankAccount = new BankAccount();
		
		System.out.println("Aktueller Kontostand: " + myBankAccount.getBankAccount());
		
		try {
			myBankAccount.transaction();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
