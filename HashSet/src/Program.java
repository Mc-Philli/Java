import java.util.HashSet;

public class Program {
	
	public static void main(String[] args) {
		
		
		HashSet<String> email = new HashSet<String>();
		
		email.add("marc@test.ch");
		email.add("timo@test.ch");
		email.add("jana@test.ch");
		email.add("robert@test.ch");
		
		email.remove("robert@test.ch");
		System.out.println(email);
		
		for(String emails:email) {
			System.out.println(emails);
		}
		
		
	}

}
