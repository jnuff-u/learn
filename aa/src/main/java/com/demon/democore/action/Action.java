package com.demon.democore.action;


import com.demon.democore.model.Avalue;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationcontext.xml")
public class Action {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
    private Avalue avalue = (Avalue) applicationContext.getBean("avalue");

//    @Autowired
//    private Avalue avalue;

    @Test
    public void test(){

        System.out.println(avalue.getUserUrl());
    }


}
