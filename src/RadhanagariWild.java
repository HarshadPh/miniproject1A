import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;

public class RadhanagariWild  {
	RadhanagariWild(){
		JFrame f= new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setTitle("Wildlife Tourism :RadhanagariInfo page");
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.WHITE);
	panel.setBounds(0, 0, 1546, 793);
	f.getContentPane().add(panel);
	panel.setLayout(null);
	
	JTextArea txtrMelghatWildlifeSanctuary = new JTextArea();
	txtrMelghatWildlifeSanctuary.setForeground(Color.BLACK);
	txtrMelghatWildlifeSanctuary.setBackground(Color.WHITE);
	txtrMelghatWildlifeSanctuary.setFont(new Font("Georgia", Font.BOLD, 35));
	txtrMelghatWildlifeSanctuary.setText(" Radhanagari Wildlife Sanctuary ");
	txtrMelghatWildlifeSanctuary.setBounds(506, 23, 597, 48);
	panel.add(txtrMelghatWildlifeSanctuary);
	txtrMelghatWildlifeSanctuary.setEditable(false);
	
	JTextArea txtrTouristDestination = new JTextArea();
	txtrTouristDestination.setForeground(Color.BLACK);
	txtrTouristDestination.setBackground(Color.WHITE);
	txtrTouristDestination.setFont(new Font("Georgia", Font.PLAIN, 25));
	txtrTouristDestination.setText("Tourist Destination");
	txtrTouristDestination.setBounds(50, 96, 227, 31);
	panel.add(txtrTouristDestination);
	txtrTouristDestination.setEditable(false);
	
	JTextArea txtrMelghatTigerReserve = new JTextArea();
	txtrMelghatTigerReserve.setForeground(Color.BLACK);
	txtrMelghatTigerReserve.setBackground(Color.WHITE);
	txtrMelghatTigerReserve.setText("  it is notable as the first declared wildlife sanctuary in Maharashtra, notified in 1958, as \"Dajipur Wildlife Sanctuary\" and is popularly known as the \"Bison Sanctuary\". Indian bison or gaur (Bos gaurus) with a population around 1091 in 2014, is the flagship species of the area.\r\nRadhanagari Wildlife Sanctuary is a wildlife sanctuary located in Kolhapur district at 55 kms from Kolhapur on the Kolhapur - Kankavli route. Radhanagari lies at the southern end of the Sahyadri hills in the Western Ghats and is renowned for its population of Indian Gaur and is rich in bird life.");
	txtrMelghatTigerReserve.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrMelghatTigerReserve.setWrapStyleWord(true);
	txtrMelghatTigerReserve.setLineWrap(true);
	txtrMelghatTigerReserve.setBounds(50, 136, 697, 145);
	panel.add(txtrMelghatTigerReserve);
	txtrMelghatTigerReserve.setEditable(false);
	
	
	JTextArea textArea = new JTextArea();
	textArea.setBackground(Color.BLACK);
	textArea.setBounds(50, 124, 218, 5);
	panel.add(textArea);
	
	JTextArea txtrGeography = new JTextArea();
	txtrGeography.setText("Geography\r\n");
	txtrGeography.setForeground(Color.BLACK);
	txtrGeography.setFont(new Font("Georgia", Font.PLAIN, 25));
	txtrGeography.setBackground(Color.WHITE);
	txtrGeography.setBounds(777, 96, 227, 31);
	panel.add(txtrGeography);
	 txtrGeography.setEditable(false);
	
	JTextArea textArea_1 = new JTextArea();
	textArea_1.setBackground(Color.BLACK);
	textArea_1.setBounds(777, 124, 120, 5);
	panel.add(textArea_1);
	
	JTextArea txtrTheMelghatIs = new JTextArea();
	txtrTheMelghatIs.setWrapStyleWord(true);
	txtrTheMelghatIs.setText("This is a natural World Heritage Site notified by UNESCO as Sahyadri sub cluster of Western Ghats. The sanctuary is located between 16\u00B010\" to 16\u00B030\" north latitude and 73\u00B052\" to 74\u00B014\" east longitude. The Krishna River tributaries, Bhogavati River, Dudhganga River, Tulshi River, Kallamma River and Dirba River flow through the sanctuary's area. State Highway 116 passes through the center of the sanctuary. It is located in Sahyadri hill ranges. The total area of the sanctuary is  351  square km.");
	txtrTheMelghatIs.setLineWrap(true);
	txtrTheMelghatIs.setForeground(Color.BLACK);
	txtrTheMelghatIs.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrTheMelghatIs.setBackground(Color.WHITE);
	txtrTheMelghatIs.setBounds(777, 137, 697, 144);
	panel.add(txtrTheMelghatIs);
	txtrTheMelghatIs.setEditable(false);
	
	JLabel lb1 = new JLabel("");
	ImageIcon img= new ImageIcon(this.getClass().getResource("Radha1.jpg"));
	lb1.setIcon(img);
	//lb1.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\121.jpg"));
	lb1.setBackground(Color.BLACK);
	lb1.setBounds(65, 291, 300, 168);
	panel.add(lb1);
	
	JLabel lb2 = new JLabel("");
	ImageIcon img1= new ImageIcon(this.getClass().getResource("Radha2.jpg"));
	lb2.setIcon(img1);
	//lb2.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\181.jpg"));
	lb2.setBackground(Color.BLACK);
	lb2.setBounds(431, 291, 300, 168);
	panel.add(lb2);
	
	JLabel lb3 = new JLabel("");
	ImageIcon img2= new ImageIcon(this.getClass().getResource("Radha3.jpg"));
	lb3.setIcon(img2);
	//lb3.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\141.jpg"));
	lb3.setBackground(Color.BLACK);
	lb3.setBounds(792, 291, 300, 168);
	panel.add(lb3);
	
	JLabel lb4 = new JLabel("");
	ImageIcon img3= new ImageIcon(this.getClass().getResource("Radha4.jpg"));
	lb4.setIcon(img3);
	//lb4.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\121.jpg"));
	lb4.setBackground(Color.BLACK);
	lb4.setBounds(1153, 291, 300, 168);
	panel.add(lb4);
	
	JTextArea txtrNearestTouristPlaces = new JTextArea();
	txtrNearestTouristPlaces.setText("Nearest Tourist Places");
	txtrNearestTouristPlaces.setForeground(Color.BLACK);
	txtrNearestTouristPlaces.setFont(new Font("Georgia", Font.PLAIN, 25));
	txtrNearestTouristPlaces.setBackground(Color.WHITE);
	txtrNearestTouristPlaces.setBounds(50, 481, 262, 31);
	panel.add(txtrNearestTouristPlaces);
	txtrNearestTouristPlaces.setEditable(false);
	
	JTextArea textArea_2 = new JTextArea();
	textArea_2.setBackground(Color.BLACK);
	textArea_2.setBounds(50, 508, 250, 6);
	panel.add(textArea_2);
	
	JTextArea txtrSemadohIsThe = new JTextArea();
	txtrSemadohIsThe.setWrapStyleWord(true);
	txtrSemadohIsThe.setText("1)One of the scenic beauties with surrounding lush green forest in Radhanagari wildlife sanctuary is Radhanagari Dam.\r\n2)Dajipur village\r\n\r\nIn the village, you can visit display hall which displays information on the inhabitants of the forest, with large mounted and labeled photographs, interactive quizzes on display, as well as the pug marks of important forest inhabitants cast in plaster.\r\n\r\n3)Konkan Darshan Point\r\n4)Sambar Kund\r\n5)Ugvai Temple\r\n6)Rautwadi and Ramanwadi Waterfall");
	txtrSemadohIsThe.setLineWrap(true);
	txtrSemadohIsThe.setForeground(Color.BLACK);
	txtrSemadohIsThe.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrSemadohIsThe.setBackground(Color.WHITE);
	txtrSemadohIsThe.setBounds(50, 522, 697, 271);
	panel.add(txtrSemadohIsThe);
	txtrSemadohIsThe.setEditable(false);
	
	JTextArea txtrVisitingRuleAnd = new JTextArea();
	txtrVisitingRuleAnd.setText("Visiting Rule and Time");
	txtrVisitingRuleAnd.setForeground(Color.BLACK);
	txtrVisitingRuleAnd.setFont(new Font("Georgia", Font.PLAIN, 25));
	txtrVisitingRuleAnd.setBackground(Color.WHITE);
	txtrVisitingRuleAnd.setBounds(780, 481, 262, 31);
	panel.add(txtrVisitingRuleAnd);
	txtrVisitingRuleAnd.setEditable(false);
	
	
	JTextArea textArea_2_1 = new JTextArea();
	textArea_2_1.setBackground(Color.BLACK);
	textArea_2_1.setBounds(781, 510, 250, 4);
	panel.add(textArea_2_1);
	
	JTextArea txtrTheBestTime = new JTextArea();
	txtrTheBestTime.setWrapStyleWord(true);
	txtrTheBestTime.setText("- Location: New Ambabai Temple Main Road, Radhanagari, Maharashtra 416212.\r\n\r\n- Best Time: June to September, Monsoons.\r\n\r\n- Timings: 7:00 am to 2:30 pm.\r\n\r\n- Price: Starting INR 120 per person.\r\n");
	txtrTheBestTime.setLineWrap(true);
	txtrTheBestTime.setForeground(Color.BLACK);
	txtrTheBestTime.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrTheBestTime.setBackground(Color.WHITE);
	txtrTheBestTime.setBounds(777, 525, 697, 226);
	panel.add(txtrTheBestTime);
	txtrTheBestTime.setEditable(false);
	
	JMenuBar mb= new JMenuBar();
	mb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	mb.setBackground(new Color(176, 224, 230));
	f.setJMenuBar(mb);
	JMenu mnBack=new JMenu("Back");
	mnBack.addMenuListener(new MenuListener() {
		public void menuCanceled(MenuEvent e) {
		}
		public void menuDeselected(MenuEvent e) {
		}
		public void menuSelected(MenuEvent e) {
			new info_page();
			f.setVisible(false);
		}
	});
	mnBack.setFont(new Font("Arial", Font.BOLD, 15));
	mb.add(mnBack);
	
	
	f.setVisible(true);
		
	}

	
	public static void main(String[] args) {
		new RadhanagariWild();
		
	
	}
}
