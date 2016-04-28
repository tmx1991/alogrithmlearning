package commonalgorithms.fourArithmetic;
import java.util.Stack;
/**
 * Created by ttt on 2016/4/28.
 * 四则运算
 * * 首位不能有符号
 */
public class arithmetic {

    public static void main(String[] args) {
        String s = "14/3*2";


        arithmetic a = new arithmetic();
        System.out.println(a.operation(s));
    }


    public int operation(String s)
    {
        int j;
        Stack<String> operator = new Stack<String>();
        Stack<String> postfix = new Stack<String>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='+'||s.charAt(i)=='-')
            {
                while(!operator.isEmpty()&&(!operator.peek().equals("(")))
                   postfix.push(operator.pop());
                operator.push(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i)=='*'||s.charAt(i)=='/')
            {
                while(!operator.isEmpty()&&(!operator.peek().equals("("))&&(!operator.peek().equals("+"))&&(!operator.peek().equals("-")))
                postfix.push(operator.pop());
                operator.push(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i)=='(')
            {
                operator.push(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i)==')')
            {
                while(!operator.peek().equals("("))
                    postfix.push(operator.pop());
                operator.pop();
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                j=i;
                while(i+1<s.length()&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')
                {
                    i++;
                }
                postfix.push(s.substring(j,i+1));
            }
            else
            {

            }
        }
        while(!operator.isEmpty())
            postfix.push(operator.pop());
//        for(Character o:operator)
//            {
//                System.out.print(o+",");
//            }
//        System.out.println();
//            for(String o:postfix)
//            {
//                System.out.print(o+",");
//            }
        Stack<Integer> si = new Stack<Integer>();
        for(int i=0;i<postfix.size();i++)
        {
            int a,b;
            if(postfix.get(i).equals("+"))
            {
                a = si.pop();
                b = si.pop();
                si.push(a+b);
            }
            else  if(postfix.get(i).equals("-"))
            {
                a = si.pop();
                b = si.pop();
                si.push(b-a);
            }
            else  if(postfix.get(i).equals("*"))
            {
                a = si.pop();
                b = si.pop();
                si.push(a*b);
            }
            else  if(postfix.get(i).equals("/"))
            {
                a = si.pop();
                b = si.pop();
                si.push(b/a);
            }else
            {
                si.push(Integer.valueOf(postfix.get(i)));
            }
        }
    return si.pop();
    }
}
