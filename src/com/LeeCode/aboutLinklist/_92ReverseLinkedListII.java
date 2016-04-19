package com.LeeCode.aboutLinklist;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.UsualList;

public class _92ReverseLinkedListII
{

	public static void main(String[] args)
	{
		_92ReverseLinkedListII rllii = new _92ReverseLinkedListII();
		ListNode head = null;
		UsualList ul = new UsualList(head);
		head = ul.CreateList();
		ul.PrintList(head);

		head = rllii.reverseBetween(head, 3, 5);
		ul.PrintList(head);
	}
//此题中设计链表的基本交换，需要认真理解
	public ListNode reverseBetween(ListNode head, int m, int n)
	{
		if (head == null)
			return null;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		for (int i = 0; i < m - 1; i++)
			pre = pre.next;
		ListNode start = pre.next;
		ListNode then = start.next;
 
		for (int i = 0; i < n - m; i++)
		{
			start.next = then.next;
			then.next = pre.next;
			pre.next = then;
			then = start.next;
//			System.out.println(start.val+","+then.val);
 
		}

		// first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then
		// = 4
		// second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then
		// = 5 (finish)

		return dummy.next;
	}
}
