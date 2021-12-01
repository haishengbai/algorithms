package com.qycf.skill.stack.algorithms;

public class SortTest {


    //已知一个整数序列满足如下规律：序列中的元素首先由小到大排列，达到最大值后再由大到小排列。请写一段代码获取序列中的最大元素，要求时间复杂度低于O(n).

    public int findMax(int[] sequence) {

        int length = sequence.length;
        int maxIndex = 0;
        int start = 0;
        int end = length - 1;
        int mid;
        while (start < end) {
            mid = (start + end) /2;
            if (sequence[mid] > sequence[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        maxIndex = start;
        return sequence[maxIndex];
    }

    // 4g


}
