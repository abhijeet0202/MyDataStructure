package Sorting;

/*
 * Better than Selection and Insertion
 * But not better than O(N*LogN) Sorts i.e Quick Sort
 * 
 */
public class ShellSort_AG {

	private long[] theArray; // ref to array theArray
	private int nElems;

	public void shellSort() {
		int inner, outer;
		long temp;
		int h = 1; // find initial value of h
		while (h <= nElems / 3)
			h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
		
		while (h > 0) // decreasing h, until h=1
		{
			// h-sort the file
			for (outer = h; outer < nElems; outer++) {
				temp = theArray[outer];
				inner = outer;
				// one subpass (eg 0, 4, 8)
				while (inner > h - 1 && theArray[inner - h] >= temp) {
					theArray[inner] = theArray[inner - h];
					inner -= h;

				}
				theArray[inner] = temp;
			} // end for
			h = (h - 1) / 3; // decrease h
		} // end while(h>0)
	} // end shellSort()
		// --------------------------------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
