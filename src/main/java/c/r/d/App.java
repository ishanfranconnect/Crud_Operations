package c.r.d;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        State s1=new State();
        s1.setS_id(1);
        s1.setS_name("Bihar");
        
        Capital c1=new Capital();
        c1.setC_id(2);
        c1.setC_name("Patna");
        

        c1.setS(s1);
        Configuration cfg=new Configuration();
        cfg.configure("/h/t/a/hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();

        session.save(c1);

        s1.setC(c1);
        session.save(s1);
        
        tr.commit();

        











// //        it is used at the time of creating
//        Employee eo1=new Employee();
//        eo1.setEmp_fname("hello");
//        eo1.setEmp_lname("ishan");
//        eo1.setEmp_city("newdelhi");

//        Phone ao=new Phone();
//        ao.setId(6);
//     //    copy constructor
//        eo1.setPhone(ao);
//        try {
//        	session.save(eo1);
//        	tr.commit();
//        	System.out.println("data saved");
//        } catch(Exception e) {
//        	tr.rollback();
//        	e.printStackTrace();
//        }
        
        
//        now fetching data from database;
//        try {
//       	 Employee eo2=session.get(Employee.class, 1);
//       	if(eo2!=null) {
//       	 System.out.println("Id:"+eo2.getEmp_id());
//       	 System.out.println("Fname is"+eo2.getEmp_fname());
//       	System.out.println("lname is"+eo2.getEmp_lname());
//       	System.out.println("city is"+eo2.getEmp_city());
//       	}
//       	else {
//       		System.out.println("data not found");
//       	}
//       } catch(Exception e) {
//    	   e.printStackTrace();
//       }
        
        
//        now updating data to database
//        

//        delete data from database
        // try {
        // Employee eo4=new Employee();
        // eo4.setEmp_id(1);
        // session.delete(eo4);
        // tr.commit();
        // System.out.println("data deleted");
        // } catch(Exception e) {
        // 	tr.rollback();
        // 	e.printStackTrace();
        // }
    }
}
