package model;

public class student {
private int id;
private String name;
private int department_id;
private String department;
private double salary;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getDepartment_id() {
	return department_id;
}
public String getDepartment() {
	return department;
}
public double getSalary() {
	return salary;
}
public student(int id, String name, int department_id, String department, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.department_id = department_id;
	this.department = department;
	this.salary = salary;
}

}
