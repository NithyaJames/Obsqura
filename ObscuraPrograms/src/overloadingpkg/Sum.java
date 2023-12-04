package overloadingpkg;

public class Sum {
	public static int sum(int a,int b) {
		return a+b;
	}
	public static double sum(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer sum: "+Sum.sum(1, 2));
		System.out.println("Double sum: "+Sum.sum(3.14,3.22));

	}

}
