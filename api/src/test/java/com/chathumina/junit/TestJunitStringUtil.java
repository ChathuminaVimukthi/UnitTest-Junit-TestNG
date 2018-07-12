package com.chathumina.junit;

import com.chathumina.Utils.Stringutil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

public class TestJunitStringUtil {

    @Before
    public void setUp(){
        System.out.println("Before...");
    }

    @After
    public void tearDown(){
        System.out.println("After...");
    }

    @Test
    public void testMyTesT() throws Exception{
        String concatanated = Stringutil.appendStr("hello","hello2","hello3","hello4");

        Assert.assertEquals("hello hello2 hello3 hello4 ",concatanated);
    }
}
