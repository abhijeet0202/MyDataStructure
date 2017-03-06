package Array;

public final class ArrayWithNoDupsNoOrdered extends Employee {

	//Employee Database where all employee data stored, fetched and deleted
	static Employee[] employeeDatabase = null;
	
	//Number of Elements present in DB currently
	static int currentIndex = 0;
	//Max Database size, we could not afford more than this size of Employee
	final static int MAX_SIZE = 20;

	ArrayWithNoDupsNoOrdered(int empId, String empName, int empAge) {
		super(empId, empName, empAge);
	}

	ArrayWithNoDupsNoOrdered() {
		super();
	}

	/****************************************************************************
	 * Assuming Duplicates are not Allowed									   	*
	 * **************************************************************************
	 * Every Case:																*
	 * 		To guard against human error during an insertion by checking all	*
	 * 		the data items in the array to ensure that none of them already 	*
	 *  	has the same key value as the item being inserted. This check 		*
	 *  	increases the number of steps required for an insertion from 		*
	 *  	one to N.															*		
	 *  																		*
	 * 		Insertion process is very fast, requiring only a single step.	   	*
	 *      This is true because a new item is always inserted in the first	   	*
	 *      vacant cell in the array, and the algorithm knows this location    	*
	 *      because it knows how many items are already in the array.	       	*
	 * 																		   	*
	 ****************************************************************************/
	@Override
	void insert() {
		boolean isFound = false;
		/*
		 * Looping till currentIndex, if employee Id exist, We will not add the
		 * new data else insert it in DB
		 */
		for (int i = 0; i < currentIndex; i++) {
			// Validating if EmployeeID already present or not
			if (employeeDatabase[i].empId == this.empId) {
				System.out.println("Employee ID: " + employeeDatabase[i].empId + ": already exist in Index: "+i);
				isFound = true;
			}
		}
		if (!isFound) {
			//Incrementing index to save in next location
			if(currentIndex < MAX_SIZE){
				employeeDatabase[currentIndex] = this;
				currentIndex++;
			}
			else{
				System.out.println("Database limit Reach");
			}
			
		}
	}
	/****************************************************************************	
	 * Assuming Duplicates are not Allowed									   	*
	 * **************************************************************************
	 * A deletion requires searching through an average of N/2 elements and 	*
	 * then moving the remaining elements (an average of N/2 moves) to fill 	*
	 * up the resulting hole. This is N steps in all.					   		*
	 ****************************************************************************/
	@Override
	void delete() {
		//Initializing index global so that variables can be used in 
		// next loop to fill holes.
		int index = 0;
		//Looping till currentIndex
		for (index =0; index<currentIndex; index++) {
			if (employeeDatabase[index].empId == this.empId) {
				System.out.println("Deleting Employee Id: " + employeeDatabase[index].empId + " which is present in index :" + index);
				break;
			}
		}
		//Filling the holes
		for (int i = index; i < currentIndex; i++) {
			employeeDatabase[i] = employeeDatabase[i+1];
		}
		//Decrementing current size with -1 and setting null current index "unused"
		employeeDatabase[currentIndex]= null;
		currentIndex--;
	}
	/***************************************************************************
	 * Assuming Duplicates are not Allowed									   *
	 * *************************************************************************
	 * Average Case:														   *
	 * 	If "N" is the number average steps need to find an item is N/2	       *
	 * 																		   *
	 * Worst Case:															   *
	 * 	EIther, the specified item is in the last cell, or item is not present,*
	 * Code need to traverse "N" Steps to provide answer.					   *
	 ***************************************************************************/
	@Override
	int find() {
		for (int index = 0; index < currentIndex; index++) {
			if (employeeDatabase[index].empId == this.empId) {
				System.out.println("Employee Id: " + employeeDatabase[index].empId + " is present in index :" + index);
				return index;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int size = 10;
		employeeDatabase = new ArrayWithNoDupsNoOrdered[size];
		Employee employee = null;

		employee = new ArrayWithNoDupsNoOrdered(1, "Abhijeet", 22);
		employee.insert();
		employee = new ArrayWithNoDupsNoOrdered(2, "Abhijeet", 21);
		employee.insert();
		employee = new ArrayWithNoDupsNoOrdered(1, "Abhijeet", 21);
		employee.insert();
		employee = new ArrayWithNoDupsNoOrdered(3, "Abhijeet", 21);
		employee.insert();
		employee = new ArrayWithNoDupsNoOrdered(2, "Abhijeet", 21);
		employee.insert();
		employee = new ArrayWithNoDupsNoOrdered(4, "Abhijeet", 21);
		employee.insert();
		employee.display(employeeDatabase, employeeDatabase.length);
		System.out.println("*****************Current Size:"+currentIndex);
		employee = new ArrayWithNoDupsNoOrdered(1, "Abhijeet", 21);
		employee.delete();
		System.out.println("*****************Current Size:"+currentIndex);
		employee.display(employeeDatabase, employeeDatabase.length);
		employee = new ArrayWithNoDupsNoOrdered(4, "Abhijeet", 21);
		employee.find();
		employee.delete();
		System.out.println("*****************Current Size:"+currentIndex);
		employee.display(employeeDatabase, employeeDatabase.length);
	}
}
