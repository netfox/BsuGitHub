package bsu.training.tx.service;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;/*
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.PlatformTransactionManager;*/


public class ServiceImpl implements IService {
	public Product getProduct(String name) {
		//throw new UnsupportedOperationException();
		System.out.println("Hello from getProduct with one parameter");
		return null;
	}

	public Product getProduct(String name, String barName) {
				
		System.out.println("Hello from getProduct with two parameters");
		return null;
	}

	public void insertProduct(Product product) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
			"conf/context.xml");
		//DataSourceTransactionManager txm = (DataSourceTransactionManager) ctx.getBean("txManager");
		//Connection conn = DataSourceUtils.getConnection(dataSource);
		try {
			 //Connection conn = txm.getDataSource().getConnection();
		     /*Statement stm = conn.createStatement();
		     System.out.println("Statement is available:  " );*/
		} catch (Exception ex) {
		  System.out.println("Statement is not available: " + ex.getMessage()); 		
		}

		//throw new UnsupportedOperationException();
	}

	public void updateProduct(Product product) {
		System.out.println("Hello from updateProduct with one parameter");		
	}
}
