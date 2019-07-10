package com.example.hibeex;

import com.example.hibeex.config.HiberConfig;
import com.example.hibeex.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HibeexApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(HibeexApplication.class, args);
		HiberConfig config=(HiberConfig) context.getBean(HiberConfig.class);
		SessionFactory ses=config.sessionFactory().getObject();
		Session s=ses.openSession();
		Employee employee=new Employee();
		employee.setName("Dheeraj Gupta");
		employee.setJoining(new java.util.Date());
		employee.setSalary(555500);
		s.save(employee);
	}
}
