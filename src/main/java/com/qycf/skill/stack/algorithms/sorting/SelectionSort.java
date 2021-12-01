package com.qycf.skill.stack.algorithms.sorting;

/**
 * 选择排序
 *
 * */
public class SelectionSort extends Template {

    @Override
    public void sort(Comparable[] a) {

        // 将 a[] 按升序排列
        int N = a.length;
        for(int i = 0 ; i < N; i++) {
            // 将 a[i] 和 a[i...N]中最小的元素交换
            int min = i;    // 最小元素的索引
            for(int j = i+1; j < N; j++)
                if(super.less(a[j], a[min]))
                    min = j;
            super.exch(a, i, min);
        }
        super.sort(a);
    }
}
