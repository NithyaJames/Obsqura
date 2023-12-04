package package3;

import java.util.Scanner;

public class ReverseUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reverse");
		int n=sc.nextInt();
		int tmp=n;
		int rev=0;
		int rem=0;
		for(int i=n;i!=0;i=i/10) {
			rem=i%10;
			rev=rev*10+rem;
					}
		System.out.println("Reverse: "+rev);

	}

}
