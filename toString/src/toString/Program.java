package toString;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] stringArr = {"Test", "B","A", "F", "ZE"};
		
		Arrays.sort(stringArr);
		for (String string: stringArr) {
			System.out.println(string);
		}

		Student student1 =new Student("Marc-Philipp", "Reinbold", 23);
		Student student2 = new Student("Peter", "Reinbold", 44);
		Student student3 = new Student("Thomas", "Reinbold", 90);
	
		Student[] studentArr = new Student[] {student2, student1, student3};
		
		Arrays.sort(studentArr);
		for(Student student: studentArr) {
			System.out.println(student);
		}
		
		
	}

}
