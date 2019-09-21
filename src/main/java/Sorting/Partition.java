package Sorting;

public class Partition {

	static int[] myArray;
	static int size;
	
	public static void print(){
		for (int i: myArray){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static int startPartition(int left, int right){
		int leftPtr = left-1;
		int rightPtr = right;
		
		int pivot = myArray[right];
		while(true){
			while(myArray[++leftPtr] < pivot);
			while(rightPtr > left && myArray[--rightPtr] > pivot);
			if(leftPtr >= rightPtr)
					break;
			else
				swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right);
		return leftPtr;
		
	}
	
	private static void swap(int leftPtr, int rightPtr){
		int temp = myArray[leftPtr];
		myArray[leftPtr] = myArray[rightPtr];
		myArray[rightPtr] = temp;
		//Partition.print();
	}
	public static void main(String[] args) {
		
		size = 16;
		myArray = new int[]{90,100,20,60,80,110,120,40,10,30,50,70};
		System.out.println("Original UnSorted Array:");
		Partition.print();
		int i = Partition.startPartition(0,11);
		System.out.println(i);
		Partition.print();
	}

}
