package client;

import MyTest1.UserComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClient {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
		UserComponent testBean = (UserComponent) ac.getBean("testBean");
		System.out.println(testBean.toString());
	}

}