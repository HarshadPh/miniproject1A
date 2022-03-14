

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;

public class HomeA  {
	private JTextPane txtpnTheStateIs = new JTextPane();
	HomeA(){
		JFrame f= new JFrame();
		f.setTitle("Wildlife Tourism : Home page");
		f.getContentPane().setBackground(new Color(0, 0, 0));
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	
	
	JLabel lblNewLabel_1 = new JLabel("Welcome to");
	lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
	lblNewLabel_1.setForeground(new Color(255, 215, 0));
	lblNewLabel_1.setBackground(new Color(255, 99, 71));
	lblNewLabel_1.setBounds(636, 28, 254, 40);
	f.getContentPane().add(lblNewLabel_1);
	
	JLabel lblNewLabel_1_1 = new JLabel("Maharashtra's Wildlife Tourism");
	lblNewLabel_1_1.setForeground(new Color(255, 215, 0));
	lblNewLabel_1_1.setFont(new Font("Algerian", Font.BOLD, 45));
	lblNewLabel_1_1.setBackground(new Color(139, 0, 0));
	lblNewLabel_1_1.setBounds(332, 78, 848, 71);
	f.getContentPane().add(lblNewLabel_1_1);
	
	JLabel lblNewLabel = new JLabel(" For any query phone_no=022- 61316406 & Email ID:- mahaecotourism.support@mahait.org &  Toll-1926");
	lblNewLabel.setBackground(new Color(205, 92, 92));
	lblNewLabel.setForeground(new Color(143, 188, 143));
	lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
	lblNewLabel.setBounds(0, 731, 1536, 40);
	f.getContentPane().add(lblNewLabel);
	
	JLabel lblNewLabel_2 = new JLabel("");
	ImageIcon img= new ImageIcon(this.getClass().getResource("Home.jpg"));
	lblNewLabel_2.setIcon(img);	
	//lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\Home.jpg"));
	lblNewLabel_2.setBounds(358, 146, 735, 338);
	f.getContentPane().add(lblNewLabel_2);
	
	JTextPane txtpnTheStateIs = new JTextPane();
	txtpnTheStateIs.setForeground(new Color(255, 215, 0));
	txtpnTheStateIs.setBackground(new Color(0, 0, 0));
	txtpnTheStateIs.setFont(new Font("Arial", Font.PLAIN, 25));
	txtpnTheStateIs.setText(" The state is rich in its flora and fauna count, and that's why it is home to some of the largest  eco\r\n hotspots, wildlife sanctuaries, national parks and bird sanctuaries, which have been attracting nature lovers and wildlife aficionados from the different corners of India and abroad.");
	txtpnTheStateIs.setBounds(201, 549, 1188, 109);
	f.getContentPane().add(txtpnTheStateIs);
	txtpnTheStateIs.setEditable(false);
	
	JMenuBar mb= new JMenuBar();
	mb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	mb.setBackground(new Color(135, 206, 235));
	f.setJMenuBar(mb);
	JMenu Menu=new JMenu("HOME");
	Menu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	JMenu Menu1=new JMenu("Explore");
	Menu1.addMenuListener(new MenuListener() {
		public void menuCanceled(MenuEvent e) {
		}
		public void menuDeselected(MenuEvent e) {
		}
		public void menuSelected(MenuEvent e) {
			new info_page();
			 f.setVisible(false);

		}
	});
	
	JMenu Menu2=new JMenu("Booking");
	Menu2.addMenuListener(new MenuListener() {
		public void menuCanceled(MenuEvent e) {
		}
		public void menuDeselected(MenuEvent e) {
		}
		public void menuSelected(MenuEvent e) {
			new Booking();
			f.setVisible(false);
		}
	});

	JMenu Menu3=new JMenu("Feedback");
	Menu3.addMenuListener(new MenuListener() {
		public void menuCanceled(MenuEvent e) {
		}
		public void menuDeselected(MenuEvent e) {
		}
		public void menuSelected(MenuEvent e) {
			new FeedbackPage();
			f.setVisible(false);
		}
	});
	JMenu Menu4=new JMenu("log out");
	Menu4.addMenuListener(new MenuListener() {
		public void menuCanceled(MenuEvent e) {
		}
		public void menuDeselected(MenuEvent e) {
		}
		public void menuSelected(MenuEvent e) {
			new Login();
			f.setVisible(false);
		}
	});
	
	mb.add(Menu);
	mb.add(Menu1);
	mb.add(Menu2);
	mb.add(Menu3);
	mb.add(Menu4);
	
	

	f.setVisible(true);	
	
	}

	
	public static void main(String[] args) {
		new HomeA();
	}
}
