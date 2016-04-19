package com.LeeCode;

public class LengthofLastWord
{

	public static void main(String[] args)
	{
		LengthofLastWord lfl = new LengthofLastWord();
		String s= "Hello World";
		lfl.lengthOfLastWord(s);
		

	}
public int lengthOfLastWord(String s) {
	
	if (s.length()==0) return 0;
	 String sb[] = s.trim().split(" ");
	return sb[sb.length-1].length();
    }
}
