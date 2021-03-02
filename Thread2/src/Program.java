
public class Program {

	public static void main(String[] args) {
		
		EinThread t1 = new EinThread();
		
		t1.start();
		
		try {
			Thread.sleep(2000);
			t1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	

	}

}
