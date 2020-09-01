package com.beeb.myspringboot.model;

import lombok.Data;

import java.util.Date;

/**
 * <dl>
 * <dd>CreateDate: 2020/3/23</dd>
 * </dl>
 *
 * @author lzh
 */
@Data
public class UserCriteria {

    private String id;
    private String name;
    private int age;
    private String certNo;
    private String sex;
    private Date createTime;
    private Date updateTime;

}
