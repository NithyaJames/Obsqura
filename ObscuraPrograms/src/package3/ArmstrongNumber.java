package package3;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int tmp=n;
		int sum=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(tmp==sum) {
			System.out.println("The entered number "+tmp+" is Armstrong");
					}
		else {
			System.out.println("Number is not Armstrong");
		}

	}

}
