package com.companiestests.huawei;

import java.util.Scanner;

/**
 * Created by ttt on 2016/5/15.
 */
public class drink {
    public static void main(String[] args) {

        int n=0;
        int[] data = new int[11];

        Scanner in = new Scanner(System.in);

        while(in.hasNext())
        {
            data[n] = in.nextInt();
            n++;
        }

        for(int d:data)
            System.out.print(d+",");
        System.out.println();

        bottles(data);
    }

    public static void bottles(int[] bos)
    {
        int i = 0;
        int res=0;
        int sy = 0;
        int ca=0;

        while(bos[i]!=0)
        {
            ca = bos[i];
            if(ca ==1) res = 0;
            else if(ca ==2) res = 1;
            else
            {
                while(ca>=3)
                {
                    res = res + ca/3;
                    ca = ca/3+ca%3;
                }
                if(ca==2) res++;
            }
            System.out.println(res);
            res = 0;
            i++;
        }




    }
}
