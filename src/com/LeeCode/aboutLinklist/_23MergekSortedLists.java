package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by ttt on 2016/4/25.
 * 利用2个链表的组合递归，或者用prioqueue，内部采用堆排序
 */
public class _23MergekSortedLists {

    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(10,new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1, ListNode o2) {

                return 0;
            }
        });

        return null;
    }
}
