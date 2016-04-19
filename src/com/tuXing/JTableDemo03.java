package com.tuXing;

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




class ChangeTable implements ActionListener{
	private JFrame frame = new JFrame("welcome");
	private JTable table = null;
	private DefaultTableModel tableModel = null;
	String[] titles = { "姓名", "年龄", "性别", "数学成绩", "英语成绩", "总分", "是否及格" };

	Object[][] userInfo = { { "tt", 20, "nan", 89, 87, 88, true },
			{ "ss", 24, "nan", 89, 87, 88, false } };
	
	public JButton addRowBtn = new JButton("增加行 ");
	public JButton removeRowBtn = new JButton("删除行 ");
	public JButton addColBtn = new JButton("增加列 ");
	public JButton removeColBtn = new JButton("删除列 ");
	
	
	
//	private JComboBox sexList = new JComboBox();
	public ChangeTable(){
		this.tableModel=new DefaultTableModel(this.userInfo,this.titles);
		this.table = new JTable(this.tableModel);
//		this.sexList.addItem("男");
//		this.sexList.addItem("女");
//		this.table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(this.sexList));
	
		JScrollPane scr = new JScrollPane(this.table);
		JPanel toolBar = new JPanel();
		toolBar.add(this.addColBtn);
		toolBar.add(this.addRowBtn);
		toolBar.add(this.removeColBtn);
		toolBar.add(this.removeRowBtn);
		
		
		frame.add(toolBar,BorderLayout.NORTH);
		frame.add(scr,BorderLayout.CENTER);
		frame.setSize(350,180);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(1);
			}
		});
		
		this.addRowBtn.addActionListener(this);
		this.addColBtn.addActionListener(this);
		this.removeColBtn.addActionListener(this);
		this.removeRowBtn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==this.addColBtn)
		{
			this.tableModel.addColumn("新增列");
		}
		if(e.getSource()==this.addRowBtn)
		{
			this.tableModel.addRow(new Object[]{});
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

public class JTableDemo03
{

	public static void main(String[] args)
	{

		new ChangeTable();
	}

}
