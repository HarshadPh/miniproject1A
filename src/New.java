import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;


public class New extends JFrame {
	String date,slot,ssl;
	int visitor=15,A;
	
	


	public New() {
		JFrame f= new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setTitle("Wildlife Tourism :PenchInfo page");
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setForeground(new Color(0, 0, 0));
	panel.setBackground(new Color(0, 0, 0));
	panel.setBounds(0, 0, 1546, 793);
	f.getContentPane().add(panel);
	panel.setLayout(null);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBounds(23, 54, 748, 708);
	panel_1.setBackground(new Color(70, 130, 180));
	panel.add(panel_1);
	panel_1.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Date of safari");
	lblNewLabel.setBounds(43, 82, 143, 31);
	panel_1.add(lblNewLabel);
	lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
	
	JDateChooser dateChooser = new JDateChooser();
	dateChooser.setBounds(215, 82, 136, 31);
	panel_1.add(dateChooser);
	
	JButton btnNewButton = new JButton("check");
	btnNewButton.setBounds(215, 227, 182, 60);
	panel_1.add(btnNewButton);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				int B=0;
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","100480abc");
				
				String sql= "insert into new_table(safari_date,slot) values(?,?)";
			PreparedStatement st=c.prepareStatement(sql);
				SimpleDateFormat v= new SimpleDateFormat("yyyy-MM-dd");
				date=v.format(dateChooser.getDate());
				String ssl=" SELECT sum(visitors_count) FROM slot  WHERE safari_slot='"+slot+"' AND safari_date='"+date+"'";
	
				
				
					PreparedStatement sb=c.prepareStatement(ssl);
					
					ResultSet rs= sb.executeQuery();
					if(rs.next()) {
						String sum =rs.getString("sum(visitors_count)");
						String ss=sum;
						if(ss== null) {
						JOptionPane.showMessageDialog(null, " shift is empty !!! " +" slots remaining  "+ visitor );
						}
						 B=Integer.parseInt(sum);
						 int A=visitor-B;
						 if(A>=0) {
						 JOptionPane.showMessageDialog(null, " slots remaining   "+A);
						 }
						 
//						txt.setText(sum);
					}
					else {
					if(B==0) {
						JOptionPane.showMessageDialog(null, "   slots remaining  "+ 15);
					}
					}
					
					
					int i=st.executeUpdate();
					if(i!=0) {						
												JOptionPane.showMessageDialog(null,"record saved successfully");
					}
			}
			
						
						
//					
//					
//				}

//				
//				
//					
//					
//				
//					
//				
//				
//			}
			catch(Exception e1) 
			{System.out.println(e1);} 	
			
	
	
		}
		
	});
	btnNewButton.setFont(new Font("Arial", Font.BOLD, 28));
	
	JLabel lblNewLabel_1 = new JLabel("Shift");
	lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
	lblNewLabel_1.setBounds(120, 160, 66, 31);
	panel_1.add(lblNewLabel_1);
	
	JRadioButton rb1 = new JRadioButton("Morning");
	rb1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			slot="morning";
			
		}
	});
	rb1.setFont(new Font("Arial", Font.BOLD, 18));
	rb1.setBounds(215, 160, 127, 21);
	panel_1.add(rb1);
	
	JRadioButton rb2 = new JRadioButton("Afternoon");
	rb2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			slot="afternoon";
		}
		
	});
	rb2.setFont(new Font("Arial", Font.BOLD, 18));
	rb2.setBounds(383, 160, 115, 21);
	panel_1.add(rb2);
ButtonGroup bg2=new ButtonGroup();
	
	bg2.add(rb1);
	bg2.add(rb2);
	
	JButton btnNewButton_1 = new JButton("BOOK NOW");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				int B=0;
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","100480abc");
				//Statement stmt=c.createStatement();
				String sql= "insert into new_table(safari_date,slot) values(?,?)";
			PreparedStatement st=c.prepareStatement(sql);
				SimpleDateFormat v= new SimpleDateFormat("yyyy-MM-dd");
				date=v.format(dateChooser.getDate());
				String ssl=" SELECT sum(visitors_count) FROM slot  WHERE safari_slot='"+slot+"' AND safari_date='"+date+"'";
	
		//	st.setString(1, date);
	//st.setString(2, slot);
				
				
					PreparedStatement sb=c.prepareStatement(ssl);
					
					ResultSet rs= sb.executeQuery();
					if(rs.next()) {
						String sum =rs.getString("sum(visitors_count)");
						String ss=sum;
						if(ss== null) {
							JOptionPane.showMessageDialog(null, " You can only book maximum   "+ visitor +" entries");
							 new BookingB();
								f.setVisible(false);
						}
						 B=Integer.parseInt(sum);
						 int A=visitor-B;
						 if(A>0 ) {
							 JOptionPane.showMessageDialog(null, " You can only book maximum   "+ A +" entries");
							 new BookingB();
								f.setVisible(false);
						 
						 }
						 if(A==0 ) {
							 JOptionPane.showMessageDialog(null, " choose different date / shift");
							 
						 }
					}
			}
						 
//						txt.setText(sum);
					
					
					
					
					
						
						
//					
//					
//				}

//				
//				
//					
//					
//				
//					
//				
//				
//			}
			catch(Exception e1) 
			{System.out.println(e1);} 	
			
	
	
		
//			
			
		}
	});
	btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 16));
	btnNewButton_1.setBounds(458, 227, 182, 60);
	panel_1.add(btnNewButton_1);
	
	JLabel lblNewLabel_2 = new JLabel("Testing Page");
	lblNewLabel_2.setForeground(new Color(245, 255, 250));
	lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 29));
	lblNewLabel_2.setBounds(622, 10, 216, 34);
	panel.add(lblNewLabel_2);
	JMenuBar mb= new JMenuBar();
	mb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	mb.setBackground(new Color(135, 206, 235));
	f.setJMenuBar(mb);
	JMenu Menu=new JMenu("Back");
	Menu.addMenuListener(new MenuListener() {
		public void menuCanceled(MenuEvent e) {
		}
		public void menuDeselected(MenuEvent e) {
		}
		public void menuSelected(MenuEvent e) {
			new HomeA();
			f.setVisible(false);
		}
	});
	
		
	
	f.setVisible(true);
	mb.add(Menu);
	

	
	}
	public static void main(String[] args) {
		new New();
	}
}
