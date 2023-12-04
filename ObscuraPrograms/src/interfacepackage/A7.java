package interfacepackage;

public class A7 implements printable,Showable {
	@Override
	public void print() {
		System.out.println("Hellooooo");
	}
	

	public static void main(String[] args) {
		A7 obj=new A7();
		obj.print();

	}

}
