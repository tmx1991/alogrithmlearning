/*
 * N ——》r进制转换问题
 */
package com.linklist;

public class NToRconversion
{
	static int m=6;
	static int n=8;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		NToRconversion nt = new NToRconversion();
//		nt.conversion(3467, 8);
		int re;
		int[][] migong ={
				{1,1,1,1,1,1,1,1,1,1,},
				{1,0,1,1,1,0,1,1,1,1,},
				{1,1,0,1,0,1,1,1,1,1,},
				{1,0,1,0,0,0,0,1,1,1,},
				{1,0,1,1,1,0,1,1,1,1,},
				{1,1,0,0,1,1,0,0,0,1,},
				{1,0,1,1,0,0,1,1,0,1,},
				{1,1,1,1,1,1,1,1,1,1,},
				};

		item[] it = new item[8];
		for (int i = 0; i < 8; i++) {
		it[i] = new item();
		}
  
    	it[0].p= 0;it[0].q=1;
    	it[1].p= 1;it[1].q=1;
    	it[2].p= 1;it[2].q=0;
    	it[3].p= 1;it[3].q=-1;
    	it[4].p= 0;it[4].q=-1;
    	it[5].p= -1;it[5].q=-1;
    	it[6].p= -1;it[6].q=0;
    	it[7].p= -1;it[7].q=1;
    	
     	
//	       re= nt.path(migong, it);
//		   System.out.println(re);
		nt.ceshi();
    
	}
	public void ceshi()
	{SeqStack S;
	S = new SeqStack();
		DataType temp = new DataType();
		temp.x=1;temp.y=2;temp.d=3;
		S.Push_SeqStack(temp);
		DataType temp1 = new DataType();
		temp1.x=9;temp1.y=9;temp1.d=9;
		S.Push_SeqStack(temp1);
		temp1.x=6;temp1.y=6;temp1.d=6;
		S.Push_SeqStack(temp1);
		while(S.Empty_SeqStack()==0)
		{
			System.out.print(S.Pop_SeqStack().d);
		}
	}

	public void conversion(int N,int r)
	{
		SeqStack S;
		int x;
		DataType temp = new DataType();
		
		S = new SeqStack();
		while(N!=0)
		{   temp.y=N%r;
			S.Push_SeqStack(temp);
			N = N/r;
			 
		}
		
		while(S.Empty_SeqStack()==0)
		{
			System.out.print(S.Pop_SeqStack().y);
		}
	}
	
	public int path(int[][] maze, item[] move)
	{
		Seq_Stack S = new Seq_Stack();
		DataType temp = new DataType();
		DataType temp2 = new DataType();
		int x, y, d, i, j;
		temp.x = 1;
		temp.y = 1;
		temp.d = -1;
		maze[1][1] = -1;
		S.Push_SeqStack(temp);
		while(S.Empty_SeqStack() == 0)
		{
			temp = S.Pop_SeqStack();
			x = temp.x;
			y = temp.y;
			d = temp.d + 1;
			while(d < 8)
			{
				i = x + move[d].p;
				j = y + move[d].q;

				if(maze[i][j] == 0)
				{
					temp.x = x;
					temp.y = y;
					temp.d = d;
					System.out.println(temp.x+","+temp.y+","+temp.d);
					S.Push_SeqStack(temp);
					x = i;
					y = j;
					
					maze[x][y] = -1;
					if(S.top==2)
					{
					System.out.println("data3="+S.data[2].y);
					System.out.println("data2="+S.data[1].y);
					}
					if(x == m && y == n)
					{ 
						System.out.println("data="+S.data[S.top].y);

						System.out.println("top1="+S.top);
						temp2=S.Pop_SeqStack();
						System.out.println("top1="+S.top);
						System.out.println("data="+S.data[S.top].y);
						
//						while(S.Empty_SeqStack()==0)
//						{
							System.out.println("top1="+S.top);
							temp2=S.Pop_SeqStack();
							System.out.print(temp2.x+","+temp2.y+","+temp2.d);
							System.out.print("-->");
							System.out.println("top2="+S.top);
							temp2=S.Pop_SeqStack();
							System.out.print(temp2.x+","+temp2.y+","+temp2.d);
						
						
//						}
						System.out.println();
						return 1;
					}
						
					else
						d = 0;

				} else
					d++;
			}
		}

		return 0;
	}
	
}
