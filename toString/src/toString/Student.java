package toString;

public class Student implements Comparable {
	
	private String fn;
	private String ln;
	private int age;
	
	public Student(String fn, String ln, int age) {
		
		this.ln = ln;
		this.fn = fn;
		this.age= age;
		
	}
	
	public String toString() {
		return fn + " " + ln + ": "+ age;
	}
	
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		
		Student other = (Student) obj;
		if(other.age != this.age || other.fn != this.fn || other.ln != this.ln ) {
			return false;
		}
		return true;
		
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student other =  (Student) o;
			if(this.age < other.age) {
				return -1;
			}
			if(this.age> other.age) {
				return 1;
			}
			return 0; 
		}
		// o ist kein Objekt von Student
		return 0;
	}
	
	

}
