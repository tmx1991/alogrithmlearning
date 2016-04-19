package com.linklist;

public class SeqList implements IList{
	
	private int last;
	private static final int MAXSIZE = 100;
	private int[] data;
	
	SeqList()
	{
		Init_SeqList(MAXSIZE);
	}

	@Override
	public void Init_SeqList(int size) {
		// TODO Auto-generated method stub
		data = new int[size];
		last = -1;
	}
	
	public int Length_SeqList()
	{
		return last+1;
	}
	
	public int Insert_SeqList(int i, int x)
	{
		int j;
		if (last == MAXSIZE - 1)
		{
			System.out.println("±íÂú");
			return -1;
		}
		if (i < 1 || i > last + 2)
		{
			System.out.println("Î»ÖÃ´í");
			return 0;
		}
		for (j = last; j >= i - 1; j--)
			data[j + 1] = data[j];
		data[i - 1] = x;
		last++;
		return 1;

	}
	

}
