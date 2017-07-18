package com.werner.di.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class AccountControllerTest {
    @Resource(name = "controller")
    AccountController controller;
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void updateHotels() throws Exception {
        InputStream is = AccountControllerTest.class.getClassLoader().getResourceAsStream("test.json");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while (-1 != (len = is.read(buffer))) {
            baos.write(buffer, 0, len);
            baos.flush();
        }
        String json = baos.toString("utf-8");
        controller.updateHotels(json);

    }
}