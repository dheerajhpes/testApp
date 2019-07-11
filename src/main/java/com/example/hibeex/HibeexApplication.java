package com.example.hibeex;

import com.example.hibeex.config.HiberConfig;
import com.example.hibeex.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HibeexApplication implements CommandLineRunner {

	@Autowired
	private HiberConfig config;

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(HibeexApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SessionFactory sessionFactory=config.sessionFactory().getObject();
		Session s=sessionFactory.openSession();
		Employee employee=new Employee();
		employee.setName("Dheeraj Gupta");
		employee.setJoining(new java.util.Date());
		employee.setSalary(555500);
		s.save(employee);
	}
}
