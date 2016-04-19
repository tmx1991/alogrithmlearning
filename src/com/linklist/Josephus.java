/*
 * ‘º…™∑ÚŒ Ã‚
 */
package com.linklist;

public class Josephus
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Josephus Jo = new Josephus();
		Jo.Jsph(7,1,5);
	}
	
	public void Jsph(int n, int k, int m)
	{
		int t;
		LinkList JJ = new LinkList();
		LinkNode r = new LinkNode(null);
		LinkNode s = new LinkNode(null);
		JJ.Creat_LinkList(n);
		//JJ.printLinkList(2 * n);

		r = JJ.Head;
		while((--k) != 0)
		{
			r=r.next;
		}
		
		JJ.Head = r;
		JJ.printLinkList(2 * n);

		while((n--) != 0)
		{
			t = m - 1;
			s = r;
			while((--t) != 0)
			{
				s = s.next;
			}

			System.out.println(s.next.data);
			s.next = s.next.next;
			r = s.next;
			JJ.Head = r;
			JJ.printLinkList(2 * n);
		}
	}

}
