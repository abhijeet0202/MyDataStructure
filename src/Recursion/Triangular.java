/**
 * 
 */
package Recursion;

/**
 * @author Aryan
 *
 */
final class Triangular {
	
	public Triangular(int num) {
		System.out.println(Recursion(num));
		
	}
int  Recursion(int num){

		if (num == 1){
			return 1;
		}
		else {
			return (num +Recursion(num - 1));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangular obj = new Triangular(3);

	}

}
