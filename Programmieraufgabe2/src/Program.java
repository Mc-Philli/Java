
public class Program {

	public static void main(String[] args) {

		KfW kfw = new KfW(3000);
		Commerzbank com = new Commerzbank(4000);
		DeutscheBank db = new DeutscheBank(1000);
		Person tim = new Person("Tim", "Schuster", 2300);
		Person max = new Person("Max", "Mustermann", 4300);
		Person martin = new Person("Martin", "Hauber", 9300);

		kfw.openBankaccount(tim);
		db.openBankaccount(martin);
		com.openBankaccount(max);

	}

}
