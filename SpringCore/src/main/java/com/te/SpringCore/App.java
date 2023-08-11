package com.te.SpringCore;

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
      ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
      /*Bike b=(Bike)ac.getBean("bike");
      b.drive();*/
        Tyre t=(Tyre)ac.getBean("tyre");
     
      System.out.println( t.getWheels());
    }
}
