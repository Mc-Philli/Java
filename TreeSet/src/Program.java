import java.util.Iterator;
import java.util.TreeSet;

public class Program {
	
	public static void main(String[] args) {
		
		TreeSet <Student> treeSet = new TreeSet<Student>();
		
		Student s1 = new Student("Marc",20);
		Student s2 = new Student("Thomas",44);
		Student s3 = new Student("Simon",50);
		Student s4 = new Student("Ben",24);
		Student s5 = new Student("Marc",20);
		
		treeSet.add(s1);
		treeSet.add(s2);
		treeSet.add(s3);
		treeSet.add(s4);
		treeSet.add(s5);
		
		System.out.println(treeSet);
		
		Iterator<Student> i1 = treeSet.iterator();
		while (i1.hasNext()) {
			Student s = i1.next();
			System.out.println(s);
			
			if(s.age<30) {
				i1.remove();
			}
			System.out.println(treeSet);
		}
	}

}
