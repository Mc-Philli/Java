
public class Kunde {
	
	private int temp;
	
	public void drinkJuice(Orangensaft o) throws TempratureException {
		
		this.temp = o.getTemp();
		
		if (this.temp < 9) {
			throw new TempratureException("Der Orangensaft ist zu kalt!");
		}
		else if (this.temp > 15) {
			throw new TempratureException("Der Orangensaft ist zu warm!");
		} else {
			System.out.println("Der Saft hat die optimale Temperatur!");
		} 
	}

}
