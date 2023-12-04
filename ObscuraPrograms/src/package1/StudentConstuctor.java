package package1;

public class StudentConstuctor {
	int m1,m2,m3;
	StudentConstuctor(int mark1,int mark2,int mark3){
		m1=mark1;
		m2=mark2;
		m3=mark3;
	}
	public int totalMark() {
		int total=0;
		total=m1+m2+m3;
		return total;
	}
	public void grade(int total) {
		if(total >=80)
			System.out.println("GRADE A");
		else if(total >=70)
			System.out.println("GRADE B");
		else if(total >=60)
			System.out.println("GRADE C");
		else if(total>=50)
			System.out.println("GRADE D");
		else
			System.out.println("FAILED");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		StudentConstuctor std1 =new StudentConstuctor(10,20,30);
		total=std1.totalMark();
		System.out.println("Total Mark of a student1 :"+total);
		std1.grade(total);
		StudentConstuctor std2 =new StudentConstuctor(15,25,30);
		total=std2.totalMark();
		System.out.println("Total Mark of a student2 :"+total);
		std2.grade(total);
	}

}
