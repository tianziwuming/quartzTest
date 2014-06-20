package test.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import test.tx.domain.User1;

@Service
public class TxTestService {

	@Autowired
	TxTestService1 service1;
	
	@Autowired
	TxTestService2 service2;  
	
	@Transactional("a")
	public void test(){
		User1 user =new User1();
		user.setUserId(7);
		user.setUserName("abd");
		user.setUserDesc("dfwefwwaef");
		
		service1.insertUser(user);
		
		user.setUserName("uadated User");
		
		service2.updateUser(user);
	}
}
