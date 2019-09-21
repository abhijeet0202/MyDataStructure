package Sorting;

import java.util.Scanner;

public class ShellSort {

	static int[] myArray;
	static int size;
	private static Scanner scan;
	
	public static void print(){
		for (int i: myArray){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//System.out.println("Enter size of an Array");
		//scan = new Scanner(System.in);
		//size = scan.nextInt();
		//myArray = new int[size];
		//for (int i = 0; i < size; i++) {
			//myArray[i] = scan.nextInt();
		//}
		size = 40;
		myArray = new int[]{35,33,42,10,14,19,27,44,12,90,67,23,92,72,32,34,63,61,69,28,23,26,29,9,1,7,8,2,11,13,15,17,19,21,24,26,29,81,83,40};
		System.out.println("Original UnSorted Array:");
		ShellSort.print();
		
		int inner, outer;
		int temp;
		int h = 1; // find initial value of h
		while (h <= size / 3)
			h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
		
		while (h > 0) // decreasing h, until h=1
		{
			System.out.println("Initiating Sorting Gap with h :" +h+" because size of array is : " +size);
			// h-sort the file
			for (outer = h; outer < size; outer++) {
				temp = myArray[outer];
				inner = outer;
				// one subpass (eg 0, 4, 8)
				try{
					Thread.sleep(500);
			
				while (inner > h - 1 && myArray[inner - h] >= temp) {
					System.out.print("Modifying Index :"+ inner+ " with Index :"+(inner-h)+" Currently "+inner+" Contains: "+myArray[inner]);
					myArray[inner] = myArray[inner - h];
					System.out.println(" Now Index :"+inner+ " is "+myArray[inner]);
					inner -= h;
				}
				myArray[inner] = temp;
				
				} catch (InterruptedException ex){
					ex.printStackTrace();
				}
			} // end for
			ShellSort.print();
			System.out.println();
			h = (h - 1) / 3; // decrease h
		} // end while(h>0)
		
	} // end shellSort()

}
