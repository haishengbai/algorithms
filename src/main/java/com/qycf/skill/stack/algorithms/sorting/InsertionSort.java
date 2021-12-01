package com.qycf.skill.stack.algorithms.sorting;


/**
 * 插入排序
 *
 * */
public class InsertionSort extends Template {

    @Override
    public void sort(Comparable[] a) {
        // 将 a[] 按升序排列
        int N = a.length;
        for(int i = 1; i < N; i++) {
            // 将 a[i] 插入到 a[i-1]、a[i-2]、a[i-3]...之中
            for(int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
        }
    }

    public static void main(String[] args) {


        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
}
