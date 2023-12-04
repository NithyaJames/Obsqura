package abstractpackage;

public class TestBank {

	public static void main(String[] args) {
		Bank sb=new SBI();
		Bank pn=new PNB();
		System.out.println("PNB: "+pn.getRateOfInterest());
		System.out.println("SBI: "+sb.getRateOfInterest());

	}

}
