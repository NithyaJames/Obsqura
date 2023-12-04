package package1;

import java.util.Scanner;

public class VotingStatic {
	public static boolean eligible(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		boolean status=VotingStatic.eligible(age);
		if(status==true) {
			System.out.println("Eligible for Voting");
					}
		else {
			System.out.println("Not eligible for voting");
		}
	}

}
