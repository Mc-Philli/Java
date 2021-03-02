import java.util.LinkedList;

public class Program {
	
	public static void main(String[] args) {
		LinkedList <String> employes = new LinkedList<String>();
		
		
		employes.add("Marc");
		employes.add("Alfred");
		employes.add("Mario");
		employes.add("Kai");
		
//		for(String empl:employes) {
//			System.out.println(empl);
//		}
		
		employes.addFirst("Timo");
		employes.addLast("Lukas");
		
		System.out.println(employes.toString());
		
		
	}

}
