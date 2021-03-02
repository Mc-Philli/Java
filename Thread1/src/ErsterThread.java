
public class ErsterThread implements Runnable { // extends Thread{

	@Override
	public void run() {
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

	/*
	 * @Override public void run() { for(int i = 0; i<15;i++) {
	 * System.out.println(i); try { Thread.sleep(1000); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * System.out.println(e.getMessage()); e.printStackTrace(); } }
	 * 
	 * }
	 */

}
