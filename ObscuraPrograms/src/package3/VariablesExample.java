package package3;

public class VariablesExample {
	int id;
	String name;
	static String college="ABC";
	
	
	
	public VariablesExample(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		int age=2;
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(age);
		System.out.println(college);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesExample vr=new VariablesExample(1,"Nithya");
		vr.display();

	}

}
