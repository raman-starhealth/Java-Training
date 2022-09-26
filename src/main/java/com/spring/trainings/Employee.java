package com.spring.trainings;

import java.util.List;

public class Employee {

	private String name;
	private int id;
	private String salary ;
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Employee(String name, int id, String salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public Employee(String name, int id, String salary, List<String> address) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
}
