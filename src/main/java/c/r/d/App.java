package c.r.d;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Employee2 e1=new Employee2();
        e1.setEmp_id(11);
        e1.setEmp_name("Ishan");


        Employee2 e2=new Employee2();
        e2.setEmp_id(12);
        e2.setEmp_name("Ishita");
        
        Project p1=new Project();
        p1.setPro_id(101);
        p1.setPro_name("Facebook Project");

        Project p2=new Project();
        p2.setPro_id(102);
        p2.setPro_name("Amazon Project");

        // list1 me sare Employee2 ka data h
        List<Employee2>list1=new ArrayList<Employee2>();
        list1.add(e1);
        list1.add(e2);

        // list2 me sare project ka data h
        List<Project>list2=new ArrayList<Project>();
        list2.add(p1);
        list2.add(p2);

        e1.setP(list2);
        p2.setE(list1);



        
        // when we use onetoone then this is the object of that class
        // State s1=new State();
        // s1.setS_id(1);
        // s1.setS_name("Bihar");
        
        // Capital c1=new Capital();
        // c1.setC_id(2);
        // c1.setC_name("Patna");
        // c1.setS(s1);
        // s1.setC(c1);
        //  session.save(c1);
        // session.save(s1);
        // tr.commit();


// this is used in the onetomany and manytoone mapping line 32 se 58 
//         Employee1 e1=new Employee1();
//         e1.setEmp_id(1);
//         e1.setEmp_name("Ishita");

//         Laptop lp1=new Laptop();
//         lp1.setlapy_id(105);
//         lp1.setlapy_name("A");

//         Laptop lp2=new Laptop();
//         lp2.setlapy_id(106);
//         lp2.setlapy_name("B");

//         Laptop lp3=new Laptop();
//         lp3.setlapy_id(107);
//         lp3.setlapy_name("C");

//         List<Laptop>list=new ArrayList<Laptop>();
//         list.add(lp1);
//         list.add(lp2);
//         list.add(lp3);
// //  line 53 is written for mapping onetomany
//         e1.setLpts(list);

// // but line 56 57 58 is written for mapping manytoone
//        lp1.setE(e1);
//        lp2.setE(e1);
//        lp3.setE(e1);


        

        Configuration cfg=new Configuration();
        cfg.configure("/h/t/a/hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
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
