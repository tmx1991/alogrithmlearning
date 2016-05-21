package com.LeeCode.dynamicprogramming;

/**
 * Created by ttt on 2016/4/25.
 */
public class _123BestTimeBuyandSellStockIII {
    public static void main(String[] args) {
        _123BestTimeBuyandSellStockIII btss = new _123BestTimeBuyandSellStockIII();

        int[] m = new int[]{2,1,2,0,1};
        btss.maxProfit(m);
    }
    public int maxProfit(int[] prices) {
        if(prices.length<=1)return 0;
        int len = prices.length;
        int min1 = prices[0];
        int[] profit1 = new int[len];
        profit1[0] = 0;
        int i;
        for(i=1;i<len;i++)
        {
            if(prices[i]<min1)
            {
                min1 = prices[i];
                profit1[i] = profit1[i-1];
            }

            else
            {
                if(prices[i]-min1>profit1[i-1])
                    profit1[i] = prices[i]-min1;
                else
                    profit1[i] = profit1[i-1];
            }
        }

        for(i=0;i<len;i++)
            System.out.print(profit1[i]+",");
        System.out.println();
        int max1 = prices[len-1];
        int[] profit2 = new int[len];
        profit2[len-1] = 0;
        for(i=len-2;i>=0;i--)
        {
            if(prices[i]>max1)
            {
                max1 = prices[i];
                profit2[i] =profit2[i+1];
            }
            else
            {
                if(max1 - prices[i]>profit2[i+1])
                {
                    profit2[i] = max1 - prices[i];
                }
                else
                    profit2[i] =profit2[i+1];
            }

        }
        for(i=0;i<len;i++)
            System.out.print(profit2[i]+",");
        System.out.println();


        int max=0;

        for(i=0;i<len;i++)
            if(profit1[i]+profit2[i]>max)
                max= profit1[i]+profit2[i];

        System.out.println(max);
        return max;
    }
}
