package DAO_INTERFACE;

import java.util.List;

import model.student;
import model.validate;

public interface DAO_INTER {
public boolean create(student stud);
public student validatelogin(String name,int id);
public List<student> getusers();
public student get_by_id(int id);
public void update_value(student stud);
public abstract void deleteuser(int id);

}
