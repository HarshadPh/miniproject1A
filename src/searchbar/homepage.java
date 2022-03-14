package searchbar;


import java.awt.Color;
import java.awt.Font;
import java.sql.*;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.Toolkit;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultTreeModel;

import net.proteanit.sql.DbUtils;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBoxMenuItem;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class homepage  {
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	homepage(){
		JFrame f= new JFrame();
		f.getContentPane().setForeground(new Color(0, 0, 51));
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\OneDrive\\Pictures\\java\\2786081[1].jpg"));
		f.setTitle("Wildlife Tourism : Login page");
		f.getContentPane().setBackground(SystemColor.infoText);
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(444, 142, 703, 460);
	f.getContentPane().add(scrollPane);
	scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	f.getContentPane().add(scrollPane);
	table=new JTable(){
	    @Override
	       public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
	           Component component = super.prepareRenderer(renderer, row, column);
	           int rendererWidth = component.getPreferredSize().width;
	           TableColumn tableColumn = getColumnModel().getColumn(column);
	           tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
	           return component;
	        }
	    };
	table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	table.setFillsViewportHeight(true);
	table.setSurrendersFocusOnKeystroke(true);
	table.setFont(new Font("Tahoma", Font.PLAIN, 16));
	table.setColumnSelectionAllowed(true);
	table.setCellSelectionEnabled(true);
	table.setForeground(new Color(255, 255, 255));
	
	table.setBackground(new Color(0, 0, 0));
	scrollPane.setViewportView(table);
	scrollPane.setBorder(BorderFactory.createTitledBorder("Your search"));
	
	JLabel lblNewLabel_1 = new JLabel("New label");
	lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Admin\\OneDrive\\Pictures\\java\\4742301.jpg"));
	//ImageIcon img= new ImageIcon(this.getClass().getResource("4742301.jpg"));
	//lblNewLabel_1.setIcon(img);
	//lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Admin\\OneDrive\\Pictures\\java\\4742301.jpg"));
	lblNewLabel_1.setBounds(751, 10, 775, 740);
	f.getContentPane().add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("New label");
	lblNewLabel_2.setBounds(-690, 10, 1620, 740);
	f.getContentPane().add(lblNewLabel_2);
	//ImageIcon img1= new ImageIcon(this.getClass().getResource("4742301 (2).jpg"));
	lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Admin\\OneDrive\\Pictures\\java\\4742301 (2).jpg"));

	
	
	
	JMenuBar menuBar = new JMenuBar();
	f.setJMenuBar(menuBar);
	
	JButton btnNewButton = new JButton("Explore");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//new homePagei();
		}
	});
	menuBar.add(btnNewButton);
	btnNewButton.setForeground(new Color(255, 255, 51));
	btnNewButton.setBackground(new Color(0, 0, 0));
	btnNewButton.setFont(new Font("Ebrima", Font.BOLD, 16));
	
	JButton btnBooking = new JButton("Booking\r\n");
	menuBar.add(btnBooking);
	btnBooking.setForeground(new Color(255, 255, 51));
	btnBooking.setBackground(new Color(0, 0, 0));
	btnBooking.setFont(new Font("Ebrima", Font.BOLD, 16));
	
	
	
	textField  = new JTextField();
	textField.addKeyListener(new KeyAdapter() {
		
		public void KeyPressed(KeyEvent e) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sancturies","root","?Har@2022");
		        Statement stmt=con.createStatement();
		        String san=textField.getText().trim();
		        String animal=textField.getText().trim();
				String sql="select no_,sanctury_name,near_tourist_place,Animals,District from sanct where sanctury_name="+"'"+san+"'"+" or"+" a7="+"'"+animal+"'"+" or A1="+"'"+animal+"'"+" or A2="+"'"+animal+"'"+" or A3="+"'"+animal+"'"+" or A4="+"'"+animal+"'"+" or A5="+"'"+animal+"'" +" or A6="+"'"+animal+"'"+" or District="+"'"+animal+"'" ;
				ResultSet rs=stmt.executeQuery(sql);
			    
				table.setModel(DbUtils.resultSetToTableModel(rs));
				table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				JOptionPane.showMessageDialog(null,"You haven't selected any filter");
			} catch(Exception e1) {
				 e1.printStackTrace();
			}
			}
			
		}
	);
	
	menuBar.add(textField);
	textField.setColumns(10);
	
	JMenu mnNewMenu = new JMenu("Searchby");
	mnNewMenu.setBackground(new Color(0, 0, 0));
	menuBar.add(mnNewMenu);
	
	JCheckBoxMenuItem sanname = new JCheckBoxMenuItem("Sanctury Name");
	mnNewMenu.add(sanname);
	
	JCheckBoxMenuItem animal = new JCheckBoxMenuItem("animals");
	mnNewMenu.add(animal);
	
	ButtonGroup bg=new ButtonGroup();
	
	bg.add(sanname);
	bg.add(animal);
	
	JCheckBoxMenuItem place = new JCheckBoxMenuItem("Place/Dist.");
	mnNewMenu.add(place);
	bg.add(place);
	
	JCheckBoxMenuItem show = new JCheckBoxMenuItem("show all");
	mnNewMenu.add(show);
	bg.add(show);
	
	
	JButton btnNewButton_1 = new JButton("Search");
	btnNewButton_1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		    
			try {
				
				JLabel lblNewLabel = new JLabel("you were searching for:"+textField.getText());
				lblNewLabel.setForeground(Color.CYAN);
				lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 16));
				lblNewLabel.setBackground(Color.YELLOW);
				lblNewLabel.setBounds(45, 38, 376,80);
				f.getContentPane().add(lblNewLabel);
				lblNewLabel.setText(null);
				if(sanname.isSelected()) {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sancturies","root","?Har@2022");
			        Statement stmt=con.createStatement();
					String san=textField.getText().trim();
					String sql="select no_,sanctury_name,near_tourist_place,Animals,District from sanct where sanctury_name="+"'"+san+"'"+" or a7="+"'"+san+"'";
					ResultSet rs=stmt.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				}else if(animal.isSelected()) {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sancturies","root","?Har@2022");
			        Statement stmt=con.createStatement();
					String animal=textField.getText().trim();
					String sql="select no_,sanctury_name,near_tourist_place,Animals,District from sanct where A1="+"'"+animal+"'"+" or A2="+"'"+animal+"'"+" or A3="+"'"+animal+"'"+" or A4="+"'"+animal+"'"+" or A5="+"'"+animal+"'" +" or A6="+"'"+animal+"'";
					ResultSet rs=stmt.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				}else if(place.isSelected()) {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sancturies","root","?Har@2022");
			        Statement stmt=con.createStatement();
					String animal=textField.getText().trim();
					String sql="select no_,sanctury_name,near_tourist_place,Animals,District from sanct where district="+"'"+animal+"'";
					ResultSet rs=stmt.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				}else if(show.isSelected()) {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sancturies","root","?Har@2022");
			        Statement stmt=con.createStatement();
					String animal=textField.getText().trim();
					String sql="select no_,sanctury_name,near_tourist_place,Animals,District from sanct";
					ResultSet rs=stmt.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
				    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				}else  {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sancturies","root","?Har@2022");
			        Statement stmt=con.createStatement();
			        String san=textField.getText().trim();
			        String animal=textField.getText().trim();
					String sql="select count(*) from sanct";
					ResultSet rs=stmt.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					System.out.println(rs);
					JOptionPane.showMessageDialog(null,"You haven't selected any filter");
				}
				
				
				
			} catch(Exception e1) {
				 e1.printStackTrace();
			}
			}
	});
	
	
	
	
	
	btnNewButton_1.setBackground(new Color(128, 128, 128));
	menuBar.add(btnNewButton_1);
	
	
	
	
	
	JButton btnNewButton_2 = new JButton("About us");
	menuBar.add(btnNewButton_2);
	btnNewButton_2.setForeground(new Color(255, 255, 51));
	btnNewButton_2.setBackground(new Color(0, 0, 0));
	btnNewButton_2.setFont(new Font("Ebrima", Font.BOLD, 16));
	
	JButton btnLogOut = new JButton("Log Out");
	btnLogOut.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	menuBar.add(btnLogOut);
	btnLogOut.setForeground(new Color(255, 255, 51));
	btnLogOut.setBackground(new Color(0, 0, 0));
	btnLogOut.setFont(new Font("Ebrima", Font.BOLD, 16));
	f.setVisible(true);
	
	
	
	}

	
	public static void main(String[] args) {
		new homepage();
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}