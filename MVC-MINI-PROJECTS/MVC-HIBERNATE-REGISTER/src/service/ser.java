package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO_INTERFACE.DAO_INTER;
import Service_Interface.ser_inter;
import model.student;
@Service
public  class ser implements ser_inter {
	@Autowired
	public DAO_INTER dao;
	
	public DAO_INTER getDao() {
		return dao;
	}

	public void setDao(DAO_INTER dao) {
		this.dao = dao;
	}

	public boolean create_user(student stud) {
		return getDao().create(stud);
	}

	@Override
	public student validate(String name, int id) {
	return	getDao().validatelogin(name, id);
	}

	@Override
	public List<student> getlist() {
		
		return getDao().getusers();
	}

	@Override
	public student get_id(int id) {
		return getDao().get_by_id(id);
	}

	@Override
	public void update(student stud) {
		getDao().update_value(stud);
	}

	@Override
	public void eliminate(int id) {
	 getDao().deleteuser(id);
	}


}
