package package3;

public class StudentAggregation {
	String stdname;
	int stdroll;
	StudentAddressAggregation saa;

	

	public StudentAggregation(String stdname, int stdroll, StudentAddressAggregation saa) {
		super();
		this.stdname = stdname;
		this.stdroll = stdroll;
		this.saa = saa;
	}
	public void display() {
		System.out.println("Student Name: " + stdname);
		System.out.println("Roll Number: " + stdroll);
		System.out.println("City: " + saa.city);
		System.out.println("State: " + saa.state);
		System.out.println("Country: "+saa.country);
		System.out.println("PinCode: "+saa.pincode);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAddressAggregation saa=new StudentAddressAggregation("Allappuzha","Kerala","India",1234);
		StudentAggregation obj=new StudentAggregation("Alice",12,saa);
		obj.display();

	}

}
