package exceptionhandling;

public class TestThrowAndThrows {
	static void method()throws ArithmeticException{
		System.out.println("Inside method");
		throw new ArithmeticException("Throwing Arithmetic Exception");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		}
		catch(ArithmeticException e) {
			System.out.println("caught in main method");
		}

	}

}
