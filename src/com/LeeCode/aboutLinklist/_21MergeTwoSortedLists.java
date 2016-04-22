package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;

/**
 * Created by ttt on 2016/4/22.
 */
public class _21MergeTwoSortedLists {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode root1,res,root2,s;

        res = new ListNode(0);
        root2 = l2;
        root1 = l1;

        res = l1;

        while(root1!=null||root2!=null)
        {
            if(root1.val>root2.val)
            {
                s = new ListNode(root2.val);

                res.next = s;
            }
        }
        return null;

    }
}
