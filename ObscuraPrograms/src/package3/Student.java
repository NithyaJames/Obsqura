package package3;

public class Student {
	int id;
	String name;
	static String college="Obsqura"; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location="Bangalore";
		Student s1=new Student();
		s1.id=1;
		s1.name="Nithya";
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(college);
		System.out.println(location);
		
		Student s2=new Student();
		s2.id=2;
		s2.name="Revathy";
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(college);
		System.out.println(location);

	}

}
