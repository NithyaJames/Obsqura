package inheritancepkg;

public class Child extends Parent {
	
	public void display() {
		super.display();
		System.out.println("This is child class");
		
	}

	public static void main(String[] args) {
		
		Child cd=new Child();
		cd.display();
		
	}

}
