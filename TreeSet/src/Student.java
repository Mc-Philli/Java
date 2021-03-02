
public class Student implements Comparable {
	
	private String firstname;
	public int age;
	
	public Student(String fn, int age) {
		this.firstname = fn; 
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Student) {
			Student other = (Student)o;
			
			if (this.age < other.age) {
				return -1;
			}if (this.age>other.age) {
				return 1;
			}
			return 0;
		}
		return 0;
	}
	
	public String toString() {
		return "Alter: "+ this.age + " Vorname: "+this.firstname;
	}

}
