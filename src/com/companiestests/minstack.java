package com.companiestests;

/**
 * Created by ttt on 2016/4/19.
 * 定义栈的数据结构，要求添加一个 min 函数，能够得到栈的最小元素。
 * 要求函数 min、push 以及 pop 的时间复杂度都是 O(1)。
 */
public class minstack {

    private int MAXSIZE = 100;
    private int top;

    private stackelement[] stacks;

    public static void main(String[] args)
    {
        minstack ms  = new minstack();
        ms.init();

        int[] data = new int[]{90,32,11,35,63,32,12,22,33,44,3};

        for (int da : data)
            ms.push(da);
        ms.minStack();

        ms.pop();
        ms.pop();

        ms.minStack();

    }

    //初始化
    public void init()
    {
        stacks = new stackelement[MAXSIZE];
        top = -1;
    }

    //栈满
    public int isFull()
    {
        if(top == MAXSIZE-1) return 1;
        else
            return 0;
    }
    //栈空
    public int isEmpty()
    {
        if(top == -1) return 1;
        else
            return 0;
    }

    //进栈
    public void push(int d)
    {
        if(isFull()==0)
        {
            stackelement se = new stackelement();
            se.data = d;
            se.min = (top==-1?d:stacks[top].min);
            if(se.min>d) se.min = d;

            top++;
            stacks[top] = se;
        }

    }

    //出栈
    public stackelement pop()
    {
        if(isEmpty() == 0)
        {
            return stacks[top--];
        }
        else
            return null;

    }
    //返回当前栈内最小值
    public void minStack()
    {
        System.out.println(stacks[top].min);
    }


    //栈的数据结构
    public class stackelement
    {
        int data;
        int min;
    }



}
