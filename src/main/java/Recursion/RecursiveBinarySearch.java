/**
 * 
 */
package Recursion;

/**
 * @author I17996
 *
 */
public class RecursiveBinarySearch {
	public static Integer[] myArray;
	
	public static int find(int item, int startPointIndex, int endPointIndex){
		int currentIndex = (startPointIndex+endPointIndex)/2;
		if (myArray[currentIndex] == item)
			return currentIndex;
		else if (startPointIndex > endPointIndex)
			return -1;
		else{
			if (myArray[currentIndex] < item)
				return find(item, currentIndex +1, endPointIndex);
			else
				return find(item, startPointIndex, currentIndex -1 );
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		myArray = new Integer[100];
		
		for (int i =0; i<100; i++){
			myArray[i]=i;			
		}
		int itemIndex = RecursiveBinarySearch.find(34, 0, 99);
		System.out.println(itemIndex);

	}

}
