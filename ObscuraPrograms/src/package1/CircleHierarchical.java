package package1;

public class CircleHierarchical extends ShapeHierarchical {
	int a;
	CircleHierarchical(){
		
		System.out.println("Child Default constructor");
	}
	CircleHierarchical(int x){
		this();
		System.out.println("Child parameterized constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleHierarchical circ1=new CircleHierarchical();
		CircleHierarchical circ=new CircleHierarchical(2);
		circ.a=10;
		circ.area();

	}
	@Override
	public void area() {
		int a=100;
		int r=2;
		float area= 3.14f*r*r;
		System.out.println("Area of circle "+ area);
		System.out.println(a);  // local variable
		System.out.println(this.a);   //instance variable
		System.out.println(super.a);
	}
}
