package superpackage;

public class Divisible extends AdditionResult {
	

	public Divisible(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	public void display() {
		int result = 1;
		result = super.add(a, b);
		System.out.println("Result of 2 Numbers: "+result);
		if(result % 10 == 0) {
			System.out.println("Result is divisible by 10");
		}
		else {
			System.out.println("Not divisible by 10");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible obj=new Divisible(30,10);
		obj.display();

	}

}
