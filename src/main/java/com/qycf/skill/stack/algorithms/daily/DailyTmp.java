package com.qycf.skill.stack.algorithms.daily;

/**
 * @author harrison
 * @date 2021/12/1
 * @email haishengbai@gmail.com
 */
public class DailyTmp {

    /**
     * 1446. 连续字符
     *
     * 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
     * 请你返回字符串的能量
     *
     * */

    public int maxPower(String s) {
        int power = 0;
        char[] stringChars = s.toCharArray();
        int pointer = 0;
        for (int i = 0; i < stringChars.length -1; i++) {
            if (stringChars[i] != stringChars[i+1]) {
                int newPower = i - pointer + 1;
                power = newPower > power ? newPower : power;
                pointer = i + 1;
            }
        }
        if(pointer == 0) {
            power = stringChars.length;
        } else if(stringChars.length - pointer > power) {
            power = stringChars.length - pointer;
        }
        return power;
    }

}
