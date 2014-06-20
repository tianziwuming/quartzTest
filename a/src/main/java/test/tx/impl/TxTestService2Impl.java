package test.tx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.tx.TxTestService2;
import test.tx.domain.User1;
import test.tx.mapper.User1Mapper;

@Service
public class TxTestService2Impl implements TxTestService2 {

	@Autowired
	User1Mapper mapper;

	
	public void updateUser(User1 user) {
		mapper.updateByPrimaryKey(user);
	}

}
