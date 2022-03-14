import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;


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
import java.util.Vector;

import javax.swing.JTextPane;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
import com.toedter.calendar.JCalendar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.toedter.calendar.JDayChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
public class Booking{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	DefaultTableModel model;
	protected Vector<?> row;
	Booking(){
		JFrame f= new JFrame();
		f.setBackground(new Color(255, 255, 255));
		f.setTitle("Wildlife Tourism : Booking");
		f.getContentPane().setBackground(new Color(230, 230, 250));
		f.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 98, 1536, 727);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("Number of Visitors :-");
		lbl1.setFont(new Font("Arial", Font.BOLD, 16));
		lbl1.setBounds(22, 0, 168, 34);
		panel.add(lbl1);
		
		textField = new JTextField();
		textField.setBounds(190, 0, 106, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(643, 0, 229, 34);
		panel.add(dateChooser);
		
		JLabel lbl2 = new JLabel("Safari Date :-");
		lbl2.setFont(new Font("Arial", Font.BOLD, 18));
		lbl2.setBounds(515, 0, 128, 34);
		panel.add(lbl2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 44, 1536, 683);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sr.No");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(54, 53, 152, 31);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tourist Name :");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(54, 94, 152, 37);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(54, 137, 152, 37);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3.setBounds(54, 183, 152, 37);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("City");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_4.setBounds(54, 232, 152, 37);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Addhar Number");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_5.setBounds(54, 279, 152, 37);
		panel_2.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(203, 55, 54, 31);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(203, 94, 338, 30);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(203, 137, 112, 37);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(203, 184, 50, 37);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(203, 230, 170, 39);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(203, 279, 300, 37);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
//				row[0]=textField_1.getText();
//				row[1]=textField_2.getText();
//				row[2]=textField_3.getText();
//				row[3]=textField_4.getText();
//				row[4]=textField_5.getText();
//				row[5]=textField_6.getText();
				model.addRow(row);
			}
			
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(54, 388, 112, 45);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1.setBounds(54, 468, 112, 45);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2.setBounds(256, 388, 117, 45);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_3.setBounds(256, 468, 117, 45);
		panel_2.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(657, 0, 857, 673);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(new Color(176, 224, 230));
		model=new DefaultTableModel();
		Object[] column= {"Sr.No","Tourist Name","Gender","Age","City","Addhar Number"};
		 final Object[] row= new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(0, 0, 1536, 99);
		f.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	
	JMenuBar mb= new JMenuBar();
	JMenu Menu=new JMenu("Back");
	Menu.setFont(new Font("Arial", Font.BOLD, 14));
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
	
	mb.setBackground(new Color(192, 192, 192));
	f.setJMenuBar(mb);
	mb.add(Menu);
	f.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new Booking();
		
	}
}



