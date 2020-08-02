package Model;

import java.util.List;

public class employee {
private int id;
private String name;
private String gender;
private Long phone_num;
public Long getPhone_num() {
	return phone_num;
}
public void setPhone_num(Long phone_num) {
	this.phone_num = phone_num;
}
private List<String>courses;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public List<String> getCourses() {
	return courses;
}
public void setCourses(List<String> courses) {
	this.courses = courses;
}
public employee()
{
	
}
}
