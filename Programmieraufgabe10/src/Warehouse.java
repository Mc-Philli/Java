
public class Warehouse implements Cloneable{

	private int areaInSquareMeters;
	
	public Warehouse (int areaInSquareMeters) {
		this.areaInSquareMeters = areaInSquareMeters;
	}

	public int getAreaInSquareMeters() {
		return areaInSquareMeters;
	}

	public void setAreaInSquareMeters(int areaInSquareMeters) {
		this.areaInSquareMeters = areaInSquareMeters;
	}
	
	public Warehouse clone() {
		try {
			return (Warehouse) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("Warehouse Klonen hat nicht geklappt");
		}
		return null;
		
	}
	
	
}
