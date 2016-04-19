package com.linklist;

public class DlinkNode
{
	private int data;
	private DlinkNode next;
	private DlinkNode prior;
	DlinkNode(int elem,DlinkNode nextval,DlinkNode priorval)
	{
		data = elem;
		next = nextval;
		prior = priorval;
	}
	
	DlinkNode(DlinkNode nextval,DlinkNode priorval)
	{
	 
		next = nextval;
		prior = priorval;
	}

}
