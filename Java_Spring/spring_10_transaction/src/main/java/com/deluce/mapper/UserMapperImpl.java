package com.deluce.mapper;

import com.deluce.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> selectUser() {
        User user = new User(5, "小王", "2002006");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.insertUser(user);
        mapper.deleteUser(5);
        return mapper.selectUser();
    }

    @Override
    public int insertUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).insertUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
