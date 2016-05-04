package commonalgorithms.foroffers;

/**
 * Created by ttt on 2016/5/4.
 * 用%20替换空格
 */
public class ReplaceNull {

    public static void main(String[] args) {
        ReplaceNull r = new ReplaceNull();
        r.replaceNulls(" we are family ");

        int n = 0xFFFFFFFF;
        int count = 0;
        while(n!=0)
        {
            count++;
            n = n&(n-1);
        }
        System.out.println(count);


        double d1=1.0,d2=2.0;

        System.out.println(d1-d2);
    }

    public String replaceNulls(String s)
    {


        int i,j;
        int len = 0;
        for (i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                len++;
                System.out.println(len);
            }
        }

        len = len*2+s.length();

        char[] res = new char[len];

        j=len-1;

        for(i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                res[j--] = '0';

                res[j--] = '2';

                res[j--] = '%';
            }
            else
            {
                res[j--] = s.charAt(i);

            }
        }

        System.out.println(String.valueOf(res));

        return String.valueOf(res);
    }
}
