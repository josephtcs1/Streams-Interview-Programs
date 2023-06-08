package InterviewQuations;

public class Employee {
	private String name;
	private String location;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + "]";
	}
	
	
	

}
