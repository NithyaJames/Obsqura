package encapsulationpkg;

public class TestAccount {

	public static void main(String[] args) {
		Account act=new Account();
		act.setAccnum(1234);
		act.setName("Jiss");
		act.setAmt(3000);
		System.out.println("Account Number: "+act.getAccnum());
		System.out.println("Account Name: "+act.getName());
		System.out.println("Amount: "+act.getAmt());

	}

}
