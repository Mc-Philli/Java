import java.util.Scanner;

public class Heater {

	private int step;
	Scanner sc = new Scanner(System.in);

	public Heater(int step) {
		this.step = step;

	}

	public void setHeater() throws Exception {
			System.out.println("Bitte wählen Sie eine neue Stufe: ");
			this.step = Integer.parseInt(sc.next());
			if(this.step>5) {
				throw new Exception();
				
			}
			else {
				System.out.println("die neue Stufe ist: "+ this.step);
			}
		}

}
