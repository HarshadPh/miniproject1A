import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class FeedbackPage extends JFrame {
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private String facility;
	private String staff;
	private String dificulty;
	private String booking;
	private String cancellation;
	
	public FeedbackPage() {
		
		
		
		JFrame f=new JFrame();
		
		f.setTitle("feedback-page ");
		
	 f.setBounds(100,100,1500,900);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setBackground(new Color(135, 206, 250));
	f.getContentPane().setLayout(null);

	
	
	JPanel panel = new JPanel();
	panel.setBackground(new Color(32, 178, 170));
	panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(32, 178, 170), new Color(32, 178, 170), new Color(32, 178, 170), new Color(32, 178, 170)));
	panel.setBounds(80, 75, 378, 530);
	f.getContentPane().add(panel);
	panel.setLayout(null);
	panel.setAutoscrolls(true);
	
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("YES");
	rdbtnNewRadioButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			staff="yes";
		}
	});
	rdbtnNewRadioButton.setBounds(33, 209, 61, 21);
	panel.add(rdbtnNewRadioButton);
	
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("NO");
	rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			staff="no";
		}
	});
	rdbtnNewRadioButton_1.setBounds(34, 243, 61, 21);
	panel.add(rdbtnNewRadioButton_1);
	
	
	
	ButtonGroup bg=new ButtonGroup();
	
	bg.add(rdbtnNewRadioButton);
	bg.add(rdbtnNewRadioButton_1);
	
	JLabel lblNewLabel = new JLabel("Did you face any difficulty ?");
	lblNewLabel.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	lblNewLabel.setBounds(10, 289, 358, 32);
	panel.add(lblNewLabel);
	
	JLabel lblFeedback_1 = new JLabel("Accomodation");
	lblFeedback_1.setHorizontalAlignment(SwingConstants.CENTER);
	lblFeedback_1.setFont(new Font("Edwardian Script ITC", Font.BOLD, 33));
	lblFeedback_1.setBounds(10, 10, 358, 32);
	panel.add(lblFeedback_1);
	
	JLabel lblHo = new JLabel("DId you get proper service and Facilities mentioned ?");
	lblHo.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	lblHo.setBounds(10, 60, 358, 32);
	panel.add(lblHo);
	
	JLabel lblIsStaffWas = new JLabel("Is staff was decent ?");
	lblIsStaffWas.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	lblIsStaffWas.setBounds(10, 167, 358, 32);
	panel.add(lblIsStaffWas);
	
	JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("NO");
	rdbtnNewRadioButton_1_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			facility="no";
		}
	});
	rdbtnNewRadioButton_1_3.setBounds(34, 125, 61, 21);
	panel.add(rdbtnNewRadioButton_1_3);
	
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("YES");
	
	rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			facility="yes";
			
		}
	});

	rdbtnNewRadioButton_2.setBounds(33, 98, 61, 21);
	panel.add(rdbtnNewRadioButton_2);
	
	
    ButtonGroup bg2=new ButtonGroup();
	
	bg2.add(rdbtnNewRadioButton_2);
	bg2.add(rdbtnNewRadioButton_1_3);
	
	JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("NO");
	rdbtnNewRadioButton_1_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dificulty="no";
		}
	});
	rdbtnNewRadioButton_1_4.setBounds(33, 371, 61, 21);
	panel.add(rdbtnNewRadioButton_1_4);
	
	JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("YES");
	rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dificulty="yes";
		}
	});
	rdbtnNewRadioButton_5.setBounds(32, 337, 61, 21);
	panel.add(rdbtnNewRadioButton_5);
	
   ButtonGroup bg3=new ButtonGroup();
	
	bg3.add(rdbtnNewRadioButton_1_4);
	bg3.add(rdbtnNewRadioButton_5);
	
	JTextField textField = new JTextField();
	textField.setBounds(10, 440, 358, 80);
	panel.add(textField);
	textField.setColumns(10);
	
	JLabel lblDescribeYourExperience = new JLabel("Describe Your Experience:");
	lblDescribeYourExperience.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	lblDescribeYourExperience.setBounds(10, 398, 358, 32);
	panel.add(lblDescribeYourExperience);
	
	JPanel panel_1 = new JPanel();
	panel_1.setToolTipText("                     ");
	panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(32, 178, 170), new Color(32, 178, 170), new Color(32, 178, 170), new Color(32, 178, 170)));
	panel_1.setBackground(new Color(32, 178, 170));
	panel_1.setAutoscrolls(true);
	panel_1.setAlignmentX(1.0f);
	panel_1.setBounds(591, 75, 378, 530);
	f.getContentPane().add(panel_1);
	panel_1.setLayout(null);
	
	JLabel lblFeedback_1_1 = new JLabel("Ride");
	lblFeedback_1_1.setBounds(10, 10, 358, 32);
	lblFeedback_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	lblFeedback_1_1.setFont(new Font("Edwardian Script ITC", Font.BOLD, 33));
	panel_1.add(lblFeedback_1_1);
	
	JLabel lblHowDidYou = new JLabel("How did you rate following ? (Rating/5)");
	lblHowDidYou.setBounds(10, 64, 358, 32);
	lblHowDidYou.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	panel_1.add(lblHowDidYou);
	
	JLabel lblGuide = new JLabel("Guide :");
	lblGuide.setBounds(0, 124, 368, 32);
	lblGuide.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	panel_1.add(lblGuide);
	
	JLabel lblSancturies = new JLabel("Sanctury :");
	lblSancturies.setBounds(0, 215, 368, 32);
	lblSancturies.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	panel_1.add(lblSancturies);
	
	JLabel lblTransportation = new JLabel("Transportation:");
	lblTransportation.setBounds(10, 298, 358, 32);
	lblTransportation.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	panel_1.add(lblTransportation);
	
	JLabel lblAnyQuerysuggestion = new JLabel("Any query/Suggestion :");
	lblAnyQuerysuggestion.setBounds(10, 395, 358, 32);
	lblAnyQuerysuggestion.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	panel_1.add(lblAnyQuerysuggestion);
	
	JTextField textField_1 = new JTextField();
	textField_1.setBounds(10, 437, 358, 80);
	textField_1.setColumns(10);
	panel_1.add(textField_1);
	
	textField_6 = new JTextField();
	textField_6.setBounds(80, 132, 96, 19);
	panel_1.add(textField_6);
	textField_6.setColumns(10);
	
	textField_7 = new JTextField();
	textField_7.setBounds(93, 223, 96, 19);
	panel_1.add(textField_7);
	textField_7.setColumns(10);
	
	textField_8 = new JTextField();
	textField_8.setBounds(126, 306, 96, 19);
	panel_1.add(textField_8);
	textField_8.setColumns(10);
	
	JPanel panel_2 = new JPanel();
	panel_2.setLayout(null);
	panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(32, 178, 170), new Color(32, 178, 170), new Color(32, 178, 170), new Color(32, 178, 170)));
	panel_2.setBackground(new Color(32, 178, 170));
	panel_2.setAutoscrolls(true);
	panel_2.setAlignmentX(1.5f);
	panel_2.setBounds(1083, 75, 378, 530);
	f.getContentPane().add(panel_2);
	
	JLabel lblFeedback_1_2 = new JLabel("Booking & Cancelation");
	lblFeedback_1_2.setHorizontalAlignment(SwingConstants.CENTER);
	lblFeedback_1_2.setFont(new Font("Edwardian Script ITC", Font.BOLD, 33));
	lblFeedback_1_2.setBounds(10, 10, 358, 32);
	panel_2.add(lblFeedback_1_2);
	
	JLabel lblDidYouFaced = new JLabel("Did you faced any problem in booking ?");
	lblDidYouFaced.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	lblDidYouFaced.setBounds(10, 48, 358, 32);
	panel_2.add(lblDidYouFaced);
	
	JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("YES");
	rdbtnNewRadioButton_2_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			booking="yes";
		}
		
	});
	rdbtnNewRadioButton_2_1.setBounds(33, 86, 61, 21);
	panel_2.add(rdbtnNewRadioButton_2_1);
	
	JRadioButton rdbtnNewRadioButton_1_3_1 = new JRadioButton("NO");
	rdbtnNewRadioButton_1_3_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			booking="no";
		}
	});
	rdbtnNewRadioButton_1_3_1.setBounds(34, 113, 61, 21);
	panel_2.add(rdbtnNewRadioButton_1_3_1);
	
    ButtonGroup bg4=new ButtonGroup();
	
	bg4.add(rdbtnNewRadioButton_2_1);
	bg4.add(rdbtnNewRadioButton_1_3_1);
	
	JTextField textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(10, 167, 358, 80);
	panel_2.add(textField_2);
	
	JLabel lblIfYesKindly = new JLabel("if yes kindly let us know :");
	lblIfYesKindly.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	lblIfYesKindly.setBounds(10, 128, 358, 32);
	panel_2.add(lblIfYesKindly);
	
	JLabel lblDidYouFaced_2 = new JLabel("Did you faced any problem in cancelation ?");
	lblDidYouFaced_2.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	lblDidYouFaced_2.setBounds(10, 272, 358, 32);
	panel_2.add(lblDidYouFaced_2);
	
	JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton("YES");
	rdbtnNewRadioButton_2_1_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			cancellation="yes";
		}
	});
	rdbtnNewRadioButton_2_1_1.setBounds(33, 310, 61, 21);
	panel_2.add(rdbtnNewRadioButton_2_1_1);
	
	JRadioButton rdbtnNewRadioButton_1_3_1_1 = new JRadioButton("NO");
	rdbtnNewRadioButton_1_3_1_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			cancellation="no";
		}
	});
	rdbtnNewRadioButton_1_3_1_1.setBounds(34, 337, 61, 21);
	panel_2.add(rdbtnNewRadioButton_1_3_1_1);
	
    ButtonGroup bg5=new ButtonGroup();
	
	bg5.add(rdbtnNewRadioButton_2_1_1);
	bg5.add(rdbtnNewRadioButton_1_3_1_1);
	
	JLabel lblIfYesKindly_1 = new JLabel("if yes kindly let us know :");
	lblIfYesKindly_1.setFont(new Font("Lucida Sans", Font.BOLD, 12));
	lblIfYesKindly_1.setBounds(10, 352, 358, 32);
	panel_2.add(lblIfYesKindly_1);
	
	JTextField textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(10, 391, 358, 80);
	panel_2.add(textField_3);
	
	JToggleButton tglbtnNewToggleButton = new JToggleButton("SUBMIT");
	tglbtnNewToggleButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","100480abc");
				Statement stmt=c.createStatement();
				String sql= "insert into feedback (username,facilities,staff,difficulty,experience,guide,sanctuary,transportation,query,problem,problemst,cancelationl,cancelationst) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement st=c.prepareStatement(sql);
				st.setString(1,textField_4.getText());
				st.setString(2,facility);
				st.setString(3,staff);
				st.setString(4,dificulty);
				st.setString(5,textField.getText());
				 st.setString(6,textField_6.getText());
				st.setString(7,textField_7.getText());
				st.setString(8,textField_8.getText());
				st.setString(9,textField_1.getText());
				st.setString(10,booking);
				st.setString(11,textField_2.getText());
				st.setString(12,cancellation);
				st.setString(13,textField_3.getText());
				int i=st.executeUpdate();
				
				
				
				if(i>0 ) {
					JOptionPane.showMessageDialog(null," feedback saved ! ");
					
				}
				else
				{
					JOptionPane.showMessageDialog(null," error ");
				}
								
			}catch(Exception e1) 
			{System.out.println(e1);} 	
			
		
			
		}
	});
	tglbtnNewToggleButton.setBackground(new Color(95, 158, 160));
	tglbtnNewToggleButton.setBounds(707, 723, 128, 32);
	f.getContentPane().add(tglbtnNewToggleButton);
	
	JLabel lblNewLabel_3 = new JLabel("Feedback");
	lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_3.setBackground(SystemColor.activeCaption);
	lblNewLabel_3.setFont(new Font("Edwardian Script ITC", Font.BOLD, 39));
	lblNewLabel_3.setBounds(354, 33, 801, 32);
	f.getContentPane().add(lblNewLabel_3);
	
	JLabel lblNewLabel_2 = new JLabel("USERNAME -");
	lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
	lblNewLabel_2.setForeground(new Color(0, 0, 0));
	lblNewLabel_2.setBounds(1186, 0, 107, 32);
	f.getContentPane().add(lblNewLabel_2);
	
	JLabel lblNewLabel_1 = new JLabel("DATE OF RIDE -");
	lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
	lblNewLabel_1.setForeground(new Color(0, 0, 0));
	lblNewLabel_1.setBounds(1186, 33, 128, 32);
	f.getContentPane().add(lblNewLabel_1);
	
	textField_4 = new JTextField();
	textField_4.setBounds(1317, 0, 144, 27);
	f.getContentPane().add(textField_4);
	textField_4.setColumns(10);
//	
//	textField_5 = new JTextField();
//	textField_5.setBounds(1317, 33, 117, 32);
//	f.getContentPane().add(textField_5);
//	textField_5.setColumns(10);
//	
	JMenuBar mb= new JMenuBar();
	mb.setFont(new Font("Arial", Font.BOLD, 14));
	mb.setBackground(new Color(211, 211, 211));
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
	mb.add(Menu);
	JMenu Menu1=new JMenu("Log Out");
	Menu1.addMenuListener(new MenuListener() {
		public void menuCanceled(MenuEvent e) {
		}
		public void menuDeselected(MenuEvent e) {
		}
		public void menuSelected(MenuEvent e) {
			new Login();
			f.setVisible(false);
		}
	});
	mb.add(Menu1);
	
	
	
	
	f.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new FeedbackPage();
	}
}

