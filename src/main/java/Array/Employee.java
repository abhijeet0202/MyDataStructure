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
