package package1;

public class DogSuperKey extends AnimalSuperKey {
	String color="balck";
	
	public DogSuperKey() {
		super();
	}

	public void display() {
		System.out.println("Child Class: "+color);
		System.out.println("Parent Class: "+super.color);
		super.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogSuperKey dog=new DogSuperKey();
		dog.display();
		
	}

}
