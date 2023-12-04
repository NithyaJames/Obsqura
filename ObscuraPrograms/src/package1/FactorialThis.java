package package1;

import java.util.Scanner;

public class FactorialThis {
	public int factorial(int n) {
		int fact=1;
		while(n!=0) {
			fact=fact* n;
			n--;
		}
		return fact;
	}
	public void display(int n) {
			
			System.out.println("The factorial of the number: "+this.factorial(n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to calculate factorial: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		FactorialThis obj=new FactorialThis();
		obj.display(n);
		}

}
