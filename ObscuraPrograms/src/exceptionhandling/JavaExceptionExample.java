package exceptionhandling;

public class JavaExceptionExample {

	public static void main(String[] args) {
		try {
			int data=10/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		System.out.println("Rest of the code");
	}

}
