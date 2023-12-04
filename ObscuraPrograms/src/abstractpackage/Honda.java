package abstractpackage;

public class Honda extends Bike {
	void run() {
		System.out.println("Running safely");
	}

	public static void main(String[] args) {
		Bike hd =new Honda();
		hd.run();
		hd.changeGear();

	}

}
