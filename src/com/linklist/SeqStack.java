package com.linklist;

public class SeqStack  implements Cloneable
{
	private static int MAXSIZE = 100;
	
	private int top;
	 DataType[] data = new DataType[MAXSIZE];
	public SeqStack()
	{
		// TODO Auto-generated constructor stub
	
		Init_SeqStack(MAXSIZE);
	}

	private void Init_SeqStack(int size)
	{
		// TODO Auto-generated method stub
		for(int i = 0; i < size; i++)
		{
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
			//data[top] = (DataType) x.clone();//放入时实际上是x对应的地址，若x改变则data改变
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
	private int Full_SeqStack()
	{
		if(top == MAXSIZE - 1)
			return 1;
		else
			return 0;

	}
	public DataType Pop_SeqStack()
	{
//		if(Empty_SeqStack()==-1) 
//			return null;
//			
//		else
			return data[top--];

	}
	
	public Object clone(){
		DataType cl =null;
		try
		{
			cl = (DataType)super.clone();
		} catch(CloneNotSupportedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cl;
		
		
	}

}
