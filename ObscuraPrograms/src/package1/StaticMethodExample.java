package package1;

public class StaticMethodExample {
	static int age;
	static String name;

	public static void get() {
		System.out.println(age);
		System.out.println(name);

	}

	public static void set(int age1, String name1) {
		age = age1;
		name = name1;
	}

	public static void main(String[] args) {
		set(10, "Nithya");
		get();
	}

}
