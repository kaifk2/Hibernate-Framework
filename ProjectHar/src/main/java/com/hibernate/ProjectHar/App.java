package com.hibernate.ProjectHar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory  = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction trans = session.beginTransaction();
    	
 

    	Address ad = new Address();
    	ad.setEmployeeId(001);
    	ad.setName("saif");
    	ad.setSalary(120000);
    	ad.setMoblieno(911041720);
    	ad.setImage(null);
    	ad.setDeptName("Fontend");
    	
    	Address ad1 = new Address();
    	ad1.setEmployeeId(002);
    	ad1.setName("azeem");
    	ad1.setSalary(300023);
    	ad1.setMoblieno(124533);
    	ad1.setImage(null);
    	ad1.setDeptName("Backend");
    
    
    	StudentOne st = new StudentOne();
    	st.setName("Mohon");
    	st.setRollNo(901);
    	st.setAge(23);
    	st.setAdder(ad);
    	
    	StudentOne st1 = new StudentOne();
    	st.setName("Rohon");
    	st.setRollNo(902);
    	st.setAge(24);
    	st.setAdder(ad);
    	
    	StudentOne st2 = new StudentOne();
    	st.setName("Rani");
    	st.setRollNo(903);
    	st.setAge(18);
    	st.setAdder(ad1);
    	
    	
    	session.save(st);
    	session.save(st1);
    	session.save(st2);
    	
    	
    	session.save(ad);
    	session.save(ad1);
    	
    	trans.commit();
    	
    	
    	System.out.println("Student object is saved");
    	
    }


    }




 

