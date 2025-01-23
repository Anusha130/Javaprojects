package practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Anusha Akuthota";
		String re ="";
		int len = s.length();
		for(int i=(len-1);i>=0;i--) {
		 re = s+s.charAt(i);
		}
	if(s.toLowerCase().equals(s.toUpperCase())) {
		System.out.println("the string is a palindrome string");
	}
	else {
		System.out.println("the string is not a palindrome string");
	}
	}

}
