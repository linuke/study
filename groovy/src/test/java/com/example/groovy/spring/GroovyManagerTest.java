package com.example.groovy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linuke on 2014/10/28.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:simple.xml")
public class GroovyManagerTest {
//    @Autowired
//    Manager manager ;
    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:simple.xml");
        Manager manager = ctx.getBean("manager",Manager.class);
        manager.run();
    }
}
