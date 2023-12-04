package package3;

public class OnseasonPolymorphism {
	int cost;
	int item;
	

    public void discount(int cost,int item) {
    	double disc;
    	disc=(cost*item)*0.40;
    	System.out.println("Discount Price in OnseasonPolymorphism: "+disc);
    }

}
