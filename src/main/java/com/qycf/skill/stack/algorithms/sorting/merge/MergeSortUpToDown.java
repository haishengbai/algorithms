package com.qycf.skill.stack.algorithms.sorting.merge;

/**
 * 自顶而下的归并排序（递归）
 *
 * */
public class MergeSortUpToDown extends Merge {

    private Comparable[] aux; // 归并所需的辅助数组

    @Override
    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        // 将数组 a[lo..hi] 排序
        if(hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);    // 将左半边排序
        sort(a, mid + 1, hi);    // 将右半边排序
        if(less(a[mid+1], a[mid]))    // 为 false 则认为数组已经是有序的，跳过 merge()
            merge(a, lo, mid, hi);    // 归并结果
    }

    public void merge(Comparable[] a, int lo, int mid, int hi) {
        // 将 a[lo..mid] 和 a[mid+1..hi] 归并
        int i = lo, j = mid + 1;

        for(int k = lo; k <= hi; k++)    // 将 a[lo..hi] 复制到 aux[lo..hi]
            aux[k] = a[k];

        for(int k = lo; k <= hi; k++)
            if(i > mid)    // 左半边元素用尽
                a[k] = aux[j++];
            else if(j > hi)    // 右半边元素用尽
                a[k] = aux[i++];
            else if(less(aux[i], aux[j]))
                a[k] = aux[i++];
            else
                a[k] = aux[j++];
    }
}
