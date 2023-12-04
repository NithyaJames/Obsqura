package package1;

import java.util.Scanner;

public class PalindromeStatic {
	public static int reverse(int num) {
		int rev=0;	
		while(num!=0) {
			
		int rem=num % 10;
		rev=rev*10 + rem;
		num=num/10;
		}
		return rev;
	}
	public static void palindromeCheck(int num) {
		int reverse=reverse(num);
		if(reverse==num) {
			System.out.println("The entered number is palindrome");
		}
		else {
			System.out.println("The entered number is not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		palindromeCheck(num);
	}

}
