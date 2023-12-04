package package3;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int ele = sc.nextInt();
		for (i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				break;
			}

		}
		System.out.println("Element found at index: " + i);
	}

}
