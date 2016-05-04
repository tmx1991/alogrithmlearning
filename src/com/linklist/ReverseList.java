package com.linklist;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.UsualList;

/**
 * Created by ttt on 2016/5/4.
 */
public class ReverseList {
    public static void main(String[] args) {
        ReverseList rl = new ReverseList();

        ListNode head = null;
        UsualList ul = new UsualList(head);
        head = ul.CreateList();
        ul.PrintList(head);

//        head = rl.reverseList(head);
//        ul.PrintList(head);
    }

    public void reverseList(ListNode root)
    {


    }
}
