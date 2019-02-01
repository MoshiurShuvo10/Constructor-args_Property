package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Employee;

public class ClientClass {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("resources/configure.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Employee shuvo = (Employee)beanFactory.getBean("employee1");
        shuvo.print();
        System.out.println();
        Employee fahim = (Employee)beanFactory.getBean("employee2");
        fahim.print();
	}

}
