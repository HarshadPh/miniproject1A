import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Book extends JFrame {
	Book(){
		setBackground(Color.LIGHT_GRAY);
		JFrame f= new JFrame();
		f.setBackground(new Color(0, 0, 0));
		
		
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	f.setVisible(true);	
		
		
	}
	public static void main(String[] args) {
	new Book();	
	}

	
}