package exceptionhandling;

public class VotingMainClass {

	public static void main(String[] args) {
		int age=19;
		try {
			if((age<18) && (age>=0))
				throw new Voting("Not eligible");
			else if(age<0)
				throw new Voting("Invalid age");
			
				System.out.println("Eligible for voting");
			
		}catch(Voting e) {
			System.out.println(e);
			
		}

	}

}
