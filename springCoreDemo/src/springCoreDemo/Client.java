package springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("Tracy Jordan");
		eRef.setEaddress("Montreal");
		
		System.out.println(eRef);
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\rmkar\\eclipse-workspace\\springCoreDemo\\src\\employeebean.xml");
		Employee e1 = (Employee)context.getBean("emp1");
		Employee e2 = context.getBean("emp2",Employee.class);
		System.out.println(e1);
		System.out.println(e2);
	}

}
