package com.beeb.myspringboot.mapper;

import com.beeb.myspringboot.model.User;
import com.beeb.myspringboot.model.UserCriteria;

/**
 * <dl>
 * <dd>CreateDate: 2020/3/23</dd>
 * </dl>
 *
 * @author lzh
 */
public interface UserMapper {

    User findOne(UserCriteria criteria);

    int save(User user);
}
