import java.io.Serializable;


public class Employee implements Serializable {
	private int empNo;
	private String eName;
	private int salary;
	private String designation;
	private String dept;
	
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(int empNo, String eName, int salary, String designation,
			String dept) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.salary = salary;
		this.designation = designation;
		this.dept = dept;
	}
	
	
}
