package DAO_INTERFACE;

import java.util.List;

import MODEL.employee;

public interface DAO {

public abstract	boolean insert(employee emp);

public abstract List<employee> get_details();

public abstract employee get_check(int id, String name);

public abstract employee get_by(int id);

public abstract boolean updateval(employee emp);

public abstract boolean delete_value(int parseInt);

}
