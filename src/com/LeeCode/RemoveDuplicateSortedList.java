package com.LeeCode;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.UsualList;

public class RemoveDuplicateSortedList
{

	public static void main(String[] args)
	{
		RemoveDuplicateSortedList rds = new RemoveDuplicateSortedList();
		ListNode head = null;
		UsualList ul = new UsualList(head);
		head = ul.CreateList();
		ul.PrintList(head);

		ul.PrintList(rds.deleteDuplicates(head));
	}

	public ListNode deleteDuplicates(ListNode head)
	{
		if (head == null || head.next == null)
			return head;
		ListNode ln, r;
		ln = head;
		while (ln.next != null)
		{
			if (ln.next.val == ln.val)
			{
				r = ln.next;
				ln.next = r.next;
			}
			else
			ln = ln.next;
		}
		return head;

	}
}
