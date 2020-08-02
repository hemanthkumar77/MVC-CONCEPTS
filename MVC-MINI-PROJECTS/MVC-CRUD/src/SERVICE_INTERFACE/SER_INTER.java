package SERVICE_INTERFACE;

import java.util.List;

import MODEL.employee;

public interface SER_INTER {

public abstract List<employee> get_list();

public abstract boolean insert_details(employee emp);

public abstract employee retrive(int id, String name);

public abstract employee user_id(int id);

public abstract boolean changeval(employee emp);

public abstract boolean delete_val(int parseInt);


}
