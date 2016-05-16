package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.UsualList;
import com.ThinkJ.List;

/**
 * Created by ttt on 2016/5/5.
 */
public class _143ReorderList {
    public static void main(String[] args) {

        _143ReorderList rl = new _143ReorderList();

        ListNode head = new ListNode(0);

        UsualList t = new UsualList(head);

        head = t.CreateList();

        t.PrintList(head);

        rl.reorderList(head);
    }
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;
        ListNode pHead, first, second, end;
        ListNode newHead = null;
        first = head;
        second = head;
        end = head;
        int len = 1;

        while (end.next != null) {
            end = end.next;
            len++;
        }
        len = len - len / 2 -1;


        while ((len--) != 0) {
            second = second.next;
        }

        first = second;
        second = second.next;
        first.next = null;

        while (second != null) {
            ListNode ln = second.next;
            second.next = newHead;
            newHead = second;
            second = ln;

        }
        first = head;
        second = newHead;
//        while (newHead != null)
//        {
//            System.out.print(newHead.val + "->");
//            newHead = newHead.next;
//        }

        while(second!=null)
        {
            pHead = first.next;

            newHead = second.next;

            second.next = first.next;
            first.next = second;

            first = pHead;
            second = newHead;

        }
        while(head!=null)
        {
            System.out.print(head.val + "->");
            head = head.next;
        }
    }
}
