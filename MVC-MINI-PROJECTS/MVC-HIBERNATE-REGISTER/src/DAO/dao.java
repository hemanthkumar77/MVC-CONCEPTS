package DAO;
import java.util.List;
import DAO_INTERFACE.DAO_INTER;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import DAO_INTERFACE.DAO_INTER;
import model.student;

@Repository
public class dao implements DAO_INTER {
	@Autowired
	private SessionFactory SF;
	 
	public SessionFactory getSf() {
	return SF;
}

public void setSf(SessionFactory sf) {
	this.SF = sf;
}
	public boolean create(student stud) {
	
		int id=0;
		try(Session session=getSf().openSession())
		{
			session.beginTransaction();
			 id= (int) session.save(stud);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		if(id>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public student validatelogin(String name, int id) {
		student object=null;
		try(Session session=getSf().openSession())
		{
		String hql="from student where id=? and name=?";
		Query<student>query=session.createQuery(hql,student.class);
		 query.setParameter(0,id);
		 query.setParameter(1,name);
		 object=query.uniqueResult();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return object;
	}


	public List<student> getusers() {
		List<student>obj=null;
		try(Session session=getSf().openSession())
		{
			String Hql="from  student";
			Query<student>query=session.createQuery(Hql,student.class);
			obj =query.list();
		}
		return obj;
	}
	
	@Override
	public student get_by_id(int id) {
		student obj=null;
		try(Session session=getSf().openSession())
		{
			String Hql="from student where id=?";
			Query<student>query=session.createQuery(Hql,student.class);
			 query.setParameter(0,id);
			 obj=query.uniqueResult();	
		}
		return obj;
	}

	@Override
	public void update_value(student stud) {
		

		try(Session session=getSf().openSession())
		{
		String HQl="update student set department_name=?,gpa=?,courses=? where id=? and name=?";
		Query query=session.createQuery(HQl);
		 query.setParameter(0,stud.getDepartment_name());
		 query.setParameter(1,stud.getGpa());
		 query.setParameter(2,stud.getCourses());
		 query.setParameter(3,stud.getId());
		 query.setParameter(4,stud.getName());
		 session.beginTransaction();
		int value=query.executeUpdate();
		if(value>0)
		{
			System.out.print("value updated successfully");
		}
		session.getTransaction().commit();
		
	}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}

	

	@Override
	public void deleteuser(int id) {
		
		try(Session session=getSf().openSession())
		{
		String Hql="delete from student where id=?";
	    Query query=session.createQuery(Hql);
	    query.setParameter(0,id);
	    session.beginTransaction();
	     query.executeUpdate();
	     session.getTransaction().commit();
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
