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


        pl.partition(head,3);
    }
    public ListNode partition(ListNode head, int x) {

        ListNode newNode = null;

        ListNode pNode = head;

        ListNode pNext = null;

        while(head!=null)
        {

        }


        return head;
    }
}
