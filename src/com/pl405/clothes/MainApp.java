package com.pl405.clothes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainApp {

	public static void main(String[] args) {
	
		Clothes clt = new Clothes();
		
		clt.setProd_id(1);
		clt.setProd_size("M");
		clt.setProd_type("Top");
		clt.setProd_gender("female");
		
		SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		session.save(clt);
		
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
	}

}
