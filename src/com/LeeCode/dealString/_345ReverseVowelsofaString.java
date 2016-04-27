package com.LeeCode.dealString;

/**
 * Created by ttt on 2016/4/27.
 */
public class _345ReverseVowelsofaString {

    public static void main(String[] args) {
        _345ReverseVowelsofaString rvs = new _345ReverseVowelsofaString();

        StringBuffer sb = new StringBuffer();
        sb.append("sssd");
        sb.insert(1,"a");
        System.out.println(sb.toString());
        rvs.reverseVowels("aA");
    }

    public String reverseVowels(String s) {

        StringBuffer sb = new StringBuffer();

        if(s.length()==0) return sb.toString();

        int i,j;

        i=0;j=s.length()-1;

        while(i<=j)
        {
            while(i<s.length()&&panduan(s.charAt(i)))
            {
                sb.insert(i,s.charAt(i));
                i++;
            }
//            System.out.println(sb.toString()+","+i+","+j);

            while(i<j&&panduan(s.charAt(j)))
            {
                sb.insert(i,s.charAt(j));
                j--;
            }
//            System.out.println(sb.toString()+","+i+","+j);
            if(i<j)
            {
                sb.insert(i,s.charAt(j));

                sb.insert(i+1,s.charAt(i));

                i++;
                j--;

            }
            else if(i==j)
            {
                sb.insert(i,s.charAt(j));
                break;
            }



        }


        System.out.println(sb.toString());
        return sb.toString();

    }

    public boolean panduan(char c)
    {
        if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U')
            return true;
        else
            return false;

    }
}
