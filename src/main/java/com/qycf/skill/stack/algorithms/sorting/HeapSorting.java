package com.qycf.skill.stack.algorithms.sorting;

/**
 * 堆排序
 *
 * */
public class HeapSorting extends Template {

    private void sink(Comparable[] pq, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq, j, j+1)) j++;
            if (!less(pq, k, j)) break;
            exch(pq, k, j);
            k = j;
        }
    }

    protected boolean less(Comparable[] pq, int v, int w) {
        return super.less(pq[v], pq[w]);
    }

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int k = N/2; k >= 1; k--) sink(a, k, N);
        while (N > 1) {
            exch(a, 1, N-1);
            sink(a, 1, N);
        }
    }
}
