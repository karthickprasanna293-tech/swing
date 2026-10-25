package karthick;
import java.awt.GridLayout;

import javax.swing.*;

public class BL{
	public static void main(String[] args) {
		JFrame f= new JFrame("HELLO");
		JPanel p= new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.X_AXIS));
		JButton b1 = new JButton("Swiggy");
		p.add(b1);
		JButton b2 = new JButton("Zomato");
		p.add(b2);
		JButton b3 = new JButton("Flipkart");
		p.add(b3);
		JButton b4 = new JButton("Amazon");
		p.add(b4);
		f.add(p);
		f.setSize(1000,800);
		f.setVisible(true);
		
		
		
}

}
