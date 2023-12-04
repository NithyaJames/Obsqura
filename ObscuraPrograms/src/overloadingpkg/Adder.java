package overloadingpkg;

public class Adder {
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ad2=Adder.add(10,20);
		System.out.println("Addition of 2 Numbers:"+ad2);
		int ad3=Adder.add(10,20,30);
		System.out.println("Addition of 2 Numbers:"+ad3);

	}

}
