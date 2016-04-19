package com.LinkBit;

public class LinkBiTree
{
	public LinkBiTNode bt;
	public LinkBiTree()
	{
		// TODO Auto-generated constructor stub
		bt = null;
	}

	public void PreOrder(LinkBiTNode bt)
	{
		if(bt == null)
		{
			return;
		}
		System.out.println(bt.data);
		PreOrder(bt.lchild);
		PreOrder(bt.rchild);
		
	}
	public void InOrder(LinkBiTNode bt)
	{
		if(bt == null)
		{
			return;
		}
		
		InOrder(bt.lchild);
		System.out.println(bt.data);
		InOrder(bt.rchild);
		
	}
	
	public void PostOrder(LinkBiTNode bt)
	{
		if(bt == null)
		{
			return;
		}
		
		PostOrder(bt.lchild);
		
		PostOrder(bt.rchild);
		System.out.println(bt.data);
	}
	
	public LinkBiTree Initiate()
	{
		LinkBiTNode bt = new LinkBiTNode(null,null);
		LinkBiTree T = new LinkBiTree();
		T.bt = bt;
		return T;
	}
	
	// public LinkBiTree Initiate()
	// {
	//
	// LinkBiTree T = new LinkBiTree();
	//
	// return T;
	// }
	
	public LinkBiTree Creat(char x,LinkBiTree lbt,LinkBiTree rbt)
	{
		LinkBiTree T = new LinkBiTree();
		LinkBiTNode bt = new LinkBiTNode(x,null,null);
		T.bt= bt;
		T.bt.lchild = lbt.bt;
		T.bt.rchild = rbt.bt;
		 
		return T;
		
	}
	
	public LinkBiTree InsertL(LinkBiTree T, char x, LinkBiTNode parent)
	{
		if(parent == null)
		{
			System.out.println("插入错误");
			return null;
		}
		LinkBiTNode p = new LinkBiTNode(x, null, null);
		if(parent.lchild == null)
			parent.lchild = p;
		else
		{
			p.lchild = parent.lchild;
			parent.lchild = p;
		}

		return T;
	}

	public LinkBiTree DeleteL(LinkBiTree T, LinkBiTNode parent)
	{
		if(parent == null || parent.lchild == null)
		{
			System.out.println("删除出错");
			return null;
		}
		parent.lchild = null;
		return T;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkBiTree L1 = new LinkBiTree();
		L1=L1.Creat('G',  new LinkBiTree(),  new LinkBiTree());
		

		LinkBiTree L2 = new LinkBiTree();
		L2=L2.Creat('E',  new LinkBiTree(),  new LinkBiTree());
		
		LinkBiTree L3 = new LinkBiTree();
		L3=L3.Creat('F',  new LinkBiTree(),  new LinkBiTree());
		
		LinkBiTree L4 = new LinkBiTree();
		L4=L4.Creat('C', L2, L3);

		LinkBiTree L5 = new LinkBiTree();
		L5=L5.Creat('D',  new LinkBiTree(), L1);
		
		LinkBiTree L6 = new LinkBiTree();
		L6=L6.Creat('B', L5,  new LinkBiTree());
		
		LinkBiTree L7 = new LinkBiTree();
		L7=L7.Creat('A', L6, L4);
 
		//L7.PreOrder(L7.bt);
		L7.PostOrder(L7.bt);
	 
	}
	
}
