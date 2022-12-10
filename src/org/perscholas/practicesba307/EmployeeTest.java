package org.perscholas.practicesba307;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] firstName = { "Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana" };

		String[] lastName = { "Riddle", "Zavala", "Ho", "Saunders", "Morgan", "Schroeder", "Nolan", "Orr" };

		String[] department = { "production", "r&d", "sales", "marketing", "human resources", "accounting", "sales",
				"r&d" };
		
		System.out.println(addEmployes(firstName, lastName, department));
	}

	public static ArrayList<Employee> addEmployes(String[] first, String[] last, String[] department) {
		ArrayList<Employee> employees = new ArrayList<>();
		for (int i = 0; i < first.length; i++) {
			employees.add(new Employee(first[i], last[i], department[i]));
		}
		return employees;
	}

}

class Employee {
	private String firstName;
	private String lastName;
	private String department;

	public Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s", this.firstName, this.lastName, this.department);
	}
}
