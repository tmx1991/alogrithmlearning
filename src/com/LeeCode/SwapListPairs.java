package com.LeeCode;

import com.LeeCode.basefouction.ListNode;
import com.LeeCode.basefouction.UsualList;

public class SwapListPairs
{

	public static void main(String[] args)
	{
		SwapListPairs sp = new SwapListPairs();
		ListNode head = null;
		UsualList ul = new UsualList(head);
		head = ul.CreateList();
		ul.PrintList(head);
	 	ul.PrintList(sp.swapPairs(head));
	}

	public ListNode swapPairs(ListNode head)
	{
		int i = 0;
		ListNode h, r = null, s,c;
		if(head==null) return null;
		h = head.next;
		if(h==null) return head;
		s = new ListNode(head.val);
		s.next = head.next.next;
		h.next = s;

		while ((s.next) != null)
		{
			if (s.next.next != null)
			//r = new ListNode(s.val);
				{ c = new ListNode(s.next.val);
				r= s.next;
				s.next = r.next;
				c.next = s.next.next;
				s.next.next = c;
				
                s = c;				
			}
			else
				break;

		}
		return h;

	}

	public ListNode swapPairs0(ListNode head)
	{
		ListNode preHead = new ListNode(-1);
		ListNode ptr = preHead;
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		preHead.next = head;
		head = head.next;
		while (ptr.next != null && ptr.next.next != null)
		{
			ListNode next = ptr.next;
			ptr.next = ptr.next.next;
			next.next = ptr.next.next;
			ptr.next.next = next;
			ptr = next;
		}
		return head;
	}

}
