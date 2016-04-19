package com.tuXing;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwing
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Hello Swing");
		final JLabel label = new JLabel("A Label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		TimeUnit.SECONDS.sleep(1);
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				label.setText("Hey! this is different!");
			}
			
		});

	}

}
