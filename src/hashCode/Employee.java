package hashCode;

public class Employee {
	int id;
	String name;
	int age;
	
	public Employee(int id,String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int hashCode() {
		return id;
	}
	
	public boolean equals(Object o) {
		Employee emp = (Employee) o;
		if(emp.id == this.id) {
			return true;
		}
		else return false;
	}
}
