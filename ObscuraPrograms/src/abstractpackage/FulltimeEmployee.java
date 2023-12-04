package abstractpackage;

public class FulltimeEmployee extends Employee {
	private double salperHour;
	public FulltimeEmployee(double salperHour) {
	
		this.salperHour = salperHour;
	}

	@Override
	public void calculateSalary() {
		salary=this.salperHour*8;
		System.out.println("Salary of cont: "+salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
