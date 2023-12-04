package packagepkg;

public class TestMultipleInheritance implements Printable,Show {
	@Override
	public void print() {
		System.out.println("Helloooooooo");
	}

	public static void main(String[] args) {
		TestMultipleInheritance tm=new TestMultipleInheritance();
		
		tm.print();

	}

}
