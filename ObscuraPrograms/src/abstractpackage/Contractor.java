package abstractpackage;

public class Contractor extends Employee {
	
	private double payperHour;
	private int hour;
	public Contractor(double payperHour, int hour) {
	
		this.payperHour = payperHour;
		this.hour = hour;
	}
	@Override
	public void calculateSalary() {
		salary=this.payperHour*this.hour;
		System.out.println("Salary of contractor: "+salary);
		
	}

}
