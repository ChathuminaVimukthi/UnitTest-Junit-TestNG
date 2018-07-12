package com.chathumina.testng;

import com.chathumina.Utils.IntegerUtils;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGIntegerUtil {

    @BeforeTest
    public void setUp(){
        System.out.println("Before...");
    }

    @AfterTest
    public void tearDown(){
        System.out.println("After...");
    }

    @Test
    public void testTestInt() throws Exception {
        int printInt = IntegerUtils.testInt(1,2,3,4,5,6);

        Assert.assertEquals(21,printInt);
    }
}
