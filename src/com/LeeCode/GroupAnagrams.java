package com.LeeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams
{

	public static void main(String[] args)
	{
		GroupAnagrams ga = new GroupAnagrams();
		String[] s = new String[] { "tea","and","ate","eat","den" };

		System.out.println(s[2]);
		if(s[2].contains("na")==true) System.out.println("true");
		else System.out.println("false");
		System.out.println(ga.groupAnagrams(s));

	}

	public List<List<String>> groupAnagrams(String[] strs)
	{
	 
	    	  Arrays.sort(strs);//这个排序是必须的
	    	  HashMap<String, List<String>> hm = new HashMap<>();
	    	  for(int i = 0; i < strs.length; i++){
	    	    String currString = strs[i];
	    	    char[] charArr = strs[i].toCharArray();
	    	    Arrays.sort(charArr);
	    	    String sortString = new String(charArr);
	    	    List<String > tempList = hm.getOrDefault(sortString, new ArrayList<String>());
	    	    tempList.add(currString);
	    	    hm.put(sortString, tempList);
	    	  }
	    	  return new ArrayList<>(hm.values());
	}
}
