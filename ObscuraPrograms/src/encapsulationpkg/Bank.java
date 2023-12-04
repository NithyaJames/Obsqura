package encapsulationpkg;

public class Bank {
	private int cardPin;
	

	public int getCardPin() {
		return cardPin;
	}


	public void setCardPin(int cardPin) {
		this.cardPin = cardPin;
	}
	public void validPin(int pin) {
		int userPin=getCardPin();
		if((userPin==1001) || (userPin==1234)|| (userPin==1212)) {
			System.out.println("Entered Pin number is valid ");
		}
		else {
			System.out.println("Pin number is not valid");
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
