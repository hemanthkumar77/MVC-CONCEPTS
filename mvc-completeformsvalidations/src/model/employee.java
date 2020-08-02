package model;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class employee {
@NotNull (message="please fill the values")
@Range(min=100,max=700,message="invalid id")
@Digits(integer=3,fraction=0,message="not following three digit entry")
private int emp_id;

@NotBlank (message="please fill the values")
@Length(min=5,max=18,message="atleast min=5 characther max=18 characther")
private String emp_name;

@Range(min=1,max=7,message="not in the range")
@NotNull(message="please fill the values")
@Digits(integer=1,fraction=0,message="not following single digit entry")
private String dept_id;

@DateTimeFormat(pattern = "dd-MM-yyyy")
@Past(message="please enter the correct dob")
@NotNull(message="please fill the DOB")
private Date DOB;

@Email(message="invalid email address")
@NotBlank(message="please fill the values")
private String email;

@DateTimeFormat(pattern = "dd-MM-yyyy")
@Future(message="not in the correct date")
@NotNull(message="please fill the joining date")
private Date joining;


@NotBlank(message="please fill the values")
@Length(min=4,max=12,message="min characther=4 and max=12")
private String dept_name;

//@NotBlank(message="please fill the values")
private String gender;

//(message="please fill the values")
private String position;

@NotNull(message="please fill the values")
@Digits(integer=5,fraction=3,message="correct format")
private double salary;

@Valid
private address add;

public Date getJoining() {
	return joining;
}
public void setJoining(Date joining) {
	this.joining = joining;
}

public Date getDOB() {
	return DOB;
}
public void setDOB(Date dOB) {
	DOB = dOB;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getDept_id() {
	return dept_id;
}
public void setDept_id(String dept_id) {
	this.dept_id = dept_id;
}
public String getDept_name() {
	return dept_name;
}
public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public address getAdd() {
	return add;
}
public void setAdd(address add) {
	this.add = add;
}
public employee()
{
	
}
}
