package package3;

import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count;
		for(int i=1;i<n;i++) {
			count=0;
			for(int j=2;j<=(i/2);j++) {
			if(i%j==0) {
				count++;
				break;
			}
			}
			if(count==0) {
				System.out.println(i);
			}
		}

	}

}
