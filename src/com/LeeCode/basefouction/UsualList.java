package com.LeeCode.basefouction;

import java.util.Scanner;

public class UsualList
{
	ListNode head ;
	public UsualList(ListNode head)
	{
		this.head = head;
	}
	
	public ListNode CreateList()
	{
		 ListNode r,s;
		 Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 head = new ListNode(x);
		 r = head;
		 while((x=sc.nextInt())!=29)
		 {
			 s = new ListNode(x);
			 r.next = s;
			 r = s;
		 }
		return head;
	}
	
	public void PrintList(ListNode l)
	{
		ListNode ln;
		ln = l;
		while(ln!=null)
		{
			System.out.print(ln.val+"->");
			ln = ln.next;
		}
		System.out.println("null");
	}
	
}
