/*
 * ȫ��������
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
		//Quene.permutation(ch,0,j);//�ݹ���ȫ��������

	}
	//�˵ݹ鷽�����ܽ����ͬԪ�ص�����e.g��322����������һ�β�ѯ
	public static void  recursion(char a[], int m, int n) {

		if (m < n - 1) {
			recursion(a, m + 1, n); // �ӵ�2��Ԫ�ؿ�ʼȫ����
										// �Ժ�ӵ�2��Ԫ�ؿ�ʼ���һ��Ԫ�ؽ������ٴӵ�2��Ԫ�ؿ�ʼȫ����
										// ���ԭ���У�����ѭ��
			char t;
			for (int i = m + 1; i < n; i++) {
			//	if (a[m] != a[i]) {
					t = a[m]; // ����
					a[m] = a[i];
					a[i] = t;
					recursion(a, m + 1, n);
					t = a[m]; // ��ԭ
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
	 * ��ÿ��Ԫ�طֱ��õ�һλ�����з���,Ҳ����ֱ�Ӵ��������ͬԪ�ص������ֻ��������������Ƚϣ�������ͬ
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

				if (buf.indexOf(sb.toString()) == -1)// ����Ȳ����

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
					
		
//					System.out.println("xx��ԭxx");
//					System.out.println(s);
//				    System.out.println("^^^^^^");
				 System.arraycopy(s, 0, a, 0, s.length);
			}
 
		}
		 
	}
	/*
	 * 
	 * n�Ľ׳�
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
