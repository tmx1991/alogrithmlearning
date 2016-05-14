package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;

/**
 * Created by ttt on 2016/5/7.
 */
public class _160IntersectionofTwoLinkedLists {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode ln ;
        int len1=0,len2=0;

        if(headA==null||headB == null) return null;

        ln = headA;

        while(ln!=null)
        {
            len1++;
            ln = ln.next;
        }

        ln = headB;
        while(ln!=null)
        {
            len2++;
            ln = ln.next;
        }

        if(len1<len2)
        {
            len2 = len2-len1+1;
            while((--len2)!=0)
            {
                headB = headB.next;
            }
        }
        else if(len1>len2)
        {
            len1 = len1-len2+1;
            while((--len1)!=0)
            {
                headA = headA.next;
            }
        }else
        {

        }

        while(headA!=null)
        {
            if(headA==headB)
                return headA;
            else
            {
                headA = headA.next;
                headB = headB.next;
            }

        }
        return null;
    }
}
