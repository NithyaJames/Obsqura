package exceptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/1;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        }
		System.out.println("Rest of the code");
	}

}
