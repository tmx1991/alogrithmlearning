package com.tuXing;

import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;




class ChangeTable1 implements ActionListener
{
	private JFrame frame = new JFrame("APP发送管理");
	private JTable table = null;
	private DefaultTableModel tableModel = null;
	String[] titles = { "发送状态", "注册ID" };

	Object[][] userInfo = { { "yes", "tt" }, { "yes", "tt1" },
			{ "yes", "tt2" }, { "yes", "tt3" },

	};
	public JButton allSelectBtn = new JButton("全选择");
	public JButton allDeleteBtn = new JButton("全取消 ");
	public JButton addRowBtn = new JButton("增加行 ");
	public JButton removeRowBtn = new JButton("删除行 ");
	// public Checkbox checkAll = new Checkbox("seclect all");
	private JComboBox sexList = new JComboBox();
	public ChangeTable1(){
		this.tableModel=new DefaultTableModel(this.userInfo,this.titles);
		this.table = new JTable(this.tableModel);
		this.sexList.addItem("yes");
		this.sexList.addItem("no");
		this.table.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(this.sexList));
	
		JScrollPane scr = new JScrollPane(this.table);
		JPanel toolBar = new JPanel();
		toolBar.add(this.allSelectBtn);
		toolBar.add(this.allDeleteBtn);
		toolBar.add(this.addRowBtn);
		toolBar.add(this.removeRowBtn);
//		toolBar.add(this.checkAll);
		
		
		frame.add(toolBar,BorderLayout.NORTH);
		frame.add(scr,BorderLayout.CENTER);
		frame.setSize(500,600);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(1);
			}
		});
		
		this.addRowBtn.addActionListener(this);
		this.allSelectBtn.addActionListener(this);
		this.allDeleteBtn.addActionListener(this);
		this.removeRowBtn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
 
		if(e.getSource() == this.allSelectBtn)
		{
			for(int i = 0; i < this.tableModel.getRowCount(); i++)
				this.tableModel.setValueAt("yes", i, 0);
		}
		if(e.getSource() == this.allDeleteBtn)
		{
			for(int i = 0; i < this.tableModel.getRowCount(); i++)
				this.tableModel.setValueAt("no", i, 0);
		}

		if(e.getSource()==this.addRowBtn)
		{ 
			this.tableModel.addRow(new Object[]{"yes",null});
		}
	
		if(e.getSource() == this.removeRowBtn)
		{
			int[] selected = table.getSelectedRows();
			// 依次删除所有选中行
			for(int i = selected.length - 1; i >= 0; i--)
			{
				this.tableModel.removeRow(selected[i]);
			}
		}
	}
}

public class biaoge
{

	public static void main(String[] args)
	{
	
	new ChangeTable1();
	}

}

