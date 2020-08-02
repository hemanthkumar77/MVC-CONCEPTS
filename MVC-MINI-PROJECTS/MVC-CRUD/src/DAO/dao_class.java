package DAO;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import DAO_INTERFACE.DAO;
import MODEL.employee;
import SERVICE_INTERFACE.SER_INTER;
@Repository
public class dao_class implements DAO {
    @Autowired
	private SessionFactory sf;
	public SessionFactory getSF() {
		return sf;
	}
	public void setSF(SessionFactory sF) {
		sf = sF;
	}
	@Override
	public boolean insert(employee emp) {
		int id=0;
		try(Session session=getSF().openSession())
		{
			session.beginTransaction();
			id=(int) session.save(emp);
			session.getTransaction().commit();
		}
		catch(Exception e)
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
	public List<employee> get_details() {
		try(Session session=getSF().openSession())
		{
		String hql="from employee";
		Query<employee>query=session.createQuery(hql,employee.class);
		List<employee>object=query.list();
		return object;
		}
	}
	@Override
	public employee get_check(int id, String name) {
		employee emp=null;
		try(Session session=getSF().openSession())
		{
			String hql="from employee where id=? and name=?";
			Query<employee>query=session.createQuery(hql,employee.class);
			query.setParameter(0,id);
			query.setParameter(1,name);
			emp=query.uniqueResult();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return emp;
	}
	@Override
	public employee get_by(int id) {
		employee emp=null;
		try(Session session=getSF().openSession())
		{
		String hql="from employee where id=?";
		Query<employee>query=session.createQuery(hql,employee.class);
		query.setParameter(0,id);
		emp=query.uniqueResult();
	  }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return emp;
	}
	@Override
	public boolean updateval(employee emp) {
		int id=0;
		try(Session session=getSF().openSession())
		{
			String HQl="update employee set dept_id=?,dept_name=?,salary=?,taxes=? where id=? and name=?";
			Query query=session.createQuery(HQl);
			
			query.setParameter(0,emp.getDept_id());
			query.setParameter(1,emp.getDept_name());
			query.setParameter(2,emp.getSalary());
			query.setParameter(3,emp.getTaxes());
			query.setParameter(4,emp.getId());
			query.setParameter(5,emp.getName());
			session.beginTransaction();
			
			id=query.executeUpdate();
			System.out.print(id);
			if(id>0)
			{
				System.out.print("value updated successfully");
			}
			session.getTransaction().commit();
		}
		catch (Exception e)
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
	public boolean delete_value(int parseInt) {
		int id=0;
		try(Session session=getSF().openSession())
		{
			String Hql="delete from employee where id=?";
			 Query query=session.createQuery(Hql);
			 query.setParameter(0,parseInt);
		       session.beginTransaction();
		        id=query.executeUpdate();
		       if(id>0)
		       {
		    	   System.out.print("deleted the record");
		       }
		       else
		       {
		    	   System.out.print("record not in DB");
		       }
		       session.getTransaction().commit();
		}
		catch(Exception e)
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
	   
}
