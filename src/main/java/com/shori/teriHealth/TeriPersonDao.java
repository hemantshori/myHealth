package com.shori.teriHealth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shori.myHealth.JdbcConnection;
@Component

public class TeriPersonDao {
	
	@Autowired
	TeraJdbcConnection teraJdbcConnection;

	public TeraJdbcConnection getTeraJdbcConnection() {
		return teraJdbcConnection;
	}

	public void setTeraJdbcConnection(TeraJdbcConnection teraJdbcConnection) {
		this.teraJdbcConnection = teraJdbcConnection;
	}


}
