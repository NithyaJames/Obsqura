package package1;

public class StudentEncapsulation {
	private int roll;
	private String name;
	private String college;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEncapsulation std1 = new StudentEncapsulation();
		std1.setRoll(123);
		System.out.println(std1.getRoll());
		std1.setName("Nithya");
		System.out.println(std1.getName());
		std1.setCollege("Carmel");
		System.out.println(std1.getCollege());
	}

}
