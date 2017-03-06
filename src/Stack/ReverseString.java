/**
 * 
 */
package Stack;

import java.util.Scanner;

/**
 * @author I17996
 *
 */

public class ReverseString extends ArrayStack<Character>{

	private static Scanner scan = null;
	//public static Stack<String>[] stackService = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Enter the String which you want to see in reverse order");
		String originalString = scan.nextLine();
		Stack<Character> myCharacter = new ArrayStack<Character>(originalString.length());		
		
		
		for (int i =0 ; i< originalString.length(); i++){
			myCharacter.push(originalString.charAt(i));
		}
		
		for (int i =0 ; i< originalString.length(); i++){
			System.out.print(myCharacter.pop());
		}
		
		scan.close();
	}

}
