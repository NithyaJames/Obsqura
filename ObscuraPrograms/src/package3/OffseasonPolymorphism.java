package package3;

import java.util.Scanner;

public class OffseasonPolymorphism extends OnseasonPolymorphism{
		
	

	@Override
	   public void discount(int cost,int item) {
    	double disc;
    	disc=(cost*item)*0.15;
    	System.out.println("Discount Price in Offseason: "+disc);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the option \n1.Onseason\n2.Offseason");
		int season=sc.nextInt();
		OffseasonPolymorphism obj=new OffseasonPolymorphism();
		OnseasonPolymorphism obj1=new OnseasonPolymorphism();
		if(season==1) {
			obj1.discount(100,3);
		}
		else {
			obj.discount(200,2);
		}
		
		
	}

}
