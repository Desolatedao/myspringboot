package com.beeb.myspringboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class User {

    private String id;
    private String name;
    private int age;
    private String certNo;
    private String sex;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

}
