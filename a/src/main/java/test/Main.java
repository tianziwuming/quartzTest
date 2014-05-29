package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		
		System.out.println("用时："+(System.currentTimeMillis()-startTime)+"毫秒");
	}

}
