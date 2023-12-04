package interfacepackage;

public class D implements A,B {
	@Override
	public void print() {
		System.out.println("child class function");
	}

	public static void main(String[] args) {
		
		D obj=new D();
		obj.print();

	}

}
