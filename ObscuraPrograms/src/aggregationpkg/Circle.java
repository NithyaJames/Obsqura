package aggregationpkg;

public class Circle {
	double pi=3.14;
	Operation op;
	
	public void area(int r) {
		op=new Operation();
		int rsquare=op.square(r);
		double area=rsquare*pi;
		System.out.println("Area of the Circle: "+area);
		
		
	}

	public static void main(String[] args) {
		Circle cr=new Circle();
		cr.area(2);
	}

}
