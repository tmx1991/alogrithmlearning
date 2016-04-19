package com.LeeCode;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.UsualList;

public class RotateList
{

	public static void main(String[] args)
	{
		RotateList rl = new RotateList();
		ListNode head = null;
		UsualList ul = new UsualList(head);
		head = ul.CreateList();
		ul.PrintList(head);

		head = rl.rotateRight(head, 2);
		ul.PrintList(head);

	}

	public ListNode rotateRight(ListNode head, int k)
	{
		int len = 0;
		if (head == null || head.next == null)
			return head;
		ListNode ln, r, s, h;
		ln = head;
		while (ln != null)
		{
			len++;
			ln = ln.next;
		}
		k %= len;
		if (k==0)
			return head;
		h = head;
		len = len - k - 1;
		while (len-- != 0)
			h = h.next;
		s = h.next;
		r = s;
		h.next = null;
		while (r.next != null)
		{
			r = r.next;
		}
		r.next = head;

		return s;
	}
}
