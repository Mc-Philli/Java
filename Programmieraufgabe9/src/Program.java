
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kunde tim = new Kunde();
		Orangensaft o1 = new Orangensaft(12);
		Orangensaft o2 = new Orangensaft(12);
		Orangensaft o3 = new Orangensaft(16);
		Orangensaft o4 = new Orangensaft(10);
		JuiceStock j1 = new JuiceStock(3);

		try {
			j1.buyJuice();
			try {
				tim.drinkJuice(o1);
			} catch (TempratureException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} catch (OutOfStockException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		try {
			j1.buyJuice();
			try {
				tim.drinkJuice(o2);
			} catch (TempratureException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} catch (OutOfStockException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		try {
			j1.buyJuice();
			try {
				tim.drinkJuice(o3);
			} catch (TempratureException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} catch (OutOfStockException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		try {
			j1.buyJuice();
			try {
				tim.drinkJuice(o4);
			} catch (TempratureException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} catch (OutOfStockException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}

	}

}
