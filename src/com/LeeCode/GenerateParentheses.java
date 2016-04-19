package com.LeeCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses
{
	 List<String> res = new ArrayList<String>();
	 StringBuffer sb  = new StringBuffer();
	 
	public static void main(String[] args)
	{
		GenerateParentheses gp = new GenerateParentheses();
		System.out.println(gp.generateParenthesis(1));

	}
	 public List<String> generateParenthesis(int n) {
		 if(n==0) return res;
		 comb(0,2*n);
		return res;
	        
	    }
	 public void comb(int m,int n)
	{  
		 
		 if(m>0&&m<n)
		 { 
			{
				sb.append("(");
				comb(m+1, n - 1);
				sb.delete(sb.length() - 1, sb.length());
			}
			{
				sb.append(")");
				comb(m-1, n - 1);
				sb.delete(sb.length() - 1, sb.length());
		}
			
		 }else if (m > 0 && m >= n)
		{
			{
				sb.append(")");
				comb(m-1, n - 1);
				sb.delete(sb.length() - 1, sb.length());
			}
		}
		 else if(m==0)
		 {
			 if(n!=0)
			{
				sb.append("(");
				comb(m+1, n - 1);
				sb.delete(sb.length() - 1, sb.length());
			}
			 else
			 {
				 System.out.println(sb.toString());
				 res.add(sb.toString());
			 }
		 }
		 
//		if (n - m == 1)
//		{
//			ch[m] = '(';
//			ch[n] = ')';
//			res.add(String.valueOf(ch));
//			System.out.println(String.valueOf(ch));
//		} else
//		{
//			ch[m] = '(';
//			ch[m + 1] = ')';
//			comb(m + 2, n);
//			ch[n] = ')';
//			comb(m + 1, n - 1);
//		}
		 
		 
	 }
}
