/**
 * 
 */
package Recursion;

/**
 * @author Aryan
 *
 */
public class TowerOfHanoi {
	static void doTower(int tower, char source, char inter, char dest){
		if(tower == 1){
			System.out.println("Disk 1 from "+source+" to "+dest);
		}
		else{
			doTower(tower-1, source, dest,inter);
			System.out.println("Disk "+tower+" from "+source+" to "+dest);
			doTower(tower-1, inter,source, dest);
			try{
				System.out.println("*******************************");
				Thread.sleep(1000);
			}catch(InterruptedException ex){
				
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doTower(3,'A','B','C');

	}

}
