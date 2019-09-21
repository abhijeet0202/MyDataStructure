package Sorting;

/*
 * 1. Merge Sort takes O(N *logN) time to sort.
 * 2.
 */
public class MergeSort {
	
	public int[] myArray = new int[]{34,23,1,75,20,16};
	public int[] myWorkSpace = new int[6];
	
	private void recMergeSort(int[] myArray, int lowerIndex, int upperIndex){
		if (lowerIndex == upperIndex){
			return;
		}else {
			int midIndex = (lowerIndex+upperIndex)/2;
			
			recMergeSort(myWorkSpace, lowerIndex, midIndex);
			
			recMergeSort(myWorkSpace, midIndex+1, upperIndex);
			
			merge(myWorkSpace,lowerIndex,midIndex+1,upperIndex);
		}
	}
	
	private void merge(int[] myWorkSpace, int lowPtr,int highPtr, int upperBound){
		//int left_end = midIndex-1;
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr -1;
		int n = upperBound- lowerBound+1; //no. of items (UI-LI)+1
		
		while(lowPtr <= mid && highPtr <= upperBound){
			if(myArray[lowPtr] < myArray[highPtr]){
				myWorkSpace[j++] = myArray[lowPtr++];
			}else {
				myWorkSpace[j++] = myArray[highPtr++];
			}
		}
		while (lowPtr <= mid)
			myWorkSpace[j++] = myArray[lowPtr++];
		
		while (highPtr <= upperBound)
			myWorkSpace[j++] = myArray[highPtr++];
		
		for(j=0; j<n; j++){
			myArray[lowerBound+j] = myWorkSpace[j];
			}
		
	}

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();		
		mergeSort.recMergeSort(mergeSort.myArray, 0, 5);
		
		for (int i =0 ; i<mergeSort.myWorkSpace.length;i++){
			System.out.print(mergeSort.myWorkSpace[i]+", ");
		}
	}

}
