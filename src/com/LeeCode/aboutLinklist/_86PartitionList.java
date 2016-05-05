package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.TreeNode;
import com.LeeCode.basefouction.UsualList;
import com.ThinkJ.List;
import com.sun.org.apache.bcel.internal.generic.InstructionListObserver;

/**
 * Created by ttt on 2016/5/4.
 */
public class _86PartitionList {

    public static void main(String[] args) {

        _86PartitionList pl = new _86PartitionList();

        ListNode head = new ListNode(0);

        UsualList t = new UsualList(head);

        head = t.CreateList();

        t.PrintList(head);


        t.PrintList( pl.partition(head,3));
    }
    public ListNode partition(ListNode head, int x) {

        if(head == null) return null;

        ListNode newNode = new ListNode(x-1);
        ListNode pHead = newNode;
        newNode.next = head;

        while( newNode.next!=null&& newNode.next.val<x)
            newNode =  newNode.next;

        ListNode pNode =newNode.next;
        ListNode pPre = newNode.next;

        while(pNode!=null)
        {
            if(pNode.val>=x)
            {

            }
            else
            {
                pPre.next = pNode.next;

                pNode.next = newNode.next;

                newNode.next = pNode;

                newNode = newNode.next;

                pNode = pPre;
            }
            pPre = pNode;
            pNode = pNode.next;
        }


        return pHead.next;
    }
}
