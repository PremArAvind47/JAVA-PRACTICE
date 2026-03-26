package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

	int id;
	String name;
	String department;
	double salary;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + name + department + salary;
	}

	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		Employee e1 = new Employee(1, "A", "IT", 50000);

		Employee e2 = new Employee(1, "A", "IT", 50000);
		e2.setId(2);
		e2.setName("B");
		e2.setDepartment("IT");
		e2.setSalary(90000);

		Employee e3 = new Employee(1, "A", "IT", 50000);
		e3.setId(3);
		e3.setName("C");
		e3.setDepartment("HR");
		e3.setSalary(60000);

		Employee e4 = new Employee(1, "A", "IT", 50000);
		e4.setId(4);
		e4.setName("D");
		e4.setDepartment("HR");
		e4.setSalary(70000);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		System.out.println(list);

		Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		map.forEach((dept, emp) -> {

			System.out.println(dept);

			emp.forEach(e -> {
				System.out.println(e.getName());
				System.out.println(e.getSalary());
			});

		});

	}

}
