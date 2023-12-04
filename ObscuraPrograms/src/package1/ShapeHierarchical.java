package package1;

public class ShapeHierarchical {
	int a;
	
	ShapeHierarchical(){
		System.out.println("Parent default constructor");
	}
	
	ShapeHierarchical(int x){
		System.out.println("Parent parameterized constructor");
	}
	
	
	public void area() {
		System.out.println("Finding area");
	}

}
