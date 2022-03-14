

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class HomeB  {
	HomeB(){
		JFrame f= new JFrame();
		f.setTitle("Wildlife Tourism : Login page");
		f.getContentPane().setBackground(new Color(0, 0, 0));
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setBounds(10, 10, 1516, 346);
	f.getContentPane().add(panel);
	
	JLabel lblNewLabel = new JLabel("New label");
	lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\alaska-wildlife-photography-012-moose-in-pond-denali-national-park.jpg"));
	panel.add(lblNewLabel);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(UIManager.getBorder("DesktopIcon.border"));
	panel_1.setBackground(new Color(0, 0, 0));
	panel_1.setBounds(577, 366, 383, 69);
	f.getContentPane().add(panel_1);
	
	JButton btnNewButton = new JButton("Explore");
	btnNewButton.setForeground(new Color(0, 255, 255));
	btnNewButton.setBackground(new Color(0, 0, 0));
	btnNewButton.setFont(new Font("French Script MT", Font.BOLD, 32));
	panel_1.add(btnNewButton);
	
	JPanel panel_1_1 = new JPanel();
	panel_1_1.setBorder(UIManager.getBorder("DesktopIcon.border"));
	panel_1_1.setBackground(Color.BLACK);
	panel_1_1.setBounds(577, 468, 383, 69);
	f.getContentPane().add(panel_1_1);
	
	JButton btnBooking = new JButton("Booking\r\n");
	btnBooking.setForeground(new Color(0, 255, 255));
	btnBooking.setBackground(new Color(0, 0, 0));
	btnBooking.setFont(new Font("French Script MT", Font.BOLD, 32));
	panel_1_1.add(btnBooking);
	
	JPanel panel_1_2 = new JPanel();
	panel_1_2.setBorder(UIManager.getBorder("DesktopIcon.border"));
	panel_1_2.setBackground(Color.BLACK);
	panel_1_2.setBounds(577, 563, 383, 69);
	f.getContentPane().add(panel_1_2);
	
	JButton btnNewButton_2 = new JButton("New button");
	btnNewButton_2.setForeground(new Color(0, 255, 255));
	btnNewButton_2.setBackground(new Color(0, 0, 0));
	btnNewButton_2.setFont(new Font("French Script MT", Font.BOLD, 32));
	panel_1_2.add(btnNewButton_2);
	
	JPanel panel_1_3 = new JPanel();
	panel_1_3.setBorder(UIManager.getBorder("DesktopIcon.border"));
	panel_1_3.setBackground(Color.BLACK);
	panel_1_3.setBounds(577, 656, 383, 69);
	f.getContentPane().add(panel_1_3);
	
	JButton btnLogOut = new JButton("Log Out");
	btnLogOut.setForeground(new Color(0, 255, 255));
	btnLogOut.setBackground(new Color(0, 0, 0));
	btnLogOut.setFont(new Font("French Script MT", Font.BOLD, 32));
	panel_1_3.add(btnLogOut);
	f.setVisible(true);
	
	
	
	}

	
	public static void main(String[] args) {
		new HomeB();
	}

}