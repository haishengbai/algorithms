package com.qycf.skill.stack.algorithms.sorting.merge;

import com.qycf.skill.stack.algorithms.sorting.Template;

public class Merge extends Template {

    private void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        // 先决条件: a[lo .. mid] 和 a[mid+1 .. hi] 是有序子数组
//        assert isSorted(a, lo, mid);
//        assert isSorted(a, mid+1, hi);

        // 拷贝到辅助数组 aux[] 中
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        // 归并到原数组 a[] 中
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              a[k] = aux[j++];
            else if (j > hi)               a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else                           a[k] = aux[i++];
        }

//        assert isSorted(a, lo, hi);
    }

}
