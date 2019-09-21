/**
 * 
 */
package Array;

/**
 * @author Aryan
 *
 */
public abstract class Employee {
	int 	empId;
	String empName;
	int		empAge;
	
	Employee(){	}
	
	Employee(int empID, String empName, int empAge){
		this.empId = empID;
		this.empName = empName;
		this.empAge = empAge;
	}
	
	void display(Employee arr[], int length){
		for (int i =0 ;i<length; i++){
			if (arr[i] != null )
				System.out.println(arr[i]+"Inside Index:->"+i);
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", empName=").append(empName).append(", empAge=")
				.append(empAge).append("]");
		return builder.toString();
	}
	
	abstract void insert();
	abstract void delete();
	abstract int find();
}
