package com.rajhibernate.DemoHib;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	Alien raj = new Alien();
    	raj.setAid(13);
    	raj.setAname("John");
    	raj.setColor("Green");
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
    	
    	
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	session.save(raj);
    	tx.commit();
    	
    }
}
