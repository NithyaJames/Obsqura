package package3;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");  
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);

	}
	for(int i=0;i<n;i++) {
		sum=sum+a[i];
	}
	System.out.println("Sum of Array Elements: "+sum);

}
}