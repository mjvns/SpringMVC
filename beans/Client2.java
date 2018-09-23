package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client2 {
	public static void main(String args[]) {
		//find xml
		Resource r = new ClassPathResource("resources/Spring2.xml");
		//initialise beanFactory
		BeanFactory factory = new XmlBeanFactory(r);
		//instantiate POJO class i.e.Test
		Test t = (Test)factory.getBean("t");
		Test t1 = (Test)factory.getBean("t");
		Test t2 = (Test)factory.getBean("t");
		
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
