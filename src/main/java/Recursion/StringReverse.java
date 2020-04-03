package Recursion;

public class StringReverse {

	public static void main(String[] args) {
		reverseString("Abhijeet");
		//reverseItratorString("Abhijeet");
	}
	
	public static void  reverseString(String str) {
		if(str.length() == 1) {
			System.out.print(str);
		}else {
			reverseString(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	
	public static void  reverseItratorString(String str) {
		System.out.println();
		for (int i=str.length()-1;i >=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	

}
