/*
 * 关于链表的各种问题
 */

package com.linklist;

import java.util.Scanner;

public class LinkList implements IList
{
	public LinkNode Head;
	
	 
	LinkList()
	{
		Init_LinkList();
	}
	private void Init_LinkList()
	{
		// TODO Auto-generated method stub
		Head = new LinkNode(null);
		
		Head.next = Head;//循环
	}
	/*
	 * 循环链表
	 */
	public void Creat_LinkList(int n)
	{
		 

		LinkNode s, r;
		r = Head;
		int x=1;
	 
	 
		Head.data = x;
		while((++x) <= n)
		{
		 
			s = new LinkNode(null);
			s.data = x;
			r.next = s;
			s.next=Head;
			r = s;
		}

	}
	
	
	@Override
	public void Init_SeqList(int size)
	{
		// TODO Auto-generated method stub
		
	}
	
 /*
  * 向前链表
  */
	public void Creat_LinkList2()
	{

		LinkNode s, r;
		r = Head;
		int x;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		Head.data = x;
		while(x != 29)
		{
			x = scanner.nextInt();
			s = new LinkNode(null);
			s.data = x;
			s.next = r;
			r = s;
		}
		Head = r;//头部要注意

	}
	
	/*
	 * 向后链表.next是需要赋值的
	 */
	public void Creat_LinkList1()
	{

		LinkNode s, r;
		r = Head;
		int x;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		Head.data = x;
		while(x != 29)
		{
			x = scanner.nextInt();
			s = new LinkNode(null);
			s.data = x;
			r.next = s;
			r = s;
		}

	}
	/*
	 * 查询
	 */
	public LinkNode Get_LinkList(int i)
	{
		LinkNode p = Head;
		int j = 0;
		while(p.next!= null&&j<i)
		{
			p=p.next;
			j++;
		}
		
		if(j == i)
			return p;
		else
			return null;
	 

	}
	/*
	 * 插入，向后
	 */
	public int Insert_LinkList1(int i, int x)
	{
		LinkNode p, s;
		p = Get_LinkList(i - 1);
		if(p == null)
		{
			System.out.println("参数i错误");
			return 0;

		} 
		else
		{
			s = new LinkNode(null);
			s.data = x;
			s.next = p.next;
			p.next = s;
			return 1;
		}

	}
	/*
	 * 插入，向前
	 */
 
	public int Insert_LinkList2(int i, int x)
	{
		LinkNode p,q, s;
		p = Get_LinkList(i - 1);
		q = Head;
		while(q.next!=p)
			q=q.next;
		if(p == null)
		{
			System.out.println("参数i错误");
			return 0;

		} 
		else
		{
			s = new LinkNode(null);
			s.data = x;
			s.next = q.next;
			q.next = s;
			return 1;
		}

	

	}
	/*
	 * 逆置
	 */
	public void reverse()
	{
		LinkNode p,q;
		p = Head;
		 Head = null;
		 while(p != null)
		 {
			 q= p;
			 p=p.next;
			 q.next = Head;
			 Head  = q;
		 }
		
		
	}
	
	
	public void printLinkList()
	{
		LinkNode Ln;
		Ln = Head;
		while(Ln!=null)
		{
			System.out.print(Ln.data+"-->");
			Ln = Ln.next;
		}
		System.out.print("null");
	}
	
	public void printLinkList(int n)
	{
		LinkNode Ln;
		Ln = Head;
		while((n--)>0)
		{
			System.out.print(Ln.data+"-->");
			Ln = Ln.next;
		}
//		System.out.print("null");
	}

//	public static void main(String[] args)
//	{
//    	LinkList L2 = new LinkList();
// 		L2.Creat_LinkList(7);
// 		L2.printLinkList(14);
//		System.out.println();
//		L2.Insert_LinkList1(3,89);
//		L2.printLinkList();
//		System.out.println();
//		L2.Insert_LinkList2(3,22);
//		L2.printLinkList();
//		L2.reverse();
//		System.out.println();
//		L2.printLinkList();
//	}
}
