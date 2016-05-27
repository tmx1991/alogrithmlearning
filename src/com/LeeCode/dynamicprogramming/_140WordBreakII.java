package com.LeeCode.dynamicprogramming;

import java.util.*;

/**
 * Created by ttt on 2016/5/26.
 */
public class _140WordBreakII {
    public static void main(String[] args) {
        String s = "catsanddog";
        Set<String> dict = new HashSet<String>();

        String[] dict0 = {"cat", "cats", "and", "sand", "dog"};

        for (int i = 0; i < dict0.length; i++) {
            dict.add(dict0[i]);
        }

        _140WordBreakII wbi = new _140WordBreakII();
        wbi.wordBreak(s,dict);

    }
    public List<String> wordBreak(String s, Set<String> wordDict) {
        int i=0;
        List<String> res = new ArrayList<String>();
        for(i=s.length()-1;i>=0;i--)
        {
            if(wordDict.contains(s.substring(i)))
            {
                break;//存在
            }
            else
            {
                if(i==0)
                    return res;
            }
        }

        for(i=0;i<s.length();i++)
        {
            if(wordDict.contains(s.substring(0,i+1)))
            {
                List<String> sres = wordBreak(s.substring(i+1),wordDict);

                if(sres.size()!=0)
                {
                    for (Iterator<String> it = sres.iterator(); it.hasNext(); )
                    {
                        res.add(s.substring(0, i + 1) + " " + it.next());
                    }
                }


            }
        }

        if(wordDict.contains(s)) res.add(s);

        return res;
    }
}
