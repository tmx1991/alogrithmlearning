/*
 * 全排列问题
 */
package com.test;

public class Quene {
	
	static public int flag = 0;
	static public StringBuffer buf=new StringBuffer();
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  		int i,j,m;
	    char temp;
	    int n = 1234;
		String s = Integer.toString(n);
		j=s.length();
		char[] ch = new char[j];
		char[] ch2 = new char[j];
		 
		for(i=0;i<j;i++)
		{
			ch[i] = s.charAt(i);
			ch2[i] = s.charAt(i);
		
		}
	 
		Quene qu = new Quene();
		qu.quanpailie(ch,0,j,ch2);
		System.out.println("n!="+qu.fact(j));
		//Quene.permutation(ch,0,j);//递归解决全排列问题

	}
	//此递归方法不能解决相同元素的排列e.g：322、，可增加一次查询
	public static void  recursion(char a[], int m, int n) {

		if (m < n - 1) {
			recursion(a, m + 1, n); // 从第2个元素开始全排列
										// 以后从第2个元素开始与第一个元素交换，再从第2个元素开始全排列
										// 最后还原序列，进行循环
			char t;
			for (int i = m + 1; i < n; i++) {
			//	if (a[m] != a[i]) {
					t = a[m]; // 交换
					a[m] = a[i];
					a[i] = t;
					recursion(a, m + 1, n);
					t = a[m]; // 还原
					a[m] = a[i];
					a[i] = t;
				//}
			}
		} 
		else {
			System.out.println(a);
			System.out.println("-------------------");
		}
	}
	/*
	 * 将每个元素分别置第一位的排列方法,也不能直接处理存在相同元素的情况，只有在输出部分做比较，屏蔽相同
	 */
	public  void quanpailie(char a[], int m, int n, char s[])
	{
		char t;
	 
		for (int x = m; x < n; x++)
		{   
			System.arraycopy(a, 0, s, 0, s.length);
			
		 
				t = s[x];
				s[x] = s[m];
				s[m] = t;
			 
//			System.out.println("m="+m);
//			System.out.println("x="+x);
//			System.out.println(s);
			
			if (m == (n - 1))

			{

				StringBuffer sb = new StringBuffer();
				for (int y = 0; y < s.length; y++)
				{
					sb.append(s[y]);
				}

				if (buf.indexOf(sb.toString()) == -1)// 若相等不输出

				{
					buf.append(sb);
					buf.append("---");
					System.out.println("____"+(++flag));
					System.out.println(sb);
				}

			}
	    else{
//				System.out.println("go");
				System.arraycopy(s, 0, a, 0, s.length);
				this.quanpailie(a, m + 1, n, s);
//				System.out.println("back");
//				System.out.println("m2="+m);
//				System.out.println("x2="+x);
	
					t = s[x];
					s[x] = s[m];
					s[m] = t;
					
		
//					System.out.println("xx还原xx");
//					System.out.println(s);
//				    System.out.println("^^^^^^");
				 System.arraycopy(s, 0, a, 0, s.length);
			}
 
		}
		 
	}
	/*
	 * 
	 * n的阶乘
	 */
	
	private int fact(int n)
	{
	 
		if(n == 0)
		{
			return 1;
		}
		else
		{
			 
			return  n*fact(n-1);
		}

	}

}
