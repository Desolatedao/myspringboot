package com.beeb.cucumber;

import com.beeb.myspringboot.MyspringbootApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <dl>
 * <dd>CreateDate: 2020/3/25</dd>
 * </dl>
 *
 * @author lzh
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyspringbootApplication.class)
@SpringBootTest
public class AbstractDefs {
}
