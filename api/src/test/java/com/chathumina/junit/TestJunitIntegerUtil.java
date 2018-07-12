package com.chathumina.junit;

import com.chathumina.Utils.IntegerUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

public class TestJunitIntegerUtil {

    @Before
    public void setUp(){
        System.out.println("Before...");
    }

    @After
    public void tearDown(){
        System.out.println("After...");
    }

    @Test
    public void testTestInt() throws Exception {
        int printInt = IntegerUtils.testInt(1,2,3,4,5,6);

        Assert.assertEquals(21,printInt);
    }
}
