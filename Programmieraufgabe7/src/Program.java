import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		String testString;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Wort ein: ");
		testString = sc.next();
		
		System.out.println("Das Wort nach dem Mixen: ");
		changeFirstandLastChar(testString);
		cutInMiddle(testString);
		lastThreeChar(testString);
		
	}
	
	
 public static String changeFirstandLastChar(String string) {
	 char first = string.charAt(0);
	 char last = string.charAt(string.length()-1);
	 string = last+string.substring(1,string.length()-1)+first;
	 System.out.println(string);
	 return string;
 }
 
 public static String cutInMiddle(String string) {
	 int half = (string.length()/2);
	 System.out.println(string.substring(half, string.length())+string.substring(0,half));
	 return string;
 }
 
 public static String lastThreeChar(String string) {
	 string = string.substring(0,string.length()-3)+string.substring(string.length()-3,string.length()).toUpperCase();
	 System.out.println(string);
	 
	 return string;
 }

}
