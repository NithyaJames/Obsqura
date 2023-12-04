package package1;

public class ReverseNumThis {
	int rev = 0;
	int n;

	ReverseNumThis() {
		this(123);
		System.out.println("Default constructor");
		System.out.println("Reverse of the number :"+this.n+" is "+ this.rev);
	}

	ReverseNumThis(int n) {
		System.out.println("Parameterized constructor");
		this.n=n;
		int rem = 0;
		while (n != 0) {
			rem = n % 10;
			this.rev = this.rev * 10 + rem;
			n = n / 10;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumThis obj = new ReverseNumThis();
	}

}
