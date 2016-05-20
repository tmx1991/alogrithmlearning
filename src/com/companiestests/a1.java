package com.companiestests;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
public class a1
{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = sc.nextInt();
        int[][] ls = new int[n][4];
        int i=0;

        if(n==0) out.println(0);


        while(i<n)
        {

            ls[i][0]= sc.nextInt();
            ls[i][1] = sc.nextInt();
            ls[i][2] = sc.nextInt();
            ls[i][3] = sc.nextInt();
            i++;

        }

        for(i=0;i<n;i++)
        {
            int a = ls[i][0];
            int b = ls[i][1];
            int d = ls[i][2];
            int m = ls[i][3];
            int temp = a*b;
            if(temp<10)
            {
                if(temp==d)out.println(m);
                else
                    out.println(0);
            }
            else if(temp == 10)
            {
                if(d==1) out.println(m);
                else if(d==0)out.println(1);
                else out.println(0);
                continue;
            }
            else
            {
                m++;
                int e = temp/10;
                int f = temp%10;
                int num =0;

                if(e+f<10)
                {
                    if(e==d) num++;
                    if(f==d) num++;
                    if(e+f ==d)num = num+m-2;

                    out.println(num);
                }

                else
                {

                    int j = (e+f)%10;

                    if(j==d) num++;
                    if(e+1==d) num++;
                    if(f==d)num++;
                    if(j+1==d) num = num+m-3;

                    out.println(num);
                }
            }
        }

        out.flush();

    }


}