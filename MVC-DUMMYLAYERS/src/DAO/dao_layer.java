package DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import model.student;
@Repository
public class dao_layer {
private static List<student>list=null;
static
{
	list=new ArrayList<>();
	list.add(new student(100,"joker",001,"java",5700.23));
	list.add(new student(101,"jigsaw",001,"java",4500.23));
	list.add(new student(201,"heathledger",002,".net",6000.23));
	list.add(new student(301,"punisher",003,"cloud_services",3500.23));
	list.add(new student(401,"batman",004,"db_admin",5000.23));
}
public List<student> getdetails()
{
	return list;
}
public void add_user(student user)
{
	list.add(user);
}
}
