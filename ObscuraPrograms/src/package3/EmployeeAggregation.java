package package3;

public class EmployeeAggregation {
	int empid;
	String empname;
	AddressAggregation addr;

	public EmployeeAggregation(int empid, String empname, AddressAggregation address) {
		
		this.empid = empid;
		this.empname = empname;
		this.addr = address;
	}

	public void display() {
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Name: " + empname);
		System.out.println("City: " + addr.city);
		System.out.println("Country: " + addr.country);
		System.out.println("Zip Code: " + addr.zipcode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressAggregation addr = new AddressAggregation("Allappuzha", "India", 688522);
		EmployeeAggregation emp = new EmployeeAggregation(1, "James", addr);
		emp.display();
	}

}
