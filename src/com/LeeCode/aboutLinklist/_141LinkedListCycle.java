package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ttt on 2016/5/5.
 */
public class _141LinkedListCycle {
    public static void main(String[] args) {
        _141LinkedListCycle llc  = new _141LinkedListCycle();
    }
    public boolean hasCycle(ListNode head) {

        Set<ListNode> s = new HashSet<ListNode>();

        while(head!=null)
        {
            if(s.contains(head))
                return true;
            else
                s.add(head);

            head = head.next;
        }

        return false;

    }
}
