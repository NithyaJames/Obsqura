package package1;

public class AverageInstance {
	
	public void avg(int a,int b,int c) {
		int sum=0,avrg=1;
		sum=a+b+c;
		avrg=sum/3;
		System.out.println("Average of integers "+avrg);
	}
    public void avg(double a,double b,double c) {
    	double sum=0,avrg=1;
		sum=a+b+c;
		avrg=sum/3;
		System.out.println("Average of three float numbers"+avrg);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageInstance obj = new AverageInstance();
		obj.avg(1, 2, 3);
		obj.avg(1.5, 2.5, 3.5);

	}

}
