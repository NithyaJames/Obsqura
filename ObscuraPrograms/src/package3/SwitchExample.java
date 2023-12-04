package package3;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = sc.next().charAt(0);
		switch (c) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not Vowel");
			break;

		}

	}

}
