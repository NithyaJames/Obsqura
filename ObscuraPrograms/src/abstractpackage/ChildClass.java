package abstractpackage;

public class ChildClass extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.world();
		obj.hello();
		obj.display();

	}
	public void world() {
		System.out.println("My World");
	}
	@Override
	public void hello() {
		System.out.println("Hello....................");
		
	}

}
