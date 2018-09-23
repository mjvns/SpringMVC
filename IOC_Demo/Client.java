package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String args[]) {
		//Resource r = new ClassPathResource("resource/spring.xml");
		ApplicationContext factory = new ClassPathXmlApplicationContext("resource/spring.xml");
		//Test t = (Test)factory.getBean("t");
	}
}
