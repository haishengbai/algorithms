package com.qycf.skill.stack.algorithms.sorting;

public class QuickSorting extends Template {

    @Override
    public void sort(Comparable[] a) {
//        StdRandom.shuffle(a);   // 消除对输入的依赖
        sort(a, 0, a.length - 1);
        assert isSorted(a);
    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1; // 左右扫描指针
        // 切分元素
        Comparable v = a[lo];
        while (true) {

            // find item on lo to swap
            while (less(a[++i], v)) {
                if (i == hi) break;
            }

            // find item on hi to swap
            while (less(v, a[--j])) {
                if (j == lo) break;      // redundant since a[lo] acts as sentinel
            }

            // check if pointers cross
            if (i >= j) break;

            exch(a, i, j);
        }

        // put partitioning item v at a[j]
        exch(a, lo, j);

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi); // 切分
        sort(a, lo, j-1);			  // 左半部分排序
        sort(a, j+1, hi);			  // 右半部分排序
    }


}
