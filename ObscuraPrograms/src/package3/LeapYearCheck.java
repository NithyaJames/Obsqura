package package3;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean leap=false;
		System.out.println("Enter the Year");
		int year=sc.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				}
				else {
					leap=false;
				}
			}
			else {
				leap=true;
			}
		}
		else {
			leap=false;
		}
		
		if(leap==true) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a leap year");
		}

	}

}
