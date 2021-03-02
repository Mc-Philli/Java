
public class Program {

	public static void main(String[] args) {

		System.out.println("Hallo, jetzt wird der Thread gestartet!!!");

		Thread t1 = new Thread(new ErsterThread(), "Thread1");

		t1.start();

		Thread t2 = new Thread(new ErsterThread(), "Thread2");
		t2.setPriority(10);
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}
		System.out.println("Thread: " + Thread.currentThread().getName() + " ist beendet.");

	}

}
