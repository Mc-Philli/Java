
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pencil pen = new Pencil(1.99, Currency.DOLLAR, "Bleistift");
		Beer rothaus = new Beer(0.99, Currency.EURO, "Pils");
		
		pen.buyProduct();
		rothaus.buyProduct();

	}

}
