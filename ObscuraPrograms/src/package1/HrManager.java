package package1;

public class HrManager extends Manager {
	String designation="HR";
	int allowance=500;
	public void calcSalary(int bs,int pf,int alw) {
		int salary=bs+pf+alw;
		System.out.println("Total Salary "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HrManager hm=new HrManager();
		System.out.println(hm.pfAccount);
		hm.display();
		hm.displayPf();
		System.out.println("Allowance "+hm.allowance);
		hm.calcSalary(hm.basicSalary,hm.pfAccount,hm.allowance);
	}

}
