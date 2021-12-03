package com.qycf.skill.stack.algorithms.leetcode;

import java.util.Objects;

public class Num2 {


    /**
     * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
     * <p>
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     * <p>
     * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-two-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }


        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result= null;
        ListNode resultNow = null;
        int upTen = 0;

        int left = 0;
        int right = 0;
        while(l1 != null || l2 != null) {
           ListNode listNode = new ListNode();
           left = l1 == null? 0 : l1.val;
           right = l2 == null? 0 : l2.val;
           int res = left + right + upTen;
           if (res >= 10) {
               listNode.val = res - 10;
               upTen = 1;
           } else {
               listNode.val = res;
               upTen = 0;
           }
           if (resultNow == null) {
               resultNow = listNode;
               result = listNode;
           } else {
               resultNow.next = listNode;
               resultNow = listNode;
           }
           if (l1 != null) {
               l1 = l1.next;
           }
           if (l2 != null) {
               l2 = l2.next;
           }
        }
        if (upTen != 0) {
            ListNode last = new ListNode();
            last.val = upTen;
            resultNow.next = last;
        }

        return result;
    }


}
