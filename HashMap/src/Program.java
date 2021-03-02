import java.util.HashMap;

public class Program {
	
	static HashMap <String, String> languageMap;

	public static void main(String[] args) {
		
		
		HashMap<String, String>german = new HashMap<String, String>();
		
		german.put("mstart", "Starten");
		german.put("mlanguage", "Sprache wählen");
		german.put("mstop", "Beenden");
		
		HashMap<String, String>english = new HashMap<String, String>();
		
		english.put("mstart", "Start");
		english.put("mlanguage", "Choose language");
		english.put("mstop", "Exit");
		
		languageMap = english;
		
		System.out.println(languageMap.get("mstart"));
		System.out.println(languageMap.get("mlanguage"));
		System.out.println(languageMap.get("mstop"));
		
		
		// TODO Auto-generated method stub
		
		/*
		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
		
		Student s1 = new Student("Marc", "Reinbold", 111);
		Student s2 = new Student("Timo", "Mustermann", 122);
		Student s3 = new Student("Herbert", "Maier", 123);
		
		
		hm.put(s1.getMatrikelNr(), s1);
		hm.put(s2.getMatrikelNr(), s2);
		hm.put(s1.getMatrikelNr(), s3);
		
		System.out.println(hm);
	*/}
	

}
