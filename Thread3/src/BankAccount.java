

public class BankAccount {

	private int bankAccount = 2000;

	public void transaction() throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					addOneEuro();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					substractOneEuro();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		
		System.out.println("Neuer Kontostand:" +  getBankAccount());

	}

	public synchronized void addOneEuro() {
		bankAccount++;
	}

	public synchronized void substractOneEuro() {
		bankAccount--;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

}
