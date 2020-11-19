package com.demohib2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class main {

	public static void main(String[] args) {
		
Configuration con = new Configuration().configure().addAnnotatedClass(TeamIndia.class);

TeamIndia t1 = new TeamIndia("ravi4","shastri3");
TeamIndia t2 = new TeamIndia("ravi6","shastri3");
Batsman p1 = new Batsman("mahandra singh","dhoni","right",183);
Batsman p2 = new Batsman("virat","kholi","right",183);
Batsman p3 = new Batsman("suresh","raina","left",140);

Bowler p4 = new Bowler("ishanth","sharma", "right", "5/12");
        
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	
    	SessionFactory sf = con.buildSessionFactory(reg);
    	
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(t1);
    	session.save(t2);
    	session.save(p1);
    	session.save(p2);
   	    session.save(p3);
     	session.save(p4);
    	tx.commit();

	}

}
