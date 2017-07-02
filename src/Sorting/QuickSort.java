package Sorting;

import java.util.logging.Logger;

public class QuickSort {
	int size;
	int[] myArray;

	public QuickSort() {
		myArray = new int[] { 90, 100, 20, 60, 80, 110, 120, 40, 10, 30, 50, 70 };
		reQuickSort(0, myArray.length - 1);
		print();
	}

	public void reQuickSort(int left, int right) {
		if (left >= right)
			return;
		else {
			int pivot = myArray[right];
			int partition = startPartition(left, right, pivot);
			Logger.getLogger("jsjjs");
			print();
			reQuickSort(left, partition - 1);
			print();
			reQuickSort(partition + 1, right);
			print();
		}
	}

	public int startPartition(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;

		while (true) {
			while (myArray[++leftPtr] < pivot)
				;
			while (rightPtr > left && myArray[--rightPtr] > pivot)
				;
			if (leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right);
		return leftPtr;

	}

	private void swap(int leftPtr, int rightPtr) {
		int temp = myArray[leftPtr];
		myArray[leftPtr] = myArray[rightPtr];
		myArray[rightPtr] = temp;
	}
	
	public void print(){
		for (int i: myArray){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new QuickSort();
	}
}
