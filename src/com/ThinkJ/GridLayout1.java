package com.ThinkJ;
import javax.swing.*;
import static com.ThinkJ.SwingConsole.*; 
import java.awt.*;
 
public class GridLayout1 extends JFrame {
  public GridLayout1() {
    setLayout(new GridLayout(7,3));
    for(int i = 0; i < 20; i++)
      add(new JButton("Button " + i));
  }
  public static void main(String[] args) {
    run(new GridLayout1(), 300, 300);
  }
} ///:~
