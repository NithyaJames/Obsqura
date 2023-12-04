package exceptionhandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		try {
		int a=10/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("End");

	}

}
