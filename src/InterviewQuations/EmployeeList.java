package InterviewQuations;

public class EmployeeList {
	private int id;
	private String name;
	private int deptId;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public EmployeeList(int id, String name, int deptId, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.salary = salary;
	}
	public EmployeeList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeList [id=" + id + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
	}
	

}
