package com.linklist;

public class LinkNode
{
	
	int data;
	 LinkNode next;
	LinkNode(int elem,LinkNode nextval)
	{
		data = elem;
		next = nextval;
	}
	LinkNode(LinkNode nextval)
	{
		next = nextval;
	}
	
	
	 public int getData()
		{
			return data;
		}
		public void setData(int data)
		{
			this.data = data;
		}
		public LinkNode getNext()
		{
			return next;
		}
		public void setNext(LinkNode next)
		{
			this.next = next;
		}

}
