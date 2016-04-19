package com.linklist;


public class Seq_Stack 
{
	private static int MAXSIZE = 100;
	
	public  int top;
	public  DataType[] data;
	public Seq_Stack()
	{
		// TODO Auto-generated constructor stub
	
		Init_SeqStack(MAXSIZE);
	}
	private void Init_SeqStack(int size)
	{
		// TODO Auto-generated method stub
		data = new DataType[size];
		for (int i = 0; i < size; i++) {
			data[i] = new DataType();
			}
		top = -1;
		
	}
	
	public int Push_SeqStack(DataType x)
	{
		if(Full_SeqStack()!= 0)
			return 0;
		else
		{
			top++;
			data[top] = x;
			System.out.println(top);
			System.out.println(data[top].x+","+data[top].y+","+data[top].d);
			
			if(top==1)
			{
			System.out.println("data0="+data[1].y);
			System.out.println("data1="+data[0].y);
			}
			return 1;
		}
	}
	
	public int Empty_SeqStack()
	{
		if(top == - 1)
			return 1;
		else
			return 0;

	}
	private  int Full_SeqStack()
	{
		if(top == MAXSIZE - 1)
			return 1;
		else
			return 0;

	}
	public DataType Pop_SeqStack()
	{
		if(Empty_SeqStack()==1) 
			return null;
			
		else
			{ 
			return data[top--];}

	}

}
