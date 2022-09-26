package com.spring.trainings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	 ApplicationContext factory =  new ClassPathXmlApplicationContext("./Application.xml");
    	 
//    	 Employee emp1 =(Employee) factory.getBean("emp1" , Employee.class);
//    	 System.out.println(emp1.getId() + " " + emp1.getName() + " " + emp1.getSalary() + " " + emp1.getAddress());
//  
//    	 Employee emp2 =(Employee) factory.getBean("emp2" , Employee.class);
//    	 System.out.println(emp2.getId() + " " + emp2.getName() + " " + emp2.getSalary() + " " + emp2.getAddress());

    	 
    	 Student s1 = factory.getBean("s1" , Student.class);
    	 System.out.println( "name"   + s1.getSname());
    	 System.out.println( "rollno"   + s1.getRollno());
    	 System.out.println( "collage"   + s1.getCollage());
    }
}
