package com.LeeCode.dealString;

/**
 * Created by ttt on 2016/4/27.
 */
public class _165CompareVersionNumbers {
    public static void main(String[] args) {
        _165CompareVersionNumbers cvn = new _165CompareVersionNumbers();
        System.out.println(cvn.compareVersion("1.2", "1.10"));
    }

    public int compareVersion(String version1, String version2) {

        int l1 = version1.length();
        int l2 = version2.length();

        int res = 0;

        int flag = 0;
        int i = 0, j = 0;

        while (i < l1 && version1.charAt(i) == '0')
            i++;
        while (j < l2 && version2.charAt(j) == '0')
            j++;


        while (i < l1 || j < l2) {
            int v1 = 0, v2 = 0;
            if (i < l1)
            {
                v1 = version1.charAt(i) - '0';
                if (v1 == -2)
                {
                    while (i < l1 && version1.charAt(i) == '0')
                        i++;
                }
                else
                    i++;

            } else
            {
                v1 = -2;
                i++;
            }


            if (j < l2)
            {

                v2 = version2.charAt(j) - '0';
                if (v2 == -2)
                {
                    while (j < l2 && version2.charAt(j) == '0')
                        j++;
                } else
                    j++;

            } else
            {
                v2 = -2;
                j++;
            }

//            System.out.println(i+","+j+"-"+v1+","+v2);

            if (flag==0&&(v1 < v2))
            {
                flag=1;
                res = -1;
            }
            else if (flag==0&&(v1 > v2))
            {
                flag=1;
                res = 1;
            }

            if(v1==-2&&v2!=-2) return -1;
            else if(v2==-2&&v1!=-2) return 1;
        }

        return res;
    }

}
