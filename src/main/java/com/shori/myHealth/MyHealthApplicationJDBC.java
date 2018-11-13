package com.shori.myHealth;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shori.teriHealth.TeraJdbcConnection;

@Configuration
@ComponentScan("com.shori.teriHealth")
@ComponentScan("com.shori.myHealth")
public class MyHealthApplicationJDBC {
	
	
	public static void main(String[] args) {
	
		
			try {
				AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyHealthApplicationJDBC.class);
							
					
					PersonDao pDao = applicationContext.getBean(PersonDao.class);
					PersonDao pDao2 = applicationContext.getBean(PersonDao.class);
					applicationContext.getBean(TeraJdbcConnection.class).jdbcConnection();
					System.out.println("hello");
			} catch (BeansException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		
		
	}
}


