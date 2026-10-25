package karthick;


import java.awt.FlowLayout;

import javax.swing.*;


public class FL{
	public static void main(String[] args) {
		JFrame f= new JFrame("HELLO");
		JLabel l1 = new JLabel("karthick");
		f.add(l1);
		JLabel l2 = new JLabel("prasanna");
		f.add(l2);
		JLabel l3 = new JLabel("umesh");
		f.add(l3);
		JLabel l4 = new JLabel("Melvin");
		f.add(l4);
		f.setLayout(new FlowLayout());
		f.setSize(1000,800);
		f.setVisible(true);
		
		
		
}

}
