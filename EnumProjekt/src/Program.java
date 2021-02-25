
public class Program {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weekday weekday; //Montag =1, Dienstag=2 ...
		weekday = Weekday.FRIDAY;
		
		switch(weekday) {
		case MONDAY: System.out.println("Heute ist Montag");break;
		case TUESDAY: System.out.println("Heute ist Dienstag");break;
		case WEDNESDAY: System.out.println("Heute ist Mittwoch");break;
		case THURSDAY: System.out.println("Heute ist Donnerstag");break;
		case FRIDAY: System.out.println("Heute ist Freitag");break;
		case SATURDAY: System.out.println("Heute ist Samstag");break;
		case SUNDAY: System.out.println("Heute ist Sonntag");break;
		default: System.out.println("Bitte Zahlen zwischen 1-7 eingeben!");break;
		}
	}

}
