package package3;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int tmp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements before sort");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		for (i = 0; i < (n-1) ; i++) {
			for (int j = 0; j < (n - i-1); j++) {
				if (a[j] > a[j + 1])
					tmp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = tmp;
			}
		}
		System.out.println("Array after sort");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
