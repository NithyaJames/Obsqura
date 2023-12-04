package package1;

import java.util.Scanner;

public class ProductConstructor {
	int id;
	String name;
	static String company="ABC";

	ProductConstructor(int id,String name) {
		this.id =id;
		this.name=name;
		
	}


	public void display() {
		System.out.println("ID: "+this.id);
		System.out.println("Name "+this.name);
		System.out.println("Company Name :"+ProductConstructor.company);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductConstructor obj=new ProductConstructor(1,"Powder");
		obj.display();
	}

}
