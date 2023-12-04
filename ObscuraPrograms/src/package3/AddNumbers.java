package package3;

import package1.FactorialThis;

public class AddNumbers {
	int a=10;
	int b=5;
	int sum=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNumbers obj=new AddNumbers();
		
		obj.sum=obj.a+obj.b;
		System.out.println("Sum of 2 numbers: "+obj.sum);
		FactorialThis fact=new FactorialThis();
		fact.display(4);

	}

}
