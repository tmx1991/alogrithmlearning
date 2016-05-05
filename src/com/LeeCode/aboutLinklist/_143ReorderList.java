package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.UsualList;

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
    }
    public void reorderList(ListNode head) {
        ListNode pHead,first,end;
        first = head;
        end = head;
        while(end.next!=null)
        {
            end = end.next;
        }
        while(first!=end && first.next!=end)
        {
            first=end;
        }


    }
}
