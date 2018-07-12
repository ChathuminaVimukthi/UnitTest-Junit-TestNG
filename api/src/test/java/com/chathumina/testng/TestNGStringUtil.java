package com.chathumina.testng;

import com.chathumina.Utils.Stringutil;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGStringUtil {

    @BeforeTest
    public void setUp(){
        System.out.println("Before...");
    }

    @AfterTest
    public void tearDown(){
        System.out.println("After...");
    }

    @Test
    public void testMyTesT() throws Exception{
        String concatanated = Stringutil.appendStr("hello","hello2","hello3","hello4");

        Assert.assertEquals("hello hello2 hello3 hello4 ",concatanated);
    }
}
