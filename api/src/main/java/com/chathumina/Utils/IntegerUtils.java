package com.chathumina.Utils;

public class IntegerUtils {

    public static int testInt(int ... integers){
        int total = 0;

        for(int i:integers){
            total += i;
        }

        System.out.println(total+" ");
        return total;

    }
}
