package com.chathumina.Utils;

public class Stringutil {

    public static String appendStr(String ... strs){
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<strs.length; i++){
            builder.append(strs[i]+" ");
        }

        System.out.println(builder.toString());
        return builder.toString();
    }

}
