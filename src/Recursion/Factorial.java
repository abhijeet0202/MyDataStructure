package Recursion;

import java.math.BigInteger;

public class Factorial {

	public Factorial(int num) {
		System.out.println(Recursion(num));

	}

	String Recursion(int num) {

		BigInteger temp = BigInteger.valueOf(1);
		BigInteger myInput = BigInteger.valueOf(num);
		if (num <1 || num > 100){
			throw new NullPointerException();
		}
		 for (int i=1 ;i <=num;i++){
			 myInput = BigInteger.valueOf(i);
			 temp = temp.multiply(myInput);
			 
		 } 
			return String.valueOf(temp);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Factorial(99);

	}

}
