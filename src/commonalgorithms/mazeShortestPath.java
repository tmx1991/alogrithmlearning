package commonalgorithms;

import com.linklist.DataType;
import com.linklist.item;

public class mazeShortestPath
{
	
	static int m=6;
	static int n=8;


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
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
    	
    	mazeShortestPath msp = new mazeShortestPath();
    	msp.path(migong,it);

	}
	
	public int path(int[][] maze,item[] move)
	{
		queueDemo Q = new queueDemo();
		int x,y,i,j,v;
		DataType elem = new DataType();
		Q.data[0].x = 1; 
		Q.data[0].y = 1;
		Q.data[0].d = -1;
		Q.inQueue(Q.data[0]);
		
		Q.front=-1;//队列的起始位置有变
		Q.rear=-1;
		Q.num=1;
		
		maze[1][1] = -1;
		while (Q.emptyQueue() == 0)
		{
			elem = Q.outQueue();
			v = elem.d+1;
			while(v < 8)
			{
				i = elem.x + move[v].p;
				j = elem.y + move[v].q;
				System.out.print(elem.x+","+elem.y+",,");
				System.out.print(move[v].p+","+move[v].q+",,");
				System.out.println(i+","+j);

				if (maze[i][j] == 0)
				{
					Q.rear++;
					elem.x = i;
					elem.y = j;
					elem.d = v;
					System.out.println("--->"+elem.x+","+elem.y+","+v+",,");
					Q.inQueue(elem);
					maze[i][j] = -1;

				}
				
				if((i==m)&&(j==n))
				{
					printPath(Q.data,Q.rear);
					int[][] migong ={
							{1,1,1,1,1,1,1,1,1,1,},
							{1,-1,1,1,1,0,1,1,1,1,},
							{1,1,0,1,0,1,1,1,1,1,},
							{1,0,1,0,0,0,0,1,1,1,},
							{1,0,1,1,1,0,1,1,1,1,},
							{1,1,0,0,1,1,0,0,0,1,},
							{1,0,1,1,0,0,1,1,0,1,},
							{1,1,1,1,1,1,1,1,1,1,},
							};
					maze = migong;
					return 1;
				}
			}
		}
		return 0;
	}

	private void printPath(DataType[] data, int rear)
	{
		// TODO Auto-generated method stub
		for (int i = 0; i <= rear; i++)
		{
			System.out.print("(" + data[i].x + "," + data[i].y + ","
					+ data[i].d + ")");
		}
		System.out.println();
	}

}




