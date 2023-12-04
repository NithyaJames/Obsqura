package encapsulationpkg;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PIN number");
		int pin=sc.nextInt();
		Bank bk=new Bank();
		bk.setCardPin(pin);
		int pn=bk.getCardPin();
		System.out.println("Pin number from User: "+pn);
		bk.validPin(pn);
		

	}

}
