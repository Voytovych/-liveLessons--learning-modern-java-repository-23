package coreservlets;

import javax.swing.*;

public class ColorFrame6 extends JFrame {
  public ColorFrame6() {
    super("MouseMotionListener");
    setContentPane(new ColorPanel6());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame6();
  }
}
