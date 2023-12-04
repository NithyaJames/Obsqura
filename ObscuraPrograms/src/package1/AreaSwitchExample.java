package package1;

import java.util.Scanner;

public class AreaSwitchExample {
	public void area(double r) {
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
		AreaSwitchExample ob=new AreaSwitchExample();
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the Options\na)Area of circle\nb)Area of rectangle\nc)Area of square");
		char ch = sc.next().charAt(0); 
		switch(ch) {
		case 'a' : ob.area(2.0);
			break;
		case 'b' : ob.area(3,4);
			break;
		case 'c': ob.area(6);
			break;
		default: System.out.println("Invalid option");
			break;
		
		}
		

	}

}
