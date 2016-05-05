package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ttt on 2016/5/5.
 */
public class _142LinkedListCycleII {
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {

        Set<ListNode> s = new HashSet<ListNode>();

        while(head!=null)
        {
            if(s.contains(head))
                return head;
            else
                s.add(head);

            head = head.next;
        }

        return head;
    }
}
