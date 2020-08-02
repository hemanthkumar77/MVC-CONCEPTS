package Service_Interface;

import java.util.List;

import model.student;

public interface ser_inter{
public abstract boolean create_user(student stud);
public abstract student validate(String name,int id);
public abstract List<student> getlist();
public abstract student get_id(int id);
public abstract void update(student stud);
public abstract void eliminate(int id);

}
