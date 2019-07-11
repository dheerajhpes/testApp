package com.example.hibeex.config;

import com.example.hibeex.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import javax.sql.DataSource;



@Configuration
public class HiberConfig {

    @Autowired
    public DataSource dataSource;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setPackagesToScan("com.example.hibeex.entity");
        sessionFactory.setAnnotatedClasses(Employee.class);
        sessionFactory.setDataSource(dataSource);

        return sessionFactory;
    }
}

