package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="STUDENT_INFO")
public class student {
@Id
private int id;
@Column(columnDefinition="varchar(18) NOT NULL")
private String name;
@Column(columnDefinition="varchar(12) NOT NULL")
private String department_name;
@Column(precision=1,scale=2)
private double gpa;
@Column(columnDefinition="varchar(12) NOT NULL")
private String courses;
@Column(columnDefinition="varchar(6) NOT NULL")
private String gender;
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
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}

public String getCourses() {
	return courses;
}
public void setCourses(String courses) {
	this.courses = courses;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public student() {
	super();
}

}
