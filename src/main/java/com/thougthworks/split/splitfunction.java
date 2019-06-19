package com.thougthworks.split;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class splitfunction
{
    public splitfunction()
    {
    }
    void function(String str)
    {
        // 实例化对象，并指向以 . 对 str 进行分割
        StringTokenizer str2=new StringTokenizer(str, ".");
        // 对 str2 遍历并打印子字符串；
        while(str2.hasMoreTokens())

        {
            System.out.println(str2.nextToken());
        }
    }

}

