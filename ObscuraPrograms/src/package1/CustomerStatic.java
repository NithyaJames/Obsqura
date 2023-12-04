package package1;

public class CustomerStatic {
	public static int totalAmount(int price1,int price2,int price3) {
		int total=0;
		total=price1+price2+price3;
		return total;
	}
	public static void discount(int total) {
		double disc=1;
		if(total>5000) {
			disc=total*0.20;
			System.out.println("Discount amount:"+disc);
		}
		else {
			System.out.println("Discount applicable only for purchase more than 5000");
		}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=CustomerStatic.totalAmount(100,200,5000);
		System.out.println(total);
		CustomerStatic.discount(total);
	}
	
}
