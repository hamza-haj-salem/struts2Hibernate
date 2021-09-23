package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import model.LoginInfo;
// 33333333333333333333
public class LoginDAO {
	
	public static boolean isUserValid(LoginInfo userDetails) {
		
		boolean validStatus = false;
		try {
			
			
			LoginInfo user = new LoginInfo();
			
			//List<LoginInfo> u1 = new ArrayList<LoginInfo>();
			
			Configuration con = new Configuration().configure().addAnnotatedClass(LoginInfo.class); // configure() pour utiliser le fichier hibernate.cfg.xml
			
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			
			SessionFactory sf = con.buildSessionFactory(reg);
			
			Session session = sf.openSession();
			
			Transaction tx = session.beginTransaction();
			
			//tx.getLocalStatus();
			
	
			Query query =  session.createQuery("from LoginInfo where userName = ?");
			
			query.setParameter(0, userDetails.getUserName());//setParameter(0, userDetails.getUserName(),Hibernate.St);
			
			//user = query.getClass();
			System.out.println(userDetails.getUserName());
			
			System.out.println(user);
			
			
			if(user != null) {
				validStatus = true;
			}
			
			
			
			//u1.add(user);
			
			
			
			
			
						
		} catch (Exception e) {
			// TODO: handle exception
		}
		return validStatus;
	}

}
