package karthick;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Jpanel{
	public static void main(String[] args) {
		JFrame f= new JFrame("Multi Layout");
		JPanel toppanel= new JPanel();
		JLabel l1 = new JLabel ("Login Page");
		l1.setForeground(Color.green);
		l1.setFont(new Font("Arial",Font.BOLD,20));
		toppanel.add(l1);
		toppanel.setLayout(new FlowLayout());
		
		JPanel midpanel=new JPanel();
		JButton b1 = new JButton("Swiggy");
		midpanel.add(b1);
		JButton b2 = new JButton("Zomato");
		midpanel.add(b2);
		JButton b3 = new JButton("Flipkart");
		midpanel.add(b3);
		JButton b4 = new JButton("Amazon");
		midpanel.add(b4);
		midpanel.setLayout(new GridLayout(2,2));
		
		JPanel bottompanel = new JPanel();
		bottompanel.setLayout(new BoxLayout(bottompanel,BoxLayout.X_AXIS));
		JButton f1 = new JButton("Search");
		bottompanel.add(f1);
		JButton f2 = new JButton("Window");
		bottompanel.add(f2);
		JButton f3 = new JButton("Chrome");
		bottompanel.add(f3);
		JButton f4 = new JButton("Copilot");
		bottompanel.add(f4);
		f.setLayout(new BorderLayout());
		f.add(toppanel, BorderLayout.NORTH);
		f.add(midpanel, BorderLayout.CENTER);
		f.add(bottompanel, BorderLayout.SOUTH);
		
		f.setSize(1000,800);
		f.setVisible(true);
		
		
		
}

}
