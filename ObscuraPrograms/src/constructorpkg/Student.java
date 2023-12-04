package constructorpkg;

public class Student {
	int stdid;
	String name;
	public void display() {
		System.out.println("Student ID: "+stdid);
		System.out.println("Student Name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.display();

	}

}
