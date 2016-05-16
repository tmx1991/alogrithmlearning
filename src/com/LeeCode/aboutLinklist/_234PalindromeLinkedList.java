package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;

/**
 * Created by ttt on 2016/5/7.
 */
public class _234PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode ln;
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
//        head.next.next = new ListNode(4);
//        ln = head.next.next;
//        ln.next =  new ListNode(2);
//        ln.next.next =  new ListNode(1);
//        ln.next.next.next =  new ListNode(1);

        _234PalindromeLinkedList pll = new _234PalindromeLinkedList();
        System.out.println(pll.isPalindrome(head));

    }
    public boolean isPalindrome(ListNode head) {

        int len = 0,lf;
        ListNode ln,second,next=head;
        ListNode newHead =null;
        if(head==null || head.next == null) return true;


        ln= head;
        while(ln!=null)
        {
            len++;
            ln = ln.next;
        }

        lf = len/2+1;
        System.out.println(lf);



        while((--lf)!=0)
        {
            next = head.next;

            head.next  = newHead;
            newHead = head;

            head = next;
        }

        System.out.println(newHead.val);

        if(len%2==1) second = next.next;
        else
        second = next;


        while(second!=null)
        {
            if(newHead.val!=second.val)
            {
                return false;
            }
            newHead = newHead.next;
            second = second.next;
        }
        return true;

//        while(newHead!=null)
//        {
//            System.out.print(newHead.val+"->");
//            newHead = newHead.next;
//        }
//        System.out.println();
//        while(second!=null)
//        {
//            System.out.print(second.val+"->");
//            second = second.next;
//        }

    }
}
