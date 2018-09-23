package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String args[]) {
		//find xml
		//Resource r = new ClassPathResource("resources/spring.xml");
		//initialise beanFactory
		//BeanFactory factory = new XmlBeanFactory(r);
		//Another way using advanced container
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		//instantiate POJO class i.e.Test
		Test t = (Test)ap.getBean("t");
		Test t1 = (Test)ap.getBean("t");
		Test t2 = (Test)ap.getBean("t");
		
		if(t == t2) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		if(t1 == t2) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		t.hello();
	}
}
