package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.UsualList;

/**
 * Created by ttt on 2016/4/22.
 */
public class _19RemoveNthFromEnd {

    public static void main(String[] args) {

        _19RemoveNthFromEnd rnf = new _19RemoveNthFromEnd();


        ListNode head = new ListNode(0);
        UsualList t = new UsualList(head);
        head = t.CreateList();
        t.PrintList(head);

        head = rnf.removeNthFromEnd(head,2);
        t.PrintList(head);







    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t,s;
        int count = 0;
        t = head;
        if(n==0) return head;
        while (t != null)
        {
            count++;
            t = t.next;
        }
        if (n > count)
            return head;
        if (n == count)
        {
            head = head.next;

            return head;
        }



        t=head;
        count = count - n -1;
        while (count != 0)
        { t=t.next;
            count--;
        }

        t.next= t.next.next;



        return head;

    }
}
