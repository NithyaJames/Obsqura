package abstractpackage;

public class CalculateSalaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor ctr=new Contractor(10000,3);
		FulltimeEmployee fte=new FulltimeEmployee(1000);
		ctr.calculateSalary();
		fte.calculateSalary();

	}

}
