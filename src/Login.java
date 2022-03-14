import javax.swing.JFrame;

import javax.swing.JScrollBar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JPasswordField;
public class Login {

	/**
	 * @wbp.nonvisual location=601,-36
	 */
	private final JScrollBar scrollBar = new JScrollBar();
	private JTextField username;
	private JPasswordField passwordField;
	
Login(){
			JFrame f= new JFrame();
			f.setBackground(new Color(0, 0, 0));
			f.setTitle("Wildlife Tourism : Login page");
			f.getContentPane().setBackground(Color.BLACK);
		 f.setBounds(100,100,1550,830);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(710, 142, 826, 705);
		panel_1.setBackground(Color.BLACK);
		f.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username : ");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(241, 183, 155, 31);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 25));
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","?Har@2022");
					Statement stmt=c.createStatement();
					String sql= "select * from login2 where username='"+username.getText().trim()+"' and password='"+passwordField.getText().toString().trim()+"'";
					ResultSet rs= stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null,"login successfully...");
						new HomeA();
						f.setVisible(false);
					
				            
					}
					else
						JOptionPane.showMessageDialog(null,"Incorrect username and password...");
					c.close();
					
				}catch(Exception e1) 
				{System.out.println(e1);} 	
				
			}
		});
		btnNewButton.setBounds(317, 340, 176, 32);
		btnNewButton.setForeground(new Color(0, 0, 0)); 
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
		panel_1.add(btnNewButton);
		
		username = new JTextField();
		username.setBounds(406, 183, 147, 31);
		panel_1.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setBounds(261, 273, 135, 21);
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 25));
		lblNewLabel_2.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Don't have an account? ");
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(269, 590, 193, 21);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Sign up");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				f.setVisible(false);
				new signup();
				
			}
		});
		lblNewLabel_6.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_6.setForeground(new Color(255, 255, 0));
		lblNewLabel_6.setBounds(461, 585, 84, 31);
		panel_1.add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(406, 272, 147, 31);
		panel_1.add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 142, 711, 651);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 22, 711, 707);
		panel.add(lblNewLabel_1);
		ImageIcon img=new ImageIcon(this.getClass().getResource("21 (2).png"));
		lblNewLabel_1.setIcon(img);
		//lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\21 (2).png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 0, 1536, 144);
		f.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Log In to the world of Wild");
		lblNewLabel_3.setBounds(653, 75, 437, 59);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 30));
		lblNewLabel_3.setForeground(new Color(255, 255, 204));
		
		JLabel lblNewLabel_4 = new JLabel(" Explore WildLife Tourism");
		lblNewLabel_4.setBounds(448, 10, 576, 68);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 43));
		lblNewLabel_4.setForeground(Color.YELLOW);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Login();
	}
}

