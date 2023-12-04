package package3;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int f=0;
		int n=20;
		System.out.println("Fibonacci Series");
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n-2;i++) {
			f=a+b;
			System.out.println(f);
			a=b;
			b=f;
		}

	}

}
