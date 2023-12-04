package package3;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0;
		int flag = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		m=n/2;
		sc.close();
		
			for(int i=2;i<=m;i++)
			{
				if(n%i==0) {
					flag=1;
					break;
				}
			}
		if(flag==0)

	{
		System.out.println("Entered number is Prime");
	}else
	{
		System.out.println("Not Prime");
	}
}

}
