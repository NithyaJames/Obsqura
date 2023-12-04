package package3;

public class StaticExample {
	static String college = "ABC";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(college);
		college="DEF";
		System.out.println(college);
		StaticExample.display();
	}
	static void display() {
		college="GHI";
		System.out.println(college);
	}

}
