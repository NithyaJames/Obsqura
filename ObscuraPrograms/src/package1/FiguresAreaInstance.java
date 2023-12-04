package package1;

import java.util.Scanner;

public class FiguresAreaInstance {
	
	public void area(float r) {
		double area =1;
		area=3.14*r*r;
		System.out.println("Area of the circle "+area);
	}
	public void area(int l,int b) {
		int area =1;
		area=l*b;
		System.out.println("Area of the rectangle "+area);
	}
	public void area(int a) {
		int area =1;
		area=a*a;
		System.out.println("Area of the square "+area);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguresAreaInstance obj=new FiguresAreaInstance();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		float r=sc.nextFloat();
		obj.area(r);
		System.out.println("Enter the length and breadth of the rectangle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		obj.area(l, b);
		System.out.println("Enter the side measure of square");
		int a=sc.nextInt();
		obj.area(a);

	}

}
