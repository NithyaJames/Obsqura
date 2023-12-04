package package1;

public class StringPalindrome {
	String str1="java";
	String str2="Malayalam";

	public String reverseString(String str) {
		char ch;
		String revString="";
		
		for (int i = 0; i<str.length(); i++) {

			ch= str.charAt(i);
			revString=ch+revString;
			
		}
	 return revString;
	}
	public void palindromCheck(String rev,String str) {
		if(str==rev) {
			System.out.println("The given string "+str+" is Palindrom");
		}
		else {
			System.out.println("The given string "+str+" is not Palindrom");
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev;
		StringPalindrome obj = new StringPalindrome();
		rev=obj.reverseString(obj.str1);
		obj.palindromCheck(rev,obj.str1);
		rev=obj.reverseString(obj.str2);
		obj.palindromCheck(rev,obj.str2);
		
		

	}

}
