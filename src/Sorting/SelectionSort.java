package Sorting;

import java.util.Scanner;

public class SelectionSort {
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

		// Selection Sort Logic
		for (int i = 0; i < size - 1; i++) {
			int min = myArray[i];
			int loc = i;
			for (int j = i + 1; j < size; j++) {
				if (myArray[j] < min) {
					min = myArray[j];
					loc = j;
				}
			}
			if (i != loc) {
				int temp = myArray[i];
				myArray[i] = myArray[loc];
				myArray[loc] = temp;
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(myArray[i] + "\t");
		}
	}
}
