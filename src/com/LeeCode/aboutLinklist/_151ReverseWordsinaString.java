package com.LeeCode.aboutLinklist;

/**
 * Created by ttt on 2016/5/7.
 */
public class _151ReverseWordsinaString {
    public static void main(String[] args) {
        _151ReverseWordsinaString rws = new _151ReverseWordsinaString();
        rws.reverseWords("  the ");
    }
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();

        int len = s.length();

        int head=0;
        int ll=len-1,lr=len-1;
        //去除首位空格
        while (head < len && s.charAt(head) == ' ')
            head++;
        if(head == len)
            return sb.toString();
        //去除最后空格
        while(ll>=head&&s.charAt(ll)==' ')
        {
            ll--;
        }
        lr = ll;
        while(ll>=head)
        {
            if(s.charAt(ll)!=' ')
            {
                ll--;
            }
            else
            {
                sb.append(s.substring(ll+1,lr+1)+" ");

                ll--;
                while(ll>=head&&s.charAt(ll)==' ')
                {
                    ll--;
                }
                lr = ll;
            }
        }
        sb.append(s.substring(head,lr+1));


        return sb.toString();

    }
}
