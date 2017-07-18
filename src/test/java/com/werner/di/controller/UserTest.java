package com.werner.di.controller;

import com.werner.di.entity.Address;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * ┌─┐       ┌─┐ + +
 * ┌──┘ ┴───────┘ ┴──┐++
 * │                 │
 * │       ───       │++ + + +
 * ███████───███████ │+
 * │                 │+
 * │       ─┴─       │
 * │                 │
 * └───┐         ┌───┘
 * │         │
 * │         │   + +
 * │         │
 * │         └──────────────┐
 * │                        │
 * │                        ├─┐
 * │                        ┌─┘
 * │                        │
 * └─┐  ┐  ┌───────┬──┐  ┌──┘  + + + +
 * │ ─┤ ─┤       │ ─┤ ─┤
 * └──┴──┘       └──┴──┘  + + + +
 * 神兽保佑
 * 代码无BUG!
 */

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("/applicationContext.xml")
public class UserTest {

//    @Resource
//    AccountController controller;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testLoad() {
//        controller.updateHotels("");
    }

    @Test
    public void testAddress() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Address address = (Address) beanFactory.getBean("address");
        System.out.println(address);
        Address address1 = (Address) beanFactory.getBean("address");
        address1.setName("123132131213");
        System.out.println(address);
        System.out.println(address1);
        Map<String, Object> map = new HashMap<>();




        Object o = map.get("");

        Object userTest = map.get("userTest");






    }


}
