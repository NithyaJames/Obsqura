package inheritancepkg;

public class Programmer extends Employee{
	private int bonus=10000;

	public static void main(String[] args) {
		
		Programmer pgm=new Programmer();
		System.out.println("Programmer salary is: "+pgm.salary);
		System.out.println("Programmer bonus is: "+pgm.bonus);
	}

}
