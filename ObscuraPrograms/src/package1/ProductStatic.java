package package1;

public class ProductStatic {
	int id;
	String name;
    int price;
    static String company="ABC";
    public void display(int id,String name,int price) {
    	System.out.println("ID: "+id);
    	System.out.println("Name: "+name);
    	System.out.println("Price: "+price);
    	System.out.println("Company: "+company);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductStatic obj=new ProductStatic();
		obj.display(1,"powder", 300);
			

	}

}
