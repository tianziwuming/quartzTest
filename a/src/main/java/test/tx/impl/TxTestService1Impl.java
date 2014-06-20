package test.tx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.tx.TxTestService1;
import test.tx.domain.User1;
import test.tx.mapper.User1Mapper;

@Service
public class TxTestService1Impl implements TxTestService1 {
	
	@Autowired
	User1Mapper mapper;

	public void insertUser(User1 user) {
		mapper.insert(user);

	}

}
