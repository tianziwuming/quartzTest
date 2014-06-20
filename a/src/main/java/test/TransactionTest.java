package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.tx.TxTestService;

public class TransactionTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext_txTest.xml");
		
		TxTestService service = (TxTestService)context.getBean("txTestService");
		
		service.test();
		
	}

}
