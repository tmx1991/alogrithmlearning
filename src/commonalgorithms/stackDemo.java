package commonalgorithms;

import com.LinkBit.*;

public class stackDemo
{
	public static final int MAXSIZE=100;
	public DataType[] data;
	public static int top ;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		stackDemo sd= new stackDemo();
		
		DataType a1 = new DataType();
		a1.x=8;
		DataType a2 = new DataType();
		a2.x=5;
		//初始化空栈
		sd.Init_seqStack(MAXSIZE);
		//入栈
		sd.pushStack(a1);
		sd.pushStack(a2);
		//出栈
		sd.popStack();
		//
		sd.printStack();

	}
	
	public void Init_seqStack(int size)
	{
		data = new DataType[size];
		top = -1;
	}
	
	public int stackEmpty()
	{
		if(top==-1)
			return 1;
		else 
			return 0;
	}
	public int stackFull()
	{
		if(top==MAXSIZE-1)
			return 1;
		else 
			return 0;
	}
	
	public int pushStack(DataType x)
	{
		if(stackFull()==1) return 0;
		else
		{
			top++;
			data[top] = x;
			return 1;
		}
	}
	public DataType popStack()
	{
		if(stackEmpty()==1) return null;
		else
		{
			return data[top--];
		}
	}
	
	public void printStack()
	{
		if(top!=-1)
		{
			for(int i =0;i<=top;i++)
			System.out.print(data[i].x+",");
		}
	}


}
