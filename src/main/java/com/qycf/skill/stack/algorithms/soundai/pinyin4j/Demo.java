package com.qycf.skill.stack.algorithms.soundai.pinyin4j;

import com.google.common.collect.Lists;
import net.sourceforge.pinyin4j.PinyinHelper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {



    public static void main(String[] args) {
        String[] str = new String[]{"8", "3", "a", "cdere", "中国", "什么鬼", "天堂", "fdfe", "3fds"};


        List<String> strList = Lists.newArrayList();
        Collections.addAll(strList, str);
        for (String s: strList
             ) {
            System.out.println(s);
        }





    }


}
