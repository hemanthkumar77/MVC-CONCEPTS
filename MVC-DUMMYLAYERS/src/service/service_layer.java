package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.dao_layer;
import model.student;
@Service
public class service_layer {
@Autowired
private dao_layer dao;

public List<student> getdetails()
{
	 return dao.getdetails();
}
public void create_user(student obj) {
	dao.add_user(obj);
}

}
