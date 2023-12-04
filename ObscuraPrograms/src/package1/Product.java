package package1;

import java.util.Scanner;

public class Product {
	int id;
	String name;
	static String company="ABC";
	public static void display(int id,String name) {
		System.out.println("ID :"+id);
		System.out.println("Name: "+name);
		System.out.println("Name: "+company);
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the product details");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		Product.display(id,name);

	}

}
