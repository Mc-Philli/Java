import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program {

	public static void main(String[] args) {
		
		PriorityQueue<String> queueTest = new PriorityQueue<String>();
		
		queueTest.offer("Tobias");
		queueTest.offer("Maja");
		queueTest.offer("Alfred");
		queueTest.offer("Dominik");
		queueTest.offer("Marc");
		
		while(!queueTest.isEmpty()) {
			System.out.println(queueTest.poll());
		}
		
		/*
		Queue <String> ice = new LinkedList<String>();
		
		ice.offer("Marc");
		ice.offer("Timo");
		ice.offer("Thomas");
		ice.offer("Kai");
		ice.offer("Marcel");
		ice.offer("Tobias");
		
		while(!ice.isEmpty()) {
			System.out.println(ice.peek());
		}
*/
	}

}
