package constructorpkg;

public class StudentParameter {
	int stdid;
	String name;
	StudentParameter(int stdid,String name){
		this.stdid=stdid;
		this.name=name;
	}
	public void display() {
		System.out.println("Student ID: "+stdid);
		System.out.println("Student Name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentParameter obj1=new StudentParameter(1,"Nithya");
		obj1.display();

	}

}
