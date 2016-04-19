package com.LeeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations
{
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer>  li = new ArrayList<Integer>();
	int[] data;
	int len;
	public static void main(String[] args)
	{
		Permutations p = new Permutations();
		int[] nums = new int[]{-1,-1,0,0,1,1,2};
		
//		List<Integer>  li0 = new ArrayList<Integer>();
//		li0.add(1);
//		li0.add(2);
//		li0.add(3);
//		li0.add(4);
		 //  System.out.println(p.permuteUnique(nums));
		 
		  p.permute(nums);

	}
	 public List<List<Integer>> permute(int[] nums) {
		 len = nums.length;
		 Arrays.sort(nums);
		 data = new int[len];
		 data = nums;
		 if(len==0) return res;
		 pailie(0);
		 System.out.println(res.size());
		return res;
	        
	    }
	 
	private void pailie(int n)
	{
		if(n==len) 
		{
			res.add(new ArrayList<Integer>(li));
			System.out.println(li);
		}
		int temp;
		 for(int i =n;i<len;i++)
		 {
			 if(i>n&&((data[n]==data[i])||(data[i]==data[i-1]))) continue;// 加上此句，排除相同的情况???仍有重复 
			 temp = data[n];
			 data[n] = data [i];
			 data[i] =temp;
			 
			 li.add(data[n]);
			 pailie(n+1);
			 
			 
			 li.remove(li.size()-1);
			 
			 temp = data[n];
			 data[n] = data [i];
			 data[i] =temp;
			 
	 
		 }		
	}
	 public List<List<Integer>> permuteUnique(int[] num) {
	        List<List<Integer>> result=new ArrayList();
	        if(num==null||num.length==0){
	            return result;
	        }
	        result.add(new ArrayList<Integer>());
	        List<List<Integer>> cache=new ArrayList();
	        Arrays.sort(num);
	        int counter=0;
	        int cur;
	        for(int i=0; i<num.length; i++){
	            cur=num[i];
	            counter++;
	            if(i==num.length-1||cur!=num[i+1]){
	                generatePermutation(result, cache, cur, counter);
	                counter=0;
	                result=cache;
	                cache=new ArrayList();
	            }
	        }
	        System.out.println(result.size());
	        return result;    
	    }

	    private void generatePermutation(List<List<Integer>> result, List<List<Integer>> cache, int cur, int counter){
	        for(List<Integer> temp: result){
	            generatePermutation(temp, 0, cache, cur, counter, new ArrayList<Integer>());
	        }
	    }

	    private void generatePermutation(List<Integer> onePermutation, int listIndex, List<List<Integer>> cache, int cur, int counter, List<Integer> curPerm){
	        if(listIndex==onePermutation.size()&&counter==0){
	            cache.add(curPerm);
	            return;
	        }

	        if(counter>0){
	            List<Integer> temp=new ArrayList(curPerm);
	            temp.add(cur);
	            generatePermutation(onePermutation, listIndex, cache, cur, counter-1, temp);
	        }

	        if(listIndex<onePermutation.size()){
	            List<Integer> temp=new ArrayList(curPerm);
	            temp.add(onePermutation.get(listIndex));
	            generatePermutation(onePermutation, listIndex+1, cache, cur, counter, temp);
	        }
	    }
}








