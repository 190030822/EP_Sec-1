package spring123.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml"); 
		//Employee emp = (Employee) ac.getBean("emp");
		DAO d = (DAO) ac.getBean("empdao");
		//System.out.println(d.save(emp));
		List<Employee> e  = d.get();
		for (Employee p:e)
		{
			System.out.println(p);
		}
	}

}
