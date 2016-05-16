package commonalgorithms.dynamicProgramming.LIS;

/**
 * Created by ttt on 2016/5/16.
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] a  = {1,3,5,7,6};
        int[] b  = {1,3,5,7,8};
        lis.lcsLength(a,b);
    }

    //求最长公共子序列
    public void lcsLength(int[] a,int[] b)
    {
        int m = a.length,n = b.length;
        int[][] c = new int[m][n];//c表示x（i）与y（j）的最长子序列长度

        c[0][0] = 0;//0,0不赋值
        int[][] d = new int[m][n];//表示路径
        System.out.println(d[2][2]);
//        for (int i = 1; i <m ; i++)
//        {
//            for (int j = 1; j <n ; j++)
//            {
//                if(a[i] == b[j])
//                {
//                    c[i][j] = c[i-1][j-1] + 1;
//
//                    d[i][j] = a[i];
//                }
//                else if(c[i][j-1]>c[i-1][j])
//                {
//                    c[i][j] =c[i][j-1];
//                }
//                else
//                    c[i][j] =c[i-1][j];
//
//
//            }
//
//        }


    }
}
