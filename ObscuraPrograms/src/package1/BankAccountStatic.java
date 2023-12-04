package package1;

import java.util.Scanner;

public class BankAccountStatic {
	static int balance=0;
	public static void deposit() {
		System.out.println("Enter the amount to be deposited");	
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		balance=balance+amt;
		balance(balance);
	}
	public static void withdraw() {
		System.out.println("Enter the amount to be withdraw");
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		if(amt > balance) {
			System.out.println("InSufficient Balance");
		}
		else {
			balance=balance-amt;
		}
		
		balance(balance);
		
	}
	public static void balance(int bal) {
		System.out.println("Current Balance is "+bal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccountStatic.deposit();
		BankAccountStatic.withdraw();

	}

}
