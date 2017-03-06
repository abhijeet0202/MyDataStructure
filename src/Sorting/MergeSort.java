package Sorting;

public class MergeSort {
	
	public int[] myWorkSpace = new int[3];
	
	private void recMergeSort(int[] myArray, int lowerIndex, int upperIndex){
		if (lowerIndex == upperIndex){
			return;
		}else {
			int midIndex = (lowerIndex+upperIndex)/2;
			
			recMergeSort(myArray, lowerIndex, midIndex);
			
			recMergeSort(myArray, midIndex+1, upperIndex);
			
			merge(myArray,lowerIndex,midIndex+1,upperIndex);
		}
	}
	
	private void merge(int[] myArray, int lowerIndex,int midIndex, int upperIndex){
		//int left_end = midIndex-1;
		int tmp_pos = lowerIndex;
		int n = upperIndex - lowerIndex+1;
		
		while(lowerIndex <= midIndex-1 && midIndex <= upperIndex){
			if(myArray[lowerIndex] < myArray[midIndex]){
				myWorkSpace[tmp_pos++] = myArray[lowerIndex++];
			}else {
				myWorkSpace[tmp_pos++] = myArray[midIndex++];
			}
		}
		while (lowerIndex <= (midIndex-1))
			myWorkSpace[tmp_pos++] = myArray[lowerIndex++];
		
		while (midIndex <= upperIndex)
			myWorkSpace[tmp_pos++] = myArray[midIndex++];
		
		for(int j=0; j<n; j++){
			myArray[upperIndex] = myWorkSpace[upperIndex];
			upperIndex--;
			}
		
	}

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int[] myArray = new int[]{3,1,7};
		mergeSort.recMergeSort(myArray, 0, 2);
		
		for (int i =0 ; i<mergeSort.myWorkSpace.length;i++){
			System.out.print(mergeSort.myWorkSpace[i]+", ");
		}
	}

}
