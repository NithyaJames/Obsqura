package package1;

import java.util.Scanner;

public class FactorialStatic {
	
	public static void factorial(int num) {
		int tmp=num;
		int result=1;
		while(num!=0) {
			result=result*num;
			num--;
		}
		System.out.println("Factorial of "+tmp+" is "+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		factorial(num);

	}

}
