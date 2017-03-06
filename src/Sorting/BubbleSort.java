package Sorting;

import java.util.Scanner;

public class BubbleSort {
	static int[] myArray;
	static int size;
	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println("Enter size of an Array");
		scan = new Scanner(System.in);
		size = scan.nextInt();
		myArray = new int[size];
		for (int i = 0; i < size; i++) {
			myArray[i] = scan.nextInt();
		}
		// Bubble Sort logic
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (myArray[j] > myArray[j + 1]) {

					int temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.print(myArray[i] + "\t");
		}
	}
}
