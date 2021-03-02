
public class EinThread extends Thread {

	@Override
	public void run() {
		
		int i = 0;

		while (!isInterrupted()) {

				System.out.println(i);
				i++;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					interrupt();
			}
		}

	}

}
