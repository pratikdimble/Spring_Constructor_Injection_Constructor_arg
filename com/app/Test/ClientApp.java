package com.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;

public class ClientApp {

	public static void main(String[] args) {
  //configure the spring
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/cfg/config.xml");
    //get the bean
		Employee e=(Employee)ctx.getBean("emp");
    //print the object
			System.out.println(e);
	}

}
