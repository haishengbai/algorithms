package com.qycf.skill.stack.algorithms.soundai.pinyin4j;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.*;

public class Demo {

    static final HanyuPinyinOutputFormat hanyuPinyinOutputFormat = new HanyuPinyinOutputFormat();
    static {

        hanyuPinyinOutputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
    }



    public static void main(String[] args) throws BadHanyuPinyinOutputFormatCombination {



        String[] str = new String[]{"8", "3", "a", "cdere", "中国", "什么鬼5453", "天堂", "fdfe", "3fds"};

        Map<String, String> pinyinMap = Maps.newHashMap();
        Map<String, String> sortedMap = Maps.newHashMap();
        List<String> sortedStr = Lists.newArrayList();
        List<String> strList = Lists.newArrayList();
        Collections.addAll(strList, str);
        for (String s: strList
             ) {
            System.out.println(s);
            pinyinMap.put(PinyinHelper.toHanYuPinyinString(s, Demo.hanyuPinyinOutputFormat, "", false), s);
        }

        pinyinMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(a -> sortedStr.add(a.getValue()));
        sortedStr.forEach(System.out::println);

    }

    public String getPinyinStr(String s) throws BadHanyuPinyinOutputFormatCombination {
        return PinyinHelper.toHanYuPinyinString(s, Demo.hanyuPinyinOutputFormat, "", true);
    }


}
