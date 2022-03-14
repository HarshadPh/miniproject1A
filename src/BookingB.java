import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleContext.SmallAttributeSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class BookingB  {
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField txtStartYourJourney;
	private JTextField txtWithUs;
	private JTextField textField_6;
	private JPanel contentPane;
	JTable table;
	JScrollPane scrollPane;
	String srno,tname,gender,age,city,addhar,slot;
	int entry_fee,j;
	private ButtonGroup bg2;
	DefaultTableModel model;
	JDateChooser jdc ;
	int A,visitor=15;
	ResultSet rs;
	
	
	String date;
	 int x,cnt;
	


	
	BookingB(){
		ValidPhone vp= new ValidPhone();
		int B=0;
		
		
		
		
		JFrame f= new JFrame();
		f.setTitle("Wildlife Tourism : Booking page");
		f.getContentPane().setBackground(new Color(153, 204, 153));
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	
	
	
	
	JPanel panel_1 = new JPanel();
	panel_1.setBackground(new Color(153, 204, 153));
	panel_1.setBounds(0, 106, 787, 687);
	f.getContentPane().add(panel_1);
	panel_1.setLayout(null);
	
	JPanel panel_2 = new JPanel();
	panel_2.setBounds(40, 40, 689, 628);
	panel_1.add(panel_2);
	panel_2.setLayout(null);
	
	JLabel lblNewLabel_1 = new JLabel("Sr.No :");
	lblNewLabel_1.setForeground(Color.WHITE);
	lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 15));
	lblNewLabel_1.setBounds(30, 70, 54, 31);
	panel_2.add(lblNewLabel_1);
	
	textField = new JTextField();
	textField.setBorder(new LineBorder(Color.ORANGE, 1, true));
	textField.setBounds(170, 70, 54, 25);
	panel_2.add(textField);
	textField.setColumns(10);
	
	JPanel panel_3 = new JPanel();
	panel_3.setBackground(Color.WHITE);
	panel_3.setBounds(0, 0, 689, 628);
	panel_2.add(panel_3);
	panel_3.setLayout(null);
	
	JLabel lblNewLabel_2 = new JLabel("Tourist Name :\r\n");
	lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 15));
	lblNewLabel_2.setForeground(Color.WHITE);
	lblNewLabel_2.setBounds(30, 120, 124, 33);
	panel_3.add(lblNewLabel_2);
	
	textField_1 = new JTextField();
	textField_1.setBorder(new LineBorder(Color.ORANGE, 1, true));
	textField_1.setBounds(170, 120, 156, 25);
	panel_3.add(textField_1);
	textField_1.setColumns(10);
	
	JPanel panel = new JPanel();
	panel.setBounds(0, 0, 689, 628);
	panel_3.add(panel);
	panel.setLayout(null);
	
	JPanel panel_4 = new JPanel();
	panel_4.setBounds(0, 0, 689, 628);
	panel.add(panel_4);
	panel_4.setLayout(null);
	
	JLabel lblNewLabel_5 = new JLabel("City :");
	lblNewLabel_5.setForeground(Color.WHITE);
	lblNewLabel_5.setFont(new Font("Georgia", Font.BOLD, 15));
	lblNewLabel_5.setBounds(30, 270, 69, 23);
	panel_4.add(lblNewLabel_5);
	
	textField_4 = new JTextField();
	textField_4.setBorder(new LineBorder(Color.ORANGE, 1, true));
	textField_4.setBounds(170, 270, 125, 25);
	panel_4.add(textField_4);
	textField_4.setColumns(10);
	
	JLabel lblNewLabel_4 = new JLabel("Age :");
	lblNewLabel_4.setBounds(30, 220, 52, 18);
	panel_4.add(lblNewLabel_4);
	lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 15));
	lblNewLabel_4.setForeground(Color.WHITE);
	
	textField_3 = new JTextField();
	textField_3.setBorder(new LineBorder(Color.ORANGE, 1, true));
	textField_3.setBounds(170, 220, 52, 25);
	panel_4.add(textField_3);
	textField_3.setColumns(10);
	
	JLabel lblNewLabel_3 = new JLabel("Gender :");
	lblNewLabel_3.setBounds(30, 170, 131, 24);
	panel_4.add(lblNewLabel_3);
	lblNewLabel_3.setFont(new Font("Georgia", Font.BOLD, 15));
	lblNewLabel_3.setForeground(Color.WHITE);
	
	textField_2 = new JTextField();
	textField_2.setBorder(new LineBorder(Color.ORANGE, 1, true));
	textField_2.setBounds(170, 170, 80, 25);
	panel_4.add(textField_2);
	textField_2.setColumns(10);
	
	JButton btnSubmit = new JButton("Proceed -->");
	btnSubmit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			j=table.getRowCount();
			  entry_fee= j*450;
			  JOptionPane.showMessageDialog(null,"Amount to be paid ->> "+entry_fee+" INR");
			  try {
				  int z=table.getRowCount();
				  JOptionPane.showMessageDialog(null," "  + j);
				  
					Class.forName("com.mysql.jdbc.Driver");
					Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","100480abc");
					Statement stmt=c.createStatement();
					String ssd="insert into slot (safari_date,safari_slot,visitors_count) values(?,?,?)";
					//String hdd="insert into slot (safari_date,afternoon,visitors_count) values(?,?,?)";
					PreparedStatement sb=c.prepareStatement(ssd);
					//PreparedStatement sm=c.prepareStatement(hdd);
					SimpleDateFormat v= new SimpleDateFormat("yyyy-MM-dd");
					date =v.format(jdc.getDate());
					sb.setString(1,date);
					sb.setString(2,slot);
					sb.setLong(3, j);
				
					 
						//sm.executeUpdate();
						int k=sb.executeUpdate();
						if(k>0) {
							 JOptionPane.showMessageDialog(null,"saved sucessfully ");
						}
						
					
					
				}catch(Exception e1) 
				{System.out.println(e1);}
			  

			
			  
			
		}
	});
	btnSubmit.setFont(new Font("SansSerif", Font.BOLD, 15));
	btnSubmit.setBackground(Color.ORANGE);
	btnSubmit.setBounds(82, 430, 131, 35);
	panel_4.add(btnSubmit);
	
	JButton btnDelete = new JButton("clear");
	btnDelete.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField.setText("");
			 textField_1.setText("");
			 textField_2.setText("");
			 textField_3.setText("");
			 textField_5.setText("");
			 textField_4.setText("");
			 textField.requestFocus();
		}
	});
	btnDelete.setFont(new Font("SansSerif", Font.BOLD, 15));
	btnDelete.setBackground(Color.ORANGE);
	btnDelete.setBounds(170, 380, 94, 25);
	panel_4.add(btnDelete);
	
	JButton btnNewButton = new JButton("Add");
	btnNewButton.addActionListener(new ActionListener() {
		int x=0;
		
		public void actionPerformed(ActionEvent e) {
			
			
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","100480abc");
				//	Statement stmt=c.createStatement();
					String sql= "insert into booking(sr_no,name,gender,age,city,addhar_no,safari_date ) values(?,?,?,?,?,?,?)";
//					String ssd="insert into slot (safari_date,morning,visitors_count) values(?,?,?)";
//					String hdd="insert into slot (safari_date,afternoon,visitors_count) values(?,?,?)";
					PreparedStatement st=c.prepareStatement(sql);
//					PreparedStatement sb=c.prepareStatement(ssd);
//					PreparedStatement sm=c.prepareStatement(hdd);
					SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");	 
					date =sdf.format(jdc.getDate());
					st.setString(1,textField.getText().trim());
					st.setString(2,textField_1.getText().trim());
					st.setString(3,textField_2.getText().trim());
					st.setString(4,textField_3.getText().trim());
					st.setString(5,textField_4.getText().trim());
					st.setString(6,textField_5.getText().trim());
					st.setString(7,date);
					//sb.setString(1,date);
				//	sb.setLong(2,morn);
					//sb.setLong(3,cnt );
					//sm.setString(1,date);
				//	sm.setLong(2,aft);
					//sm.setLong(3,cnt );
					
					 srno=textField.getText().trim();
					 tname=textField_1.getText().trim();
					gender=textField_2.getText().trim();
					 age=textField_3.getText().trim();
					 city=textField_4.getText().trim();
					 addhar=textField_5.getText().trim();
					 
					
									if( vp.Check(textField_5.getText().trim())==false) {
										JOptionPane.showMessageDialog(null," check addhar number");
									}
									
									
					 
						if( vp.Check(textField_5.getText().trim())==true) {
							 int i =st.executeUpdate();
						
					 if( i!=0) {
						 JOptionPane.showMessageDialog(null,"record added "+B +" "+ cnt+" "+x);
						 {
								String[] row = new String[7];
							row [0]=srno;
							row[1]=date;
							row[2]=tname;
							row[3]=gender;
							row[4]=age;
							row[5]=city;
							row[6]=addhar;
							model.addRow(row);
							
							 
							
							     }
						
						 
					          }
					 
						 		
						 else{
							 JOptionPane.showMessageDialog(null,"try again");
							 
						 }
					 // continue//
					 String ssl=" SELECT sum(visitors_count) FROM slot  WHERE safari_slot='"+slot+"' AND safari_date='"+date+"'";
									PreparedStatement sb=c.prepareStatement(ssl);
									ResultSet rs= sb.executeQuery();
									if(rs.next()) {
										String sum =rs.getString("sum(visitors_count)");
										 JOptionPane.showMessageDialog(null,"success");
										int B=Integer.parseInt(sum);
										  A=visitor-B;
										 
									}
						 
								
					
						
				}
				}
					
				 
					
					 
				
					
					
						
					
				catch(Exception e1) 
				{System.out.println(e1);
				} 
				int cnt= table.getRowCount();
				 x=cnt;
				 JOptionPane.showMessageDialog(null, cnt +" "+x);
				
			
			}
			
	}
		
		
});
	btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
	btnNewButton.setBackground(Color.ORANGE);
	btnNewButton.setBounds(40, 380, 94, 25);
	panel_4.add(btnNewButton);
	
	JLabel lblNewLabel_2_1_1 = new JLabel("Date");
	lblNewLabel_2_1_1.setForeground(Color.BLACK);
	lblNewLabel_2_1_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
	lblNewLabel_2_1_1.setBackground(Color.WHITE);
	lblNewLabel_2_1_1.setBounds(450, 15, 38, 25);
	panel_4.add(lblNewLabel_2_1_1);
	
	 jdc = new JDateChooser();
	jdc.setBounds(490, 17, 119, 19);
	panel_4.add(jdc);
	
	JPanel panel_5 = new JPanel();
	panel_5.setBackground(Color.WHITE);
	panel_5.setBounds(0, 0, 689, 628);
	panel_4.add(panel_5);
	panel_5.setLayout(null);
	
	JLabel lblNewLabel_6 = new JLabel("Addhar Number :\r\n\r\n");
	lblNewLabel_6.setForeground(Color.WHITE);
	lblNewLabel_6.setFont(new Font("Georgia", Font.BOLD, 15));
	lblNewLabel_6.setBounds(30, 325, 138, 13);
	panel_5.add(lblNewLabel_6);
	
	textField_5 = new JTextField();
	textField_5.setBorder(new LineBorder(Color.ORANGE, 1, true));
	textField_5.setBounds(170, 320, 155, 25);
	panel_5.add(textField_5);
	textField_5.setColumns(10);
	
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setBounds(0, 0, 689, 628);
	panel_5.add(lblNewLabel);
	lblNewLabel.setIgnoreRepaint(true);
	lblNewLabel.setHorizontalTextPosition(SwingConstants.LEADING);
	lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 15));
	lblNewLabel.setForeground(Color.WHITE);
	ImageIcon img= new ImageIcon(this.getClass().getResource("1 (1).jpg"));
	lblNewLabel.setIcon(img);
	
	JLabel label = new JLabel("New label");
	label.setBounds(92, 28, 72, 25);
	panel_5.add(label);
	

	
	
	//lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91996\\Pictures\\Saved Pictures\\1.jpg"));
	
	JPanel panel_6 = new JPanel();
	panel_6.setBackground(new Color(153, 204, 153));
	panel_6.setBounds(0, 0, 1536, 106);
	f.getContentPane().add(panel_6);
	panel_6.setLayout(null);
	
	txtStartYourJourney = new JTextField();
	txtStartYourJourney.setBorder(null);
	txtStartYourJourney.setEditable(false);
	txtStartYourJourney.setBackground(new Color(153, 204, 153));
	txtStartYourJourney.setForeground(new Color(255, 255, 255));
	txtStartYourJourney.setFont(new Font("Georgia", Font.BOLD, 40));
	txtStartYourJourney.setText("Start Your Greatest");
	txtStartYourJourney.setBounds(467, 0, 448, 52);
	panel_6.add(txtStartYourJourney);
	txtStartYourJourney.setColumns(10);
	
	txtWithUs = new JTextField();
	txtWithUs.setBorder(null);
	txtWithUs.setEditable(false);
	txtWithUs.setText(" Journey With Us");
	txtWithUs.setForeground(Color.WHITE);
	txtWithUs.setFont(new Font("Georgia", Font.BOLD, 40));
	txtWithUs.setColumns(10);
	txtWithUs.setBackground(new Color(153, 204, 153));
	txtWithUs.setBounds(694, 54, 410, 52);
	panel_6.add(txtWithUs);
	
//	textField_6 = new JTextField();
//	textField_6.setFont(new Font("Tahoma", Font.BOLD, 10));
//	textField_6.setColumns(10);
//	textField_6.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
//	textField_6.setBounds(170, 17, 96, 19);
//	panel_4.add(textField_6);
//	
JLabel lblNewLabel_2_1 = new JLabel("Slot -");
lblNewLabel_2_1.setBounds(10, 76, 80, 25);
panel_6.add(lblNewLabel_2_1);
lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
lblNewLabel_2_1.setFont(new Font("SansSerif", Font.BOLD, 15));
lblNewLabel_2_1.setBackground(Color.WHITE);
JRadioButton rb1 = new JRadioButton("Morning");
rb1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		slot="morning";
		
	}
});
rb1.setFont(new Font("Arial", Font.BOLD, 15));
rb1.setBounds(60, 80, 103, 21);
panel_6.add(rb1);
JRadioButton rb2 = new JRadioButton("Afternoon");
rb2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		slot="afternoon";
	}
});
rb2.setFont(new Font("Arial", Font.BOLD, 15));
rb2.setBounds(178, 80, 103, 21);
panel_6.add(rb2);

ButtonGroup bg2=new ButtonGroup();

bg2.add(rb1);
bg2.add(rb2);
	
	
	scrollPane=new JScrollPane();
	scrollPane.setBackground(new Color(153, 204, 153));
	scrollPane.setBounds(new Rectangle(810, 130, 691, 660));
	scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	f.getContentPane().add(scrollPane);
	table =new JTable();
	table.setBackground(new Color(176, 224, 230));
	model=new DefaultTableModel();
	Object[] column= {"Sr.No","safari date","Tourist Name","Gender","Age","City","Addhar Number"};
	Object[] row= new Object[7];
	model.setColumnIdentifiers(column);
	scrollPane.setViewportView(table);
	scrollPane.setBorder(BorderFactory.createTitledBorder("Visitor Details"));
	table.setModel(model);
	
	
	
	f.setVisible(true);
	}
	public class ValidPhone{
		 Boolean Check(String phone){
			  
				//Regular expression to accept valid phone number
			      String regex = "\\d{12}";
			      //Creating a pattern object
			      Pattern pattern = Pattern.compile(regex);
			      //Creating a Matcher object
			      Matcher matcher = pattern.matcher(phone);
			      if(matcher.matches()) {
			          return true;
			       } 
			      else { 
			        return false;
			       }
				 
				 
			 }
		
			
		}
		

	
	public static void main(String[] args) {
		new BookingB();

	}
}
