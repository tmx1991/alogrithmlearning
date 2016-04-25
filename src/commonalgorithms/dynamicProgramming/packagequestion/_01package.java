package commonalgorithms.dynamicProgramming.packagequestion;

/**
 * Created by ttt on 2016/4/25.
 * 0-1背包问题，动态规划的经典问题
 */
public class _01package {

    public int[] value = new int[]{60,100,120};

    public int[] weight = new int[]{10,20,30};

    public int n=value.length;

    public int w = 50;

    int[] dp = new int[w+1];

    public static void main(String[] args) {

        _01package p = new _01package();

        p.packageDp();
    }

    public void packageDp()
    {
        int i=0,j=0;

        for(i=0;i<n;i++)
        {
            for(j=w;j>=weight[i];j--)
            {
                if(dp[j-weight[i]]+value[i]>dp[j])
                {
                     dp[j] = dp[j-weight[i]]+value[i];
                }
            }
        }


        System.out.println(dp[w]);

    }
}
