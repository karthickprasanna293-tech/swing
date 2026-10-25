package karthick;
import java.awt.GridLayout;

import javax.swing.*;


public class GL{
	public static void main(String[] args) {
		JFrame f= new JFrame("HELLO");
		JButton b1 = new JButton("Swiggy");
		f.add(b1);
		JButton b2 = new JButton("Zomato");
		f.add(b2);
		JButton b3 = new JButton("Flipkart");
		f.add(b3);
		JButton b4 = new JButton("Amazon");
		f.add(b4);
		f.setLayout(new GridLayout());
		f.setSize(1000,800);
		f.setVisible(true);
		
		
		
}

}
