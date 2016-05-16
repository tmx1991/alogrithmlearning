package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.UsualList;

/**
 * Created by ttt on 2016/5/6.
 */
public class _147InsertionSortList {
    public static void main(String[] args) {
        _147InsertionSortList is = new _147InsertionSortList();

        ListNode head = new ListNode(0);

        UsualList t = new UsualList(head);

        head = t.CreateList();

        t.PrintList(head);

        is.insertionSortList(head);
    }
    public ListNode insertionSortList(ListNode head) {

        if(head == null ||head.next == null) return head;

        ListNode pre = new ListNode(0);

        ListNode pre0 = pre;

           pre.next= head;

        ListNode insert = head;

        while(insert.next!=null)
        {
            while(pre.next!=insert.next)
            {
                if(insert.next.val>=pre.next.val)
                {
                    pre = pre.next;
                }
                else
                {
                    ListNode ln = insert.next.next;

                    insert.next.next = pre.next;

                    pre.next = insert.next;

                    insert.next = ln;


                    pre = pre0;

                    break;
                }
            }

            if(pre.next == insert.next)
            {
                insert = insert.next;
                pre = pre0;
            }


        }

//        while(pre0!=null)
//        {
//            System.out.print(pre0.val+"->");
//            pre0 = pre0.next;
//        }


        return pre0.next;
    }
}
