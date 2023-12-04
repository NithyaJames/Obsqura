package overridingpkg;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi=new SBI();
		ICICI ici=new ICICI();
		AXIS ax=new AXIS();
		System.out.println("SBI Rate of Interest: "+sbi.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: "+ici.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: "+ax.getRateOfInterest());
	}
	
}
