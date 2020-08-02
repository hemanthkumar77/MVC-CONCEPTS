package MODEL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="emp_info")
public class employee {
@Id
@Column(name="emp_id")
@NotNull (message="please fill the values")
@Digits(integer=3,fraction=0,message="not following three digit entry")
@Range(min=100,max=700,message="invalid id")
private int id;

@Column(name="emp_name",nullable=false,columnDefinition="varchar(21)")
@NotBlank(message="please fill the values")
@Length(min=6,max=21,message="name should be betwwen 6 and 21 characters")
private String name;

@Column(name="department_id",nullable=false)
@NotNull (message="please select the values")
private int dept_id;

@Column(name="department_name",nullable=false,columnDefinition="varchar(27)")
@NotNull (message="please select the values")
private String dept_name;

@NotNull (message="please enter the salary within the format")
@Digits(integer=6,fraction=3)
@Column(precision=6,scale=3)
@Range(min=1000,max=100000,message="invalid salary details")
private double salary;

@NotNull (message="please enter the tax values")
@Digits(integer=5,fraction=3)
@Column(precision=5,scale=3)
@Range(min=100,max=10000,message="invalid ")
private double taxes;

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
public int getDept_id() {
	return dept_id;
}
public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}
public String getDept_name() {
	return dept_name;
}
public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getTaxes() {
	return taxes;
}
public void setTaxes(double taxes) {
	this.taxes = taxes;
}
public employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
