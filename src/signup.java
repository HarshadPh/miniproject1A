import java.awt.BorderLayout;
import java.sql.*;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class signup  {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	signup(){
		JFrame f= new JFrame();
		f.setTitle("Wildlife Tourism : signup page");
		f.getContentPane().setBackground(Color.BLACK);
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	
	JPanel panel_2 = new JPanel();
	panel_2.setBackground(Color.BLACK);
	panel_2.setBounds(0, 0, 1536, 144);
	f.getContentPane().add(panel_2);
	panel_2.setLayout(null);
	
	JLabel lblNewLabel_4 = new JLabel(" Explore WildLife Tourism");
	lblNewLabel_4.setForeground(Color.YELLOW);
	lblNewLabel_4.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 43));
	lblNewLabel_4.setBounds(446, 10, 576, 68);
	panel_2.add(lblNewLabel_4);
	
	JLabel lblNewLabel_1 = new JLabel("Welcome to Elegant Depths Of Wilderness");
	lblNewLabel_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 25));
	lblNewLabel_1.setForeground(new Color(255, 255, 204));
	lblNewLabel_1.setBounds(649, 88, 546, 42);
	panel_2.add(lblNewLabel_1);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBounds(710, 142, 826, 705);
	f.getContentPane().add(panel_1);
	panel_1.setBackground(Color.BLACK);
	panel_1.setLayout(null);
	
	JLabel lblNewLabel_2 = new JLabel("Username :");
	lblNewLabel_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
	lblNewLabel_2.setForeground(Color.WHITE);
	lblNewLabel_2.setBounds(209, 90, 115, 29);
	panel_1.add(lblNewLabel_2);
	
	JTextField textField = new JTextField();
	textField.setBounds(380, 90, 170, 35);
	panel_1.add(textField);
	textField.setColumns(10);
	
	JTextField textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(380, 158, 170, 35);
	panel_1.add(textField_1);
	
	JLabel lblNewLabel_2_1 = new JLabel("Email :");
	lblNewLabel_2_1.setForeground(Color.WHITE);
	lblNewLabel_2_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
	lblNewLabel_2_1.setBounds(209, 158, 115, 29);
	panel_1.add(lblNewLabel_2_1);
	
	JLabel lblNewLabel_2_2 = new JLabel("Phone Number :");
	lblNewLabel_2_2.setForeground(Color.WHITE);
	lblNewLabel_2_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
	lblNewLabel_2_2.setBounds(209, 230, 152, 29);
	panel_1.add(lblNewLabel_2_2);
	
	JLabel lblNewLabel_2_3 = new JLabel("Password :");
	lblNewLabel_2_3.setForeground(Color.WHITE);
	lblNewLabel_2_3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
	lblNewLabel_2_3.setBounds(209, 316, 115, 29);
	panel_1.add(lblNewLabel_2_3);
	
	JTextField textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(380, 230, 170, 35);
	panel_1.add(textField_2);
	
	JButton btnNewButton = new JButton("Sign up");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","100480abc");
				Statement stmt=c.createStatement();
				String sql= "insert into login2 values(?,?,?,?)";
				PreparedStatement st=c.prepareStatement(sql);
				st.setString(1, textField.getText().trim());
				st.setString(2, textField_1.getText().trim());
				st.setString(3, textField_2.getText().trim());
				st.setString(4, passwordField.getText().toString().trim());
				
				
				int i=st.executeUpdate();
				if(i>0) {
					JOptionPane.showMessageDialog(null,"record saved successfully");
					new Login();
					f.setVisible(false);
				}
				else {
				JOptionPane.showMessageDialog(null,"try again");
				}
					
				
			}catch(Exception e1) 
			{System.out.println(e1);} 	
			
		}
		
	});
	

	btnNewButton.setBackground(new Color(255, 255, 0));
	btnNewButton.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
	btnNewButton.setBounds(308, 388, 145, 35);
	panel_1.add(btnNewButton);
	
	JLabel lblNewLabel_5 = new JLabel("Already have an account? ");
	lblNewLabel_5.setForeground(Color.WHITE);
	lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
	lblNewLabel_5.setBounds(256, 602, 216, 21);
	panel_1.add(lblNewLabel_5);
	
	JLabel lblNewLabel_6 = new JLabel("Log in");
	lblNewLabel_6.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			f.setVisible(false);
			new Login();
		}
	});
	lblNewLabel_6.setForeground(Color.YELLOW);
	lblNewLabel_6.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
	lblNewLabel_6.setBounds(466, 597, 84, 31);
	panel_1.add(lblNewLabel_6);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(380, 303, 170, 42);
	panel_1.add(passwordField);
	
	JPanel panel = new JPanel();
	panel.setBounds(0, 142, 711, 651);
	f.getContentPane().add(panel);
	panel.setBackground(Color.BLACK);
	panel.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setBounds(0, 0, 711, 651);
	panel.add(lblNewLabel);
	ImageIcon img=new ImageIcon(this.getClass().getResource("21 (2).png"));
	lblNewLabel.setIcon(img);
	//lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\vedang mule\\\\eclipse-workspace\\\\Tourism\\\\img\\\\21 (2).png"));
	f.setVisible(true);
	}

	
	public static void main(String[] args) {
		new signup();
		
	}
}
