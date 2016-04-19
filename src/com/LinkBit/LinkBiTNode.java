package com.LinkBit;

public class LinkBiTNode
{
	public char data ;
	public LinkBiTNode lchild;
	public LinkBiTNode rchild;

	LinkBiTNode(char elem, LinkBiTNode lchildval, LinkBiTNode rchildval)
	{
		data = elem;
		lchild = lchildval;
		rchild = rchildval;
	}

	LinkBiTNode(LinkBiTNode lchildval, LinkBiTNode rchildval)
	{
		lchild = lchildval;
		rchild = rchildval;
	}

}
