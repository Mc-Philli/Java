
public class Program {

	public static void main(String[] args) {
		
		Ultraboost ub1 = new Ultraboost("Kunststoff", "Leder", "Blau", false);
		NMDR1 nmd = new NMDR1("Leder", "Kunstleder", "Grün", true);
		
		ub1.cleanWithWater();
		ub1.tieShoes();
		nmd.cleanWithWater();
		nmd.tieShoes();
		
	}
}
