package com.qycf.skill.stack.algorithms.sorting;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Template {

    public void sort(Comparable[] a) {
        // 各类排序算法
    }

    protected boolean less(Comparable v, Comparable w) {
        // 对元素进行比较
        return v.compareTo(w) < 0;
    }

    void exch(Comparable[] a, int i, int j) {
        // 将元素交换位置
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    void show(Comparable[] a) {
        // 在单行中打印数组
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i] + " ");
    }

    public boolean isSorted(Comparable[] a) {
        // 测试数组元素是否有序
        for(int i = 1; i < a.length; i++)
            if(less(a[i], a[i - 1]))
                return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        Template template = new Template();
        // 从标准输入读取字符串，将它们排序并输出
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = Lists.newArrayList();
        while (scanner.hasNextLine()) {
            String next = scanner.next();
            if (next.equalsIgnoreCase("end")) break;
            stringList.add(next);
            System.out.println(next);
        }
        scanner.close();
        String[] a = stringList.toArray(new String[0]);
        template.sort(a);
        assert template.isSorted(a);
        template.show(a);
    }




}
