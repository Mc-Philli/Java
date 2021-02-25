import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		Worker w1 = new Worker(111, "Maier");
		Worker w2 = new Worker(112, "Schreiner");
		Worker w3 = new Worker(113, "Tischler");
		Worker w4 = new Worker(114, "Maier");
		Worker w5 = new Worker(110, "Maier");
		
		Worker[] workerArray = new Worker[] {w1,w2,w3,w4,w5};
		
		for(Worker worker : workerArray) {
			System.out.println(worker);
		}
		
		Arrays.sort(workerArray);
		
		for(Worker worker : workerArray) {
			System.out.println("");
			System.out.println(worker);
		}

	}

}
