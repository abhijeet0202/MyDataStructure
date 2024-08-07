package Sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * 1. Merge Sort takes O(N *logN) time to sort.
 * 2.
 */
public class MergeSort {
	MergeSort mergeSort;

	private void recMergeSort(int[] myArray, int lowerIndex, int upperIndex) {
		if (lowerIndex == upperIndex) {
			return;
		} else {
			int midIndex = (lowerIndex + upperIndex) / 2;

			recMergeSort(myArray, lowerIndex, midIndex);

			recMergeSort(myArray, midIndex + 1, upperIndex);

			merge(myArray, lowerIndex, midIndex, upperIndex);
		}
	}

	void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		// Merge the temp arrays

		// Initial indices of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	@Before
	public void setUp() {
		mergeSort = new MergeSort();
	}
	
	@After
	public void tear() {
		mergeSort =null;
	}

	public  void display(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
	}

	@Test
	public void test1() {
		int[] myArray = new int[] { 34, 23, 1, 75, 20, 16 };
		mergeSort.recMergeSort(myArray, 0, 5);
		display(myArray);
		System.out.println();

	}

	@Test
	public void test2() {
		int[] myArray = new int[] { 12, 11, 13, 5, 6, 7 };
		mergeSort.recMergeSort(myArray, 0, 5);

		display(myArray);
	}

}
