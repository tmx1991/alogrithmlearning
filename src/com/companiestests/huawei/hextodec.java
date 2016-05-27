package com.companiestests.huawei;

import sun.security.util.BitArray;

import java.util.Scanner;

/**
 * Created by ttt on 2016/5/15.
 */
public class hextodec {
    public static void main(String[] args) {
        String str = "0x0a";
        System.out.println(Integer.parseInt(str.substring(2),16));
        Fu f = new Zi();
        f.test();


    }


}
class Fu
{
    public void test()
    {
        System.out.println("Fu");

    }
}
class Zi extends Fu
{
    public void tes2t()
    {
        System.out.println("Zi");

    }
}