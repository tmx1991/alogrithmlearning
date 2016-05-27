package com.LeeCode.dealString;

/**
 * Created by ttt on 2016/5/27.
 */
public class _242ValidAnagram {
    public static void main(String[] args) {
       String s = "anagrbm";
        String t = "nagaram";
        _242ValidAnagram va = new _242ValidAnagram();
        System.out.println(va.isAnagram(s,t));

    }

    public boolean isAnagram(String s, String t) {
        int ls = s.length();
        int lt = t.length();

        if(ls!=lt) return false;
        int i ;

        int[] x = new int[26];
        for(i=0;i<ls;i++)
        {
            char c = s.charAt(i);
            x[c-97] ++;
        }

        for(i=0;i<ls;i++)
        {
            char c = t.charAt(i);
            x[c-97] --;
        }

        for(i=0;i<26;i++)
        {
            if(x[i]!=0) return false;
        }



        return true;
    }
}
