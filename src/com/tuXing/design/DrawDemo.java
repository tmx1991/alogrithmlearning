package com.tuXing.design;

import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DrawDemo extends Applet
{

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		int width = 401;
		int height = 401;
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		g2d = image.createGraphics();
		image = g2d.getDeviceConfiguration().createCompatibleImage(width,
				height, Transparency.TRANSLUCENT);//TRANSLUCENT
		
		g2d.dispose();
		g2d = image.createGraphics();
		g2d.setBackground(Color.blue);
		g2d.setColor(Color.GREEN);
		g2d.setStroke(new BasicStroke(0.0f,1,1,1f));
		
//		g2d.fillOval(180, 150,40,60);
//		g2d.fillArc(140, 208,120,50, 0, 180);
//		g2d.drawLine(0,0,400,400);
//		g2d.drawLine(0,400,400,0);
//		g2d.setColor(Color.red);
//		g2d.draw3DRect(50, 50, 300, 300, true);
//		g2d.draw3DRect(0, 0, 100, 100, true);
//		g2d.draw3DRect(0, 299, 100, 100, true);
//		g2d.draw3DRect(299, 0, 100, 100, true);
//		g2d.draw3DRect(299,299, 100, 100, true);
//		g2d.setColor(Color.orange);
//		g2d.drawOval(100, 100,200,200);
//		g2d.draw3DRect(0, 0,400,400,true);
		int x=45;
		int y=10;
		int c=250;
		int k=200;
		int p=50;
		g2d.drawLine(x,y,x+p,y+c);
		g2d.drawLine(x+p,y+c,x+k,y+c);
		g2d.drawLine(x,y,x+k,y+c);
		//g2d.drawLine(x+p,y,x+k,y+c);
		g2d.drawLine(x+p,y+c,x+k/2,y+c-c/2);
		
		g2d.drawLine(x+k/2,y+c-c/2,x+k/2+k-p,y+c-c/2);
		g2d.drawLine(x+k/2+k-p,y+c-c/2,x+k/2+k,y+c-c/2+c);
		g2d.drawLine(x+k/2,y+c-c/2,x+k/2+k,y+c-c/2+c);
		
		g2d.drawLine(x+k,y+c,x+k/2+k-p,y+c-c/2);
		
		try
		{
			ImageIO.write(image, "png", new File("D:/test.png"));
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}