package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entities.Admin;
import com.nt.entities.HardwareEmployee;
import com.nt.entities.SoftwareEmployee;

public class InheritanceClassTest {

	public static void main(String[] args) {
		SoftwareEmployee semp=new SoftwareEmployee();
		semp.setEmail("xyz@gmail.com");
		semp.setId(444);
		semp.setName("XYZ");
		semp.setSalary(15000);
		semp.setTool("Spring");
		
		HardwareEmployee hemp= new HardwareEmployee();
		hemp.setEmail("lmn@gmail.com");
		hemp.setId(555);
		hemp.setName("LMN");
		hemp.setSalary(10000);
		hemp.setWorkingHours(8);
		
	    Admin admin=new Admin();
	    admin.setEmail("abc@gmail.com");
	    admin.setId(666);
	    admin.setName("ABC");
	    admin.setSalary(5000);
	    admin.setBranchName("AMEERPET");
		
		
		Configuration configuration = new Configuration().configure("/com/nt/cfgs/hibernate.cfg.xml");
		
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session =factory.getCurrentSession();
		
		Transaction transaction =session.beginTransaction();
		 Integer no1=(Integer)session.save(semp);
		 Integer no2=(Integer)session.save(hemp);
		 Integer no3=(Integer)session.save(admin);
		 
	     session.getTransaction().commit();
	    
	}
	

}
