import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		
		
		ArrayList<String> employes = new ArrayList<String>();
		employes.add("Marc");
		employes.add("Tim");
		employes.add("Frederik");
		employes.add("Lukas");
		
		Collections.sort(employes);
		
		for(String employ:employes) {
			System.out.println(employ);
		}
		
		for(int i = 0; i<employes.size();i++) {
			System.out.println(employes.get(i));
		}
		
		
	}

}
