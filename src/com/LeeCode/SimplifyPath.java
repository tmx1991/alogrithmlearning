package com.LeeCode;

import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath
{

	public static void main(String[] args)
	{
		SimplifyPath sp = new SimplifyPath();

		String path = "/a/./b//../c/f";// /../不能少/
		sp.simplifyPath(path);

	}

	public String simplifyPath(String path)
	{
		if (path == null || path.length() == 0)
			return "";
		String[] paths = path.split("/+");//正则表达式的使用
		for(int i = 0;i<paths.length;i++)
			System.out.print(paths[i]+",");
		
		
		Deque<String> queue = new LinkedList<String>();

		for (String s : paths)
		{

			if (s.equals(".."))
			{//..可返回上一层
				if (!queue.isEmpty())
					queue.pollLast();
			} else if (s.equals(".") || s.equals(""))
				continue;
			else
				queue.offer(s);
		}
		StringBuilder result = new StringBuilder("");
		if (queue.isEmpty())
			result.append("/");
		while (!queue.isEmpty())
		{

			result.append("/").append(queue.poll());// Faster than string
													// manipulation.
		}
		System.out.println(result.toString());
		return result.toString();
	}
}
