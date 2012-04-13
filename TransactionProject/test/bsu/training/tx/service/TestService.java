package bsu.training.tx.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestService {
	public static void main(final String[] args) throws Exception {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"conf/context.xml");
		IService service = (IService) ctx.getBean("service");
		//service.insertProduct(new Product());
		service.updateProduct(new Product());
		service.getProduct("");
		service.getProduct("","");
	}
}
