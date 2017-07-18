package com.werner.di.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

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
 * 500行
 * 代码无BUG!
 */
public class SpringDITest {

    BeanFactory factory;
    AccountController controller;


    @Before
    public void setUp() throws Exception {
        factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        controller = factory.getBean(AccountController.class, "ac");
    }

    @Test
    public void testApp() throws Exception {
        InputStream is = AccountControllerTest.class.getClassLoader().getResourceAsStream("test.json");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuffer sb = new StringBuffer();
        String json;
        while ((json = br.readLine()) != null) {
            sb.append(json);
        }
        controller.updateHotels(sb.toString());
    }
}


