package com.nt.utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	static {
		try {
		InputStream is=null;	
		Properties props=null;
		Configuration cfg=null;
		//Bootstrap the hibernate
		cfg=new Configuration();
		//locate properties file
		is=new FileInputStream("src/com/nt/commons/myfile.properties");
		props=new Properties();
		props.load(is);
		cfg.setProperties(props);
		//add mapping file
		cfg.addFile("src/com/nt/entity/Employee.hbm.xml");
		//build SessionFactory
		factory=cfg.buildSessionFactory();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public  static Session getSession() {
		Session ses=null;
		if(factory!=null)
			ses=factory.openSession();
		return ses;
	}
	
	public  static  void   closeSession(Session ses) {
		if(ses!=null)
			ses.close();
	}
	
	public static void  closeSessionFactory() {
		if(factory!=null)
			factory.close();
	}

}
