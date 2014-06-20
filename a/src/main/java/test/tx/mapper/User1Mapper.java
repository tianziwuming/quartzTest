package test.tx.mapper;

import java.util.List;

import test.tx.domain.User1;
import test.tx.domain.User1Example;

public interface User1Mapper {
    int countByExample(User1Example example);

    int deleteByExample(User1Example example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User1 record);

    int insertSelective(User1 record);

    List<User1> selectByExample(User1Example example);

    User1 selectByPrimaryKey(Integer userId);


    int updateByPrimaryKeySelective(User1 record);

    int updateByPrimaryKey(User1 record);
}