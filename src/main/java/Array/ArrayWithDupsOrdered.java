package Array;

/*
 *  The major advantage is that search 
 *  times are much faster than in an unordered array. The disadvantage is that insertion
 *  takes longer because all the data items with a higher key value must be moved up to
 *  make room. Deletions are slow in both ordered and unordered arrays because items
 *  must be moved down to fill the hole left by the deleted item.
 */
public class ArrayWithDupsOrdered extends Employee {

	// Employee Database where all employee data stored, fetched and deleted
	static Employee[] employeeDatabase = null;

	// Number of Elements present in DB currently
	static int currentIndex = -1;

	// Max Database size, we could not afford more than this size of Employee
	static int MAX_SIZE = 20;
	
	public static void setDataBaseSize(int size) {
		employeeDatabase = new Employee[size];
		MAX_SIZE = size;
	}

	public ArrayWithDupsOrdered() {
	}

	public ArrayWithDupsOrdered(int empID, String empName, int empAge) {
		super(empID, empName, empAge);
	}

	/****************************************************************************
	 * Assuming Duplicates are Allowed *
	 * ************************************************************************* *
	 * Every Case: * Insertion process is very slow, insertion
	 *  takes longer because all the data items with a higher key value must be moved up to
	 *  make room
	 ****************************************************************************/
	@Override
	void insert() {

		if (currentIndex == -1) {
			employeeDatabase[++currentIndex] = this;
			return;
		}
		if (currentIndex == MAX_SIZE - 1) {
			System.out.println("Database limit Reach");
			return;
		}

		int lowerIndex = 0, higherIndex = currentIndex;
		int currentLocation = 0;

		while (true) {
			currentLocation = (lowerIndex + higherIndex) / 2;

			if (employeeDatabase[currentLocation].empId < this.empId) {
				lowerIndex = currentLocation + 1;
				if (lowerIndex > higherIndex) {
					currentLocation = currentLocation + 1;
					break;
				}
			} else
				higherIndex = currentLocation - 1;
			
			if (lowerIndex > higherIndex) {
				break;
			}
		}

		for (int index = currentIndex; index >= currentLocation; index--) {
			employeeDatabase[index + 1] = employeeDatabase[index];
		}
		employeeDatabase[currentLocation] = this;
		currentIndex++;
	}

	/****************************************************************************
	 * Assuming Duplicates are Allowed *
	 * ************************************************************************** In
	 * This we will delete only the first occurance of matched item *
	 * ************************************************************************** A
	 * deletion requires searching through an average of N/2 elements and * then
	 * moving the remaining elements (an average of N/2 moves) to fill * up the
	 * resulting hole. This is N steps in all. *
	 ****************************************************************************/
	@Override
	void delete() {
		int currentLocation = find();
		if (currentLocation == -1)return;
		for (int index = currentIndex; index > currentLocation; currentLocation++) {
			employeeDatabase[currentLocation] = employeeDatabase[currentLocation + 1];
		}

		employeeDatabase[currentIndex] = null;
		currentIndex--;

	}

	/***************************************************************************
	 * Assuming Duplicates are Allowed and data is in Sorted Order BINARY SEARCH *
	 * ************************************************************************* In
	 * This we will find only the first occurrence of matched item *
	 * **************************************************************************
	 * Average Case: * If "N" is the number average steps need to find an item is
	 * N/2 * * Worst Case: * EIther, the specified item is in the last cell, or item
	 * is not present,* Code need to traverse "N" Steps to provide answer. *
	 ***************************************************************************/
	@Override
	int find() {
		// Initializing lower Index and higher Index [Assuming]
		int lowerIndex = 0, higherIndex = currentIndex;
		// Initializing half of lower and higher

		if (currentIndex == -1) {
			System.out.println("No Value Present In DB for Search");
			return -1;
		}
		// Start Infinite Loop
		while (true) {
			int currentLoc = (lowerIndex + higherIndex) / 2;
			// Check Current Location element is matching if yes
			if (employeeDatabase[currentLoc].empId == this.empId) {
				System.out.println(
						"Employee Id: " + employeeDatabase[currentLoc].empId + " is present in index :" + currentLoc);
				return currentLoc;
			} else if (lowerIndex > higherIndex) {
				System.out.println("Employee Id: " + this.empId + " is not present in Database");
				return -1;
			} else {
				if (employeeDatabase[currentLoc].empId < this.empId) {
					lowerIndex = currentLoc + 1;
				} else {
					higherIndex = currentLoc - 1;
				}
			}
		}
	}

}
