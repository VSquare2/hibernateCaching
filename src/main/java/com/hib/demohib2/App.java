package com.hib.demohib2;

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
        Alien a=new Alien();
        a.setAname("yukta");
        a.setColor("green");
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
        
        // It acts as a central repository for accessing various services
        //and configurations required by Hibernate during its operation.
        // to manage services such as database connections, transaction management, caching, event listeners, and other essential functionalities. 
        ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
     
        
        SessionFactory sf=con.buildSessionFactory(reg);
        
        //It opens the Connection/Session with Database 
        Session s= sf.openSession();
        
        //basic operations
//        Transaction t = s.beginTransaction();
//        s.save(a);
//        a=(Alien)s.get(Alien.class,102);
//        System.out.println(a);
//        t.commit();
        
        
        //CACHING
//        Session s1= sf.openSession();
//        Transaction t1 = s.beginTransaction(); 
//        a=(Alien)s.get(Alien.class,102);
//        System.out.println(a);
//        t1.commit();
//        s1.close();
//        
//        
//        Session s2= sf.openSession();
//        Transaction t2 = s.beginTransaction(); 
//        a=(Alien)s2.get(Alien.class,102);
//        System.out.println(a);
//        t2.commit();
//        s2.close();
//        

        
        
        
        
        
        
        
        
        
    }
}
