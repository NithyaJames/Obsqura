package aggregationpkg;

public class Employee {
	public int empId;
	public String empName;
	
	Address adr;

	public Employee(int empId, String empName, Address adr) {

		this.empId = empId;
		this.empName = empName;
		this.adr = adr;
	}
	public void display() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee City: "+adr.city);
		System.out.println("Employee State: "+adr.state);
		System.out.println("Employee Country: "+adr.country);
	}
	public static void main(String[] args) {
		Address adr=new Address("alappuzha","Kerala","India");
		Employee emp=new Employee(1,"Nithya",adr);
		emp.display();

	}

}
