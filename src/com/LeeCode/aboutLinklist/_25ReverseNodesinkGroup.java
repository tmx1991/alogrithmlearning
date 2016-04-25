package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.UsualList;
import com.ThinkJ.List;

/**
 * Created by ttt on 2016/4/25.
 */
public class _25ReverseNodesinkGroup {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        UsualList t = new UsualList(head);

        head = t.CreateList();

        t.PrintList(head);

        ListNode l = reverseList2(head,null);

        t.PrintList(l);

    }
    public static  ListNode reverseList2(ListNode head, ListNode newHead) {

            if (head == null)
                return newHead;
            ListNode next = head.next;
            head.next = newHead;
//        newHead = head;
            return reverseList2(next, head);
    }
    public static  ListNode reverseList(ListNode head) {

        ListNode newNode = null;
        while(head!=null)
        {
            ListNode next = head.next;

            head.next = newNode;

            newNode = head;

            head = next;

        }

        return newNode;


    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode h,current,end;
        current = new ListNode(0);

        h = current;
        end = head;
        int i =0;

        while(head!=null)
        {
            i++;
            if(i==k)
            {

                current = head;
                i=0;
            }

            head =head.next;

            end.next = end;

            end = head;
        }



        return null;

    }
}
