package Sorting;

import java.util.Scanner;

public class InsertionSort {
	static int[] myArray;
	static int size;
	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println("Enter size of an Array");
		scan = new Scanner(System.in);
		size = scan.nextInt();
		myArray = new int[size];
		System.out.println("Enter Elements");
		for (int i = 0; i < size; i++) {
			
			int min = scan.nextInt();
			int j = i - 1;
			for ( ;((j >= 0) && (myArray[j] > min)); ) {
				myArray[j+1] = myArray[j];
				j--;
			}
			myArray[j+1] = min;
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(myArray[i] + "\t");
		}
	}
	
}
