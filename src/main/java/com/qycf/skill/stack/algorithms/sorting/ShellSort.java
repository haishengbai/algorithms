package com.qycf.skill.stack.algorithms.sorting;

/**
 * 希尔排序
 *
 * */
public class ShellSort extends Template {

    @Override
    public void sort(Comparable[] a) {

        // 将 a[] 按升序排列
        int N = a.length;
        int h = 1;
        while(h < N / 3)
            h = 3 * h + 1;    // 1, 4, 13, 40, 121, 364, 1093, ...
        while(h >= 1) {
            // 将数组变为 h 有序
            for(int i = h; i < N; i++) {
                // 将 a[i] 插入到 a[i-h]，a[i-2*h]，a[i-3*h]... 之中
                for(int j = i; j >= h && less(a[j], a[j -h]); j -= h)
                    exch(a, j, j-h);
            }
            h /= 3;
        }
    }
}
