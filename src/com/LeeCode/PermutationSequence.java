package com.LeeCode;

import java.util.ArrayList;

public class PermutationSequence
{

	public static void main(String[] args)
	{
		PermutationSequence ps = new PermutationSequence();
		int i = 4;
		int j = 10;
		ps.getPermutation(i, j);

	}

	public String getPermutation(int n, int k)
	{

	 

		 int[] factorial = new int[n];
		 ArrayList<Integer> candidate = new ArrayList<Integer>();
		
		 // Build factorial array
		 for (int i = 0; i < n; i++) {
		 candidate.add(i + 1);
		 factorial[i] = i == 0 ? 1 : i * factorial[i - 1];
		 }
		
		 StringBuilder sb = new StringBuilder();
		
		 // Iteratively generates answer
		 while (n > 0) {
		 int remain = ((k - 1) % factorial[n - 1]) + 1;
		 sb.append(candidate.remove(((k - 1) / factorial[n - 1])));
		 System.out.println(sb);
		 n--;
		 k = remain;
		 }
		System.out.println(sb.toString());
		return sb.toString();

	}
}
