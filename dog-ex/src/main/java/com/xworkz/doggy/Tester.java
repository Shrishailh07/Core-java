package com.xworkz.doggy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.DAO.DogDAOImpl;

public class Tester {

	public static void main(String[] args) {
		
		//dog dg = new dog(3,"Hennai","black","female");
		DogDAOImpl impl = new DogDAOImpl();
		impl.savedog();
		impl.getDogId(2);
		impl.update();
		impl.delete();
		
	}
}
