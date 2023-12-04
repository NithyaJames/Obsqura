package package3;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eveCount=0;
		int oddCount=0;
		for (int i=1;i<20;i++) {
			if(i%2==0) {
				eveCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Even count:"+eveCount);
		System.out.println("Even count:"+oddCount);

	}

}
