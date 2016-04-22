package com.ThinkJ.aboutString;

/**
 * Created by ttt on 2016/4/22.
 */
public class Immutable {
    public static String upcase(String s)
    {
        s = "asd";
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";

        System.out.println(q);

        String qq = upcase(q);

        System.out.println(qq);
        System.out.println(q);
    }
}
