package com.shori.teriHealth;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.shori.myHealth.MyHealthApplicationJDBC;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
                                      proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TeraJdbcConnection {

	
	public void jdbcConnection()
	{
System.out.println("kiddan paji?");
	}

	
	
	@PostConstruct
	public void testPostConstruct()
	{
		
	}
	
	@PreDestroy
	public void testPreDistroy()
	{
		
}
}
