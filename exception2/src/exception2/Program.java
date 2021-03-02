package exception2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int [4];
		
		try {
		
		for(int i = 0;i<6;i++) {
			array[i]=i;
		}
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("test");
	}

}
