package lab_6;

class Employee{
	public String name;
	public double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [name = " + name +", salary = " + salary +"]";
	}
}
class Manager extends Employee {
	private String department;
	
	public Manager(String name, double salary, String department) {
		super(name,salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Manager [name = " + name +", salary = " + salary +", department = " + department + "]";
	}
}
public class Exercise2_4 {
	public static void main(String[] args) {
		Employee e1 = new Employee("xyz", 20000.0 );
		Employee e2 = new Employee("abc", 15000.0 );
		Employee e3 = new Manager("XYZ", 200000.0 ,"Productions");
		Employee e4 = new Manager("ABC", 150000.0 , "Sales");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
	}
}
