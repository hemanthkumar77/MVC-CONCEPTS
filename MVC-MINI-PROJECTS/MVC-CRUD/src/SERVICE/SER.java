package SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO_INTERFACE.DAO;
import MODEL.employee;
import SERVICE_INTERFACE.SER_INTER;

@Service
public class SER implements SER_INTER {
    @Autowired
	private DAO da;
	
	public DAO getDa() {
		return da;
	}

	public void setDa(DAO da) {
		this.da = da;
	}

	@Override
	public boolean insert_details(employee emp) {
		return getDa().insert(emp);
	}

	@Override
	public List<employee> get_list() {
		// TODO Auto-generated method stub
		return getDa().get_details();
	}

	@Override
	public employee retrive(int id, String name) {
		// TODO Auto-generated method stub
		return getDa().get_check(id,name);
	}

	@Override
	public employee user_id(int id) {
		return getDa().get_by(id);
	}

	@Override
	public boolean changeval(employee emp) {
		// TODO Auto-generated method stub
		return getDa().updateval(emp);
	}

	@Override
	public boolean delete_val(int parseInt) {
	
		return getDa().delete_value(parseInt);
	}

	

}
