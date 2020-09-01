package com.beeb.myspringboot.service;

import com.beeb.myspringboot.model.User;

/**
 * <dl>
 * <dd>CreateDate: 2020/3/23</dd>
 * </dl>
 *
 * @author lzh
 */
public interface UserService {

    User getOne(int age);

    void saveUser(User user);
}