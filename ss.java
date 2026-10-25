package karthick;

import javax.swing.*; //C:\\Users\\ganes\\OneDrive\\Desktop\\background.jpeg

public class ss {
	public void dashboard(){
		JFrame f = new JFrame("Login");
        ImageIcon img = new ImageIcon("C:\\Users\\ganes\\OneDrive\\background.jpeg");
        f.setContentPane(new JLabel(img));
        f.setLayout(null);
        f.setSize(1000,800);
        f.setVisible(true);
        
	}
	public static void main(String[] args) {
		
	}

}
