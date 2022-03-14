import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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

public class cancelation  {
	private JTable table_1;
	private JTextField txtEnterYourPayment;
	cancelation(){
		JFrame f= new JFrame();
		f.getContentPane().setForeground(new Color(0, 0, 51));
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\OneDrive\\Pictures\\java\\2786081[1].jpg"));
		f.setTitle("Wildlife Tourism : Login page");
		f.getContentPane().setBackground(SystemColor.infoText);
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	
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
	
	txtEnterYourPayment = new JTextField();
	txtEnterYourPayment.setText("Enter Your Payment id here");
	txtEnterYourPayment.setBackground(Color.WHITE);
	txtEnterYourPayment.setBounds(525, 130, 230, 24);
	f.getContentPane().add(txtEnterYourPayment);
	txtEnterYourPayment.setColumns(10);
	
	JButton btnNewButton_1 = new JButton("cancel my trip ");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	btnNewButton_1.setBounds(625, 233, 201, 21);
	f.getContentPane().add(btnNewButton_1);

	
	
	
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
	
	ButtonGroup bg=new ButtonGroup();
	
	
	
	
	
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
		new cancelation();
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