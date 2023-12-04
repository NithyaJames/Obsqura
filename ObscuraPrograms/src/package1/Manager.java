package package1;

public class Manager extends Employee {
	int pfAccount=2000;
	public void displayPf() {
		System.out.println("PF "+pfAccount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Manager obj=new Manager();
System.out.println(obj.basicSalary);
obj.display();
	}

}
