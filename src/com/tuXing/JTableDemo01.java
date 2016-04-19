package com.tuXing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo01
{

	public static void main(String[] args)
	{
	JFrame frame = new JFrame("welcome");
	String [] titles = {"姓名","年龄","性别","数学成绩","英语成绩","总分","是否及格"};
	
	Object[][] userInfo ={
			{"tt",20,"nan",89,87,88,true},
			{"ss",24,"nan",89,87,88,false}
	};
	
	JTable table = new JTable(userInfo,titles);
	JScrollPane scr=new JScrollPane(table);
	frame.add(scr);
	frame.setSize(350,90);
	frame.setVisible(true);
	frame.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(1);
		}
	});

	}

}
