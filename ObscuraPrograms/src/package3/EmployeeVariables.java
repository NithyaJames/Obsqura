package package3;

public class EmployeeVariables {
	int empid;
	String ename;
	static String cmpname="UST";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location="Bangalore";
		EmployeeVariables emp1=new EmployeeVariables();
		emp1.empid=1234;
		emp1.ename="Nithya";
		System.out.println(emp1.empid);
		System.out.println(emp1.ename);
		System.out.println(cmpname);
		System.out.println(location);
		

	}

}
