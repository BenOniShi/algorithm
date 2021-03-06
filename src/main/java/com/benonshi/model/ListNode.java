package com.benonshi.model;

/**
 * @author BenOniShi
 * @date 2020/4/13 1:09
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int i) {
        this.val = i;
    }

    public static void printNode(ListNode node) {
        while (node != null && node.next != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
