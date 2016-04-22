package com.LeeCode.aboutLinklist;

import java.util.Scanner;
import com.LeeCode.basefouction.ListNode;

public class _2AddTwoNum
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ListNode s, r,s2,r2;
		int x= 0;
		_2AddTwoNum latn = new _2AddTwoNum();
		
		
		ListNode Head1 = new ListNode(0);

		Scanner scanner = new Scanner(System.in);
		
		//链表首部，单独处理
		r = Head1;
		x = scanner.nextInt();
		r.val = x;
		
		//接收输入，以29结束
		x = scanner.nextInt();
		while (x != 29)
		{
			s = new ListNode(x);
			r.next = s;
			r = s;
			x = scanner.nextInt();
		}
		
		System.out.println();
		
		//第二个
		ListNode Head2 = new ListNode(0);

		r2 = Head2;
		x = scanner.nextInt();
		r2.val = x;

		x = scanner.nextInt();
		while (x != 29)
		{
		 
			s2 = new ListNode(x);
			r2.next = s2;
			r2 = s2;
			x = scanner.nextInt();
		}

		ListNode Ln;
		Ln = Head1;
		while(Ln!=null)
		{
			System.out.print(Ln.val+"-->");
			Ln = Ln.next;
		}
		System.out.println("LL");
		
 
		Ln = Head2;
		while(Ln!=null)
		{
			System.out.print(Ln.val+"-->");
			Ln = Ln.next;
		}
		System.out.print("end");
		System.out.println();

//		latn.addTwoNumbers(Head1, Head2);

	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode r,s,Head;
		int flag=0,i1,i2,i;
		
		Head = new ListNode((l1.val+l2.val)%10);
    	r=Head;
    	flag=(l1.val+l2.val)/10;
    	l1=l1.next;
    	l2=l2.next;
 
	 	while((l1!=null)||(l2!=null))
    	{
    		if(l1==null)
    		{
    			i1=0;
    		}
    		else
    		{
    			i1=l1.val;
    			l1=l1.next;
    		}
    	/////////////////////////////	
    		if(l2==null)
    		{
    			i2=0;
    		}
    		else
    		{
    			i2=l2.val;
    			l2=l2.next;
    		}
    		
    		i=(i1+i2+flag)%10;
    		flag=(i1+i2+flag)/10;
    		////////////////////
   		 
    		 s = new ListNode(i);
    		 r.next = s;
    		 r=s;
    	 
    		
    	}
	 	
	 	if(flag!=0)
	 	{
	 		 r.next = new ListNode(flag);
	 	}
    	
    	
    	while(Head!=null)
		{
			System.out.print(Head.val+"-->");
			Head = Head.next;
		}
		System.out.print("end");
		
		return Head;

	}
//可以处理多位数的情况
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
    	ListNode r,s,Head;
    	long i1=0;
    	long i2=0;
    	//取得链表里的数据，转为整数
    	StringBuffer sb =new StringBuffer();
    	StringBuffer sb2 =new StringBuffer();
    	while(l1!=null)
    	{
    		sb.append(l1.val);
    		l1=l1.next;
    	}
    	
    	while(l2!=null)
    	{
    		sb2.append(l2.val);
    		l2=l2.next;
    	}
    	
     i1=Long.valueOf(sb.reverse().toString());
   i2=Long.valueOf(sb2.reverse().toString());
    	
    	i1=i1+i2;
    	System.out.println("add="+i1);
    	StringBuffer res = new StringBuffer(String.valueOf(i1)).reverse();
    	System.out.println("rese="+res.toString());
    	System.out.println();
    	int i;
    	 
    	Head = new ListNode(Integer.valueOf(String.valueOf(res.charAt(0))));
    	r=Head;
    	for(i=1;i<res.length();i++)
    	{
    		 
    		s = new ListNode(Integer.valueOf(String.valueOf(res.charAt(i))));
    		 r.next = s;
    		 r=s;
    	}
    	
    	
    	while(Head!=null)
		{
			System.out.print(Head.val+"-->");
			Head = Head.next;
		}
		System.out.print("end");
		return Head;

	}


}
 


 