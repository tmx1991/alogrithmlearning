package commonalgorithms.dynamicProgramming.LIS;

import java.util.Scanner;

/**
 * Created by ttt on 2016/5/16.
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
//        int[] a  = {0,3,5,7,6};//首位不属于有效数据
//        int[] b  = {0,3,5,7,8};

        Scanner scan = new Scanner(System.in);

        int a=scan.nextInt();

        int h[]=new int[a];

        for(int i=0;i<a;i++){

            h[i]=scan.nextInt();

        }
        lis.chorus(h);
    }
    //合唱队形，中间高，两边低
    public void chorus(int[] h)
    {


    }

    /**
     * 最长递增子序列
     * 初始化对角线为 1；
     * 对每一个 i，遍历 j（0 到 i-1）：
     * 若A[i] <= A[j]，置 1。
     * 若A[i] > A[j]，取第 j 行的最大值加 1。
     * @param a
     */
    public void lisLength(int[] a)
    {
        int m=a.length;
        int[][] li = new int[m][m];
        int i =0,j;
        int[] max = new int[m];

//从1开始
        for(i=1;i<m;i++)
        {
            li[i][i] = 1;
            max[i] = 1;
        }



        for(i=2;i<m;i++)
        {
            for(j=1;j<=i-1;j++)
            {
                if(a[i]<=a[j])li[i][j] = 1;
                else li[i][j] = max[j] + 1;

                if(li[i][j]>max[i])
                max[i] = li[i][j];
            }
        }

        for(i=0;i<m;i++)
            System.out.print(li[m-1][i]+",");
        System.out.println(max[m-1]);

    }
    //求最长公共子序列
    public void lcsLength(int[] a,int[] b)
    {
        int m = a.length,n = b.length;
        int[][] c = new int[m][n];//c表示x（i）与y（j）的最长子序列长度

        c[0][0] = 0;//0,0不赋值
        int[][] d = new int[m][n];//表示路径

        for (int i = 1; i <m ; i++)
        {
            for (int j = 1; j <n ; j++)
            {
                if(a[i] == b[j])
                {
                    c[i][j] = c[i-1][j-1] + 1;

                    d[i][j] = a[i];
                }
                else if(c[i][j-1]>c[i-1][j])
                {
                    c[i][j] =c[i][j-1];
                    d[i][j] = -1;
                }
                else
                {
                    c[i][j] =c[i-1][j];
                    d[i][j] = -1;
                }



            }

        }
        System.out.println(c[m-1][n-1]);
        for(int i = 0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if(d[i][j]!=-1&&d[i][j]!=0)
                    System.out.println(d[i][j]);
            }



    }
}
