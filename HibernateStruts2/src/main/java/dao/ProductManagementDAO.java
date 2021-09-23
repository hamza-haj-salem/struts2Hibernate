package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import model.LoginInfo;
import model.Product;

public class ProductManagementDAO {
	
	
	public static List<Product> getAllProducts(){
		
		
		List<Product> productList = new ArrayList<Product>();
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Product.class); // configure() pour utiliser le fichier hibernate.cfg.xml
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(reg);
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//session.save(p1);
		
		//tx.commit();
		
		//productList = (List<Product>)session.createSQLQuery("select * from product").list();
		
		productList.addAll(session.createCriteria(Product.class).list());
		System.out.println("dao "+productList);

		
		return productList;
		
	}
	
public static void addProduct(Product product){
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Product.class); // configure() pour utiliser le fichier hibernate.cfg.xml
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(reg);
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(product);
		
		tx.commit();

		
	}

public static void updateProduct(Product product)
{

		
	Configuration con = new Configuration().configure().addAnnotatedClass(LoginInfo.class); // configure() pour utiliser le fichier hibernate.cfg.xml
	
	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	
	SessionFactory sf = con.buildSessionFactory(reg);
	
	Session session = sf.openSession();
	
	Transaction tx = session.beginTransaction();
	
	session.merge(product);
	
	tx.commit();
}

public static void  deleteProduct(String productId)
{
	
	
	
	Configuration con = new Configuration().configure().addAnnotatedClass(Product.class); // configure() pour utiliser le fichier hibernate.cfg.xml
	
	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	
	SessionFactory sf = con.buildSessionFactory(reg);
	
	Session session = sf.openSession();
	
	Transaction tx = session.beginTransaction();
	
	Query q = session.createQuery("DELETE FROM Product WHERE productId = :productId");
	
	q.setParameter(productId, productId);
	
	tx.commit();
		
}


	
}
