package com.companiestests.huawei;

import java.util.*;

/**
 * Created by ttt on 2016/5/15.
 */
public class statistic {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Set<Integer> ts = new TreeSet<Integer>();

        int n = in.nextInt();
        int[] data = new int[n];
        int i =0;
        while((n--)>0)
        {
            ts.add(in.nextInt());
        }
        for(int ad:ts)
            System.out.println(ad);

        List<?> c1= new ArrayList<String>();
//        torepeatAndSort(data);
    }
    public  void torepeatAndSort(int[] d)
    {

    }
}
