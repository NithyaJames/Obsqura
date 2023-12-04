package interfacepackage;

public class A6 implements printable {
	@Override
	public void print() {
		System.out.println("Hellooooo");
	}
public static void main(String[] args) {
	A6 obj=new A6();
	obj.print();
}
}
