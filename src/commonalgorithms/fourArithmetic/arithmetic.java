package commonalgorithms.fourArithmetic;
import java.util.Stack;
/**
 * Created by ttt on 2016/4/28.
 * 四则运算
 *
 * 只能处理一位数的运算,首位不能有符号
 */
public class arithmetic {

    public static void main(String[] args) {
        String s = " 3+(4-6)*2+6/3";

        arithmetic a = new arithmetic();
        a.operation(s);
    }


    public int operation(String s)
    {
        Stack<Character> operator = new Stack<Character>();
        Stack<Character> postfix = new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='+')
            {
                while(!operator.isEmpty()&&(operator.peek()!='('))
                   postfix.push(operator.pop());
                operator.push(s.charAt(i));
            }
            else if(s.charAt(i)=='-')
            {
                while(!operator.isEmpty()&&(operator.peek()!='('))
                     postfix.push(operator.pop());
                operator.push(s.charAt(i));
            }
            else if(s.charAt(i)=='*')
            {
                operator.push(s.charAt(i));
            }
            else if(s.charAt(i)=='/')
            {
                operator.push(s.charAt(i));
            }
            else if(s.charAt(i)=='(')
            {
                operator.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                while(operator.peek()!='(')
                    postfix.push(operator.pop());
                operator.pop();
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                postfix.push(s.charAt(i));
            }
            else
            {

            }


//
        }
        while(!operator.isEmpty())
            postfix.push(operator.pop());
//        for(Character o:operator)
//            {
//                System.out.print(o+",");
//            }
//        System.out.println();
            for(Character o:postfix)
            {
                System.out.print(o+",");
            }

        Stack<Integer> si = new Stack<Integer>();
        for(int i=0;i<postfix.size();i++)
        {
            int a,b;
            if(postfix.get(i)=='+')
            {
                a = si.pop();
                b = si.pop();
                si.push(a+b);
            }
            else  if(postfix.get(i)=='-')
            {
                a = si.pop();
                b = si.pop();
                si.push(b-a);
            }
            else  if(postfix.get(i)=='*')
            {
                a = si.pop();
                b = si.pop();
                si.push(a*b);
            }
            else  if(postfix.get(i)=='/')
            {
                a = si.pop();
                b = si.pop();
                si.push(b/a);
            }else
            {
                si.push(postfix.get(i)-'0');
            }


        }
        System.out.println(si.size());
        System.out.println(si.pop());





    return 0;
    }
}
