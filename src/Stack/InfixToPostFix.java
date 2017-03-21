/**
 * 
 */
package Stack;

import java.util.Scanner;

/**
 * @author I17996
 *
 */
class Precedence {
	char operator;
	int precendence;

	public Precedence(char operator, int precendence) {
		this.precendence = precendence;
		this.operator = operator;
	}
};

public class InfixToPostFix extends ArrayStack<Character> {

	/**
	 * @param args
	 */
	static Precedence[] myPrecedence = new Precedence[4];

	public static void main(String[] args) {

		myPrecedence[0] = new Precedence('/', 1);
		myPrecedence[1] = new Precedence('*', 1);
		myPrecedence[2] = new Precedence('-', 2);
		myPrecedence[3] = new Precedence('+', 2);

		System.out.println("Enter a valid Airhmetic Expression");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(str.length());

		Stack<Character> infixToPostfix = new ArrayStack<Character>(str.length());
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '(':
				infixToPostfix.push(str.charAt(i));
				break;
			case ')':
				while (!infixToPostfix.isEmpty()) {
					char opTop = infixToPostfix.pop();
					if (opTop != '(')
						System.out.print(opTop);
					else
						break;
				}
				break;
			case '+':
			case '-':
			case '*':
			case '/':{
				if (infixToPostfix.isEmpty()) {
					infixToPostfix.push(str.charAt(i));
				} else {
					while (!infixToPostfix.isEmpty()) {
						char opThis = infixToPostfix.pop();
						if (opThis == '(') {
							infixToPostfix.push(opThis);
							infixToPostfix.push(str.charAt(i));
							break;
						} else {
							if (checkPrecedence(opThis, str.charAt(i), infixToPostfix) == false) {
								infixToPostfix.push(str.charAt(i));
								break;
							} else {
								infixToPostfix.push(opThis);
								
							}
						}
					}
				}
				break;
			}
			default:
				System.out.print(str.charAt(i));
			}
			
		}
		
		
		//Print all remains
		for (int i= infixToPostfix.top ;i >=0  ; i--){
			System.out.print(infixToPostfix.pop());
		}
	}

	
	static boolean checkPrecedence(char ch_opThis, char ch_opTop, Stack<Character> infixToPostfix) {

		Precedence opTop = null;
		Precedence opThis = null;
		for (int i = 0; i < myPrecedence.length; i++) {
			if (myPrecedence[i].operator == ch_opTop) {
				opTop = myPrecedence[i];
				break;
			}
		}
		if (null == opTop)
			return false;
		for (int i = 0; i < myPrecedence.length; i++) {
			if (myPrecedence[i].operator == ch_opThis) {
				opThis = myPrecedence[i];
				break;
			}
		}
		if (null == opThis)
			return false;

		if (opTop.precendence < opThis.operator) {
			infixToPostfix.push(ch_opThis);
			return false;
		} else if (opTop.precendence >= opThis.operator) {
			System.out.print(ch_opThis);
			return true;
		}
		return false;
	}
}
