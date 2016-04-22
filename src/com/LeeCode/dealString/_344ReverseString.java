package com.LeeCode.dealString;

/**
 * Created by ttt on 2016/4/22.
 */
public class _344ReverseString {
    public static void main(String[] args) {
        _344ReverseString rs = new _344ReverseString();

        rs.reverseString("qw erty");
    }


    public String reverseString(String s) {

        StringBuffer sb = new StringBuffer();

        if(s.length()==0) return sb.toString();

        int i=0;

        for(i = s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }

        System.out.println("sb="+sb.toString());

        return sb.toString();

    }
}
