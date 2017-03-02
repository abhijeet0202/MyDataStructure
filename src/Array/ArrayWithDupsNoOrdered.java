package Array;

public class ArrayWithDupsNoOrdered extends Employee {

	//Employee Database where all employee data stored, fetched and deleted
	static Employee[] employeeDatabase = null;
		
	//Number of Elements present in DB currently
	static int currentIndex = -1;
	
	//Max Database size, we could not afford more than this size of Employee
	final static int MAX_SIZE = 20;
	
	public ArrayWithDupsNoOrdered() {
	}

	public ArrayWithDupsNoOrdered(int empID, String empName, int empAge) {
		super(empID, empName, empAge);
	}

	/****************************************************************************
	 * Assuming Duplicates are  Allowed									   	*
	 * **************************************************************************
	 * Every Case:																*
	 * 		Insertion process is very fast, requiring only a single step.	   	*
	 *      This is true because a new item is always inserted in the first	   	*
	 *      vacant cell in the array, and the algorithm knows this location    	*
	 *      because it knows how many items are already in the array.	       	*
	 * 																		   	*
	 ****************************************************************************/
	@Override
	void insert() {
		if (currentIndex+1 <= MAX_SIZE){
				employeeDatabase[++currentIndex] = this;
			}
		}

	/****************************************************************************	
	 * 	Assuming Duplicates are Allowed									   		*
	 * **************************************************************************
	 * In This we will delete only the first occurance of matched item								   		*
	 * **************************************************************************
	 * A deletion requires searching through an average of N/2 elements and 	*
	 * then moving the remaining elements (an average of N/2 moves) to fill 	*
	 * up the resulting hole. This is N steps in all.					   		*
	 ****************************************************************************/
	@Override
	void delete() {
		//Initializing index global so that variables can be used in 
		// next loop to fill holes.
		int index =0;
		//Looping till currentIndex
		for (; index < currentIndex ;index++){
			if (employeeDatabase[index].empId == this.empId)
				break;
		}
		//Filling the holes
		for (int i = index; i < currentIndex +1; i++){
			employeeDatabase[i] = employeeDatabase[i +1];
		}
		//Decrementing current size with -1
		currentIndex--;
	}
	/****************************************************************************	
	 * 	Assuming Duplicates are Allowed									   		*
	 * **************************************************************************
	 * In This we will delete all the occurance of matched item								   		*
	 * **************************************************************************
	 * A deletion requires searching through an average of N/2 elements and 	*
	 * then moving the remaining elements (an average of N/2 moves) to fill 	*
	 * up the resulting hole. This is more than N steps in all.
	 * 
	 * N comparisons, more than N/2 moves					   		*
	 ****************************************************************************/
	void deleteAllOccurance() {
		// Initializing index global so that variables can be used in
		// next loop to fill holes.
		int index = 0;
		// Looping till currentIndex
		for (; index <= currentIndex; index++) {
			if (employeeDatabase[index].empId == this.empId) {
				// Filling the holes
				for (int j = index; j < currentIndex + 1; j++) {
					employeeDatabase[j] = employeeDatabase[j+1];
				}
				//Decrementing current size with -1
				currentIndex--;
				/*
				 * Re-setting to 0, so that if element which we are deleting present
				 * in 0th index will not be missed.
				 * Let Say, we are searching for element 1
				 * Now, currently value's are present in this way
				 * 1,1,2,3, so in first occur 0th element 1 will removed, now current situation
				 * will be like this 1,2,3, Again 1 is in 0th element
				 */
				index = 0;
			}
		}
	}
	/***************************************************************************
	 * Assuming Duplicates are Allowed									   	   *
	 * *************************************************************************
	 * In This we will find only the first occurrence of matched item								   		*
	 * **************************************************************************
	 * Average Case:														   *
	 * 	If "N" is the number average steps need to find an item is N/2	       *
	 * 																		   *
	 * Worst Case:															   *
	 * 	EIther, the specified item is in the last cell, or item is not present,*
	 * Code need to traverse "N" Steps to provide answer.
	 * 				   *
	 ***************************************************************************/
	@Override
	int find() {
		for (int index =0; index <= currentIndex; index++){
			if (employeeDatabase[index].empId == this.empId){
				System.out.println("Employee Id: " + employeeDatabase[index].empId + " is present in index :" + index);
				return index;
			}
		}
		return -1;
	}
	/***************************************************************************
	 * Assuming Duplicates are Allowed									   	   *
	 * *************************************************************************
	 * In This we will find all the occurrence of matched item								   		*
	 * **************************************************************************
	 * Average Case:														   *
	 * 	If "N" is the number average steps need to find an item is N/2	       *
	 * 																		   *
	 * Worst Case:															   *
	 * 	EIther, the specified item is in the last cell, or item is not present,*
	 * Code need to traverse "N" Steps to provide answer.					   *
	 * N comparisons, more than N moves					   					   *
	 ***************************************************************************/
	void findAllOccurance() {
		for (int index =0; index < employeeDatabase.length; index++){
			if (employeeDatabase[index] != null && employeeDatabase[index].empId == this.empId){
				System.out.println("Employee Id: " + employeeDatabase[index].empId + " is present in index :" + index);
			}
		}
	}
	public static void main(String[] args) {
		int size = 10;
		employeeDatabase = new ArrayWithDupsNoOrdered[size];
		ArrayWithDupsNoOrdered employee = null;

		employee = new ArrayWithDupsNoOrdered(1, "Abhijeet", 22);
		employee.insert();
		employee = new ArrayWithDupsNoOrdered(2, "Abhijeet", 21);
		employee.insert();
		employee = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		employee.insert();
		employee = new ArrayWithDupsNoOrdered(3, "Abhijeet", 21);
		employee.insert();
		employee = new ArrayWithDupsNoOrdered(2, "Abhijeet", 21);
		employee.insert();
		employee = new ArrayWithDupsNoOrdered(4, "Abhijeet", 21);
		employee.insert();
		employee.display(employeeDatabase, employeeDatabase.length);
		System.out.println("*****************Current Size:"+currentIndex);
		employee = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		employee.delete();
		System.out.println("*****************Current Size:"+currentIndex);
		employee.display(employeeDatabase, employeeDatabase.length);
		employee = new ArrayWithDupsNoOrdered(4, "Abhijeet", 21);
		employee.find();
		employee.delete();
		System.out.println("*****************Current Size:"+currentIndex);
		employee.display(employeeDatabase, employeeDatabase.length);
		employee = new ArrayWithDupsNoOrdered(2, "Abhijeet", 22);
		employee.deleteAllOccurance();
		System.out.println("*****************Current Size:"+currentIndex);
		employee.display(employeeDatabase, employeeDatabase.length);

	}

}
