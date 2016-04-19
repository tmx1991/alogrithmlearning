package com.tuXing;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class DefaultTable extends AbstractTableModel
{
	String[] titles = { "姓名", "年龄", "性别", "数学成绩", "英语成绩", "总分", "是否及格" };

	Object[][] userInfo = { { "tt", 20, "nan", 89, 87, 88, true },
			{ "ss", 24, "nan", 89, 87, 88, false } };
	
	public int getColumnCount(){
		return this.titles.length;
	}
	public int getRowCount(){
		return this.userInfo.length;
	}
	public Object getValueAt(int rowIndex,int columnIndex){
		return this.userInfo[rowIndex][columnIndex];
	}
	public String getColumnName(int columnIndex)
	{
		return this.titles[columnIndex];
	}
	public Class<?> getColumnClass(int columnIndex)
	{
		return this.getValueAt(0, columnIndex).getClass();
	}
	public boolean isCellEditable(int rowIndex,int columnIndex)
	{
		return true;//是否可编辑
	}
	public void setValueAt(Object aValue,int rowIndex,int columnIndex)
	{
		this.userInfo[rowIndex][columnIndex] = aValue;
	}

}

class TableColumnModelDemo{
	private JFrame frame = new JFrame("welcome");
	private JTable table = null;
	private DefaultTable defaultTable = new DefaultTable();
	private JComboBox sexList = new JComboBox();
	public TableColumnModelDemo(){
		this.table = new JTable(this.defaultTable);
		this.sexList.addItem("男");
		this.sexList.addItem("女");
		this.table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(this.sexList));
	
		JScrollPane scr = new JScrollPane(this.table);
		JPanel toolBar = new JPanel();
		
		frame.add(toolBar,BorderLayout.NORTH);
		frame.add(scr,BorderLayout.CENTER);
		frame.setSize(350,90);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(1);
			}
		});
	}
}

public class JTableDemo02
{

	public static void main(String[] args)
	{
	
	new TableColumnModelDemo();
	}

}
