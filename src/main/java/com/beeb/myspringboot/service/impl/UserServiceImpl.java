package com.beeb.myspringboot.service.impl;

import com.beeb.myspringboot.mapper.UserMapper;
import com.beeb.myspringboot.model.User;
import com.beeb.myspringboot.model.UserCriteria;
import com.beeb.myspringboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <dl>
 * <dd>CreateDate: 2020/3/23</dd>
 * </dl>
 *
 * @author lzh
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getOne(int age) {
        UserCriteria criteria=new UserCriteria();
        criteria.setAge(age);
        User user=userMapper.findOne(criteria);
        return user;
    }

    @Override
    public void saveUser(User user){
        userMapper.save(user);
    }
}
