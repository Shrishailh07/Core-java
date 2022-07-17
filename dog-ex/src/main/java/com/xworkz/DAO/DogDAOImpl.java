package com.xworkz.DAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.xworkz.doggy.dog;
import jakarta.persistence.RollbackException;
import com.xworkz.sessionfactoryp.*;

public class DogDAOImpl implements DogDAO {
	
	@Override
	public void savedog() {
	SessionFactory sessionFactory=SessionFactoryProvider.getSessionFactory();
      try (Session session = sessionFactory.openSession()){
		;
		//dog d = new dog(7,"lab","White","male");		
		//session.save(d);
		
		Transaction transaction = session.beginTransaction();		
		transaction.commit();
	}
      catch (HibernateException e) {
	}
      catch (RollbackException r) {
 	}
      catch(NullPointerException n) {  
      }

	}
	@Override
	public void getDogId(int id) {
		SessionFactory sessionFactory=SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()){
		 ;
		dog d1 = session.find(dog.class, id);
		System.out.println("The Dog Name is "+d1.getName());
		Transaction transaction = session.beginTransaction();		
		transaction.commit();
		}
		catch (IllegalArgumentException i) {
		}
		catch (HibernateException e) {
		}
	    catch (RollbackException r) {
	 	}
	}
	@Override
	public void update() {
		SessionFactory sessionFactory=SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()){
		Transaction transaction = session.beginTransaction();		
		dog db = session.get(dog.class, 5);
		db.setName("chetan");
		transaction.commit();
		}
		catch (IllegalArgumentException i) {
		}
		catch (HibernateException e) {
		}
	    catch (RollbackException r) {
	 	}
	}
	
	@Override
	public void delete() {
		SessionFactory sessionFactory=SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()){
		 ;
		dog dk = session.find(dog.class,7);
		session.remove(dk);
		Transaction transaction = session.beginTransaction();		
		transaction.commit();
		session.close();
		}
		catch (IllegalArgumentException i) {
		}
		catch (HibernateException e) {
		}
	      catch (RollbackException r) {
	 	}
      }
	}
