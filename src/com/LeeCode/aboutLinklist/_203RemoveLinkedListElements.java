package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;

/**
 * Created by ttt on 2016/5/7.
 */
public class _203RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode ln;
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(4);
        ln = head.next.next;
        ln.next =  new ListNode(2);
        ln.next.next =  new ListNode(1);
        ln.next.next.next =  new ListNode(1);

        _203RemoveLinkedListElements rlle = new _203RemoveLinkedListElements();
        rlle.removeElements(head,2);
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;

        ListNode ln = new ListNode(0);
             ln.next =  head;
        ListNode ln0 = ln;
        while(ln.next!=null)
        {
            if(ln.next.val==val)
            {
                ln.next = ln.next.next;
            }
            else
            {
                ln = ln.next;
            }

        }

//        while(ln0!=null)
//        {
//            System.out.print(ln0.val+"->");
//            ln0 = ln0.next;
//        }

        return ln0.next;

    }
}
