package overridingpkg;

public class Bike extends Vehicle {
	public void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String[] args) {
		Bike bk=new Bike();
		bk.run();

	}

}
