package com.capgemini.in.SpringInjectionUsingAutowire;

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
    	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	Human hm = ac.getBean("hh", Human.class);
    	hm.alive();
    	Animal ani = ac.getBean("ah", Animal.class);
    	ani.AnimalAlive();    	
    }
}
