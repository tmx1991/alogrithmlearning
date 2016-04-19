package commonalgorithms;

import com.linklist.*;;

public class queueDemo
{
	public static final int MAXSIZE=100;
	public int front;
	public int rear;
	public int num;
	public DataType[] data;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public queueDemo()
	{
		InitQueue(MAXSIZE);
	}

	public void InitQueue(int size)
	{
		data = new DataType[size];
		
		for(int i=0;i<size;i++)
			data[i] = new DataType();
		front = size - 1;
		rear = size - 1;
		num = 0;
	}

	public int emptyQueue()
	{
		if (num == 0)
			return 1;
		else
			return 0;
	}
	public int fullQueue()
	{
		if (num == MAXSIZE)
			return 1;
		else
			return 0;
	}
	
	public int inQueue(DataType x)
	{
		if (num == MAXSIZE)
		{
			System.out.println("队满");
			return -1;
		} else
		{
			rear = (rear + 1) % MAXSIZE;
			data[rear] = x;
			num++;
			return 1;
		}
	}
	public DataType outQueue()
	{
		if(num==0)
		{
			System.out.println("队空");
			return null;
		}
		else
		{
			front = (front+1)%MAXSIZE;
			num--;
			return data[front];
		}
	}

}
