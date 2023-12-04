package constructorpkg;

public class Overloading {
	int id;
	String name;
	int age;
	
	//creating 2 args constructor
	Overloading(int id,String name){
		this.id = id;
		this.name = name;
	}
	Overloading(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
	}

	public static void main(String[] args) {
		Overloading obj = new Overloading(1,"Nithya");
		Overloading obj1 = new Overloading(1,"Jiss",30);
		obj.display();
		obj1.display();

	}

}
