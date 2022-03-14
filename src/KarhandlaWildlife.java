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

public class KarhandlaWildlife  {
	KarhandlaWildlife(){
		JFrame f= new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setTitle("Wildlife Tourism :karhandlaInfo page");
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
	txtrMelghatWildlifeSanctuary.setText(" Karhandla Wildlife Sanctuary ");
	txtrMelghatWildlifeSanctuary.setBounds(506, 23, 551, 48);
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
	txtrMelghatTigerReserve.setText("Umred-Pauni-Karhandla Wildlife Sanctuary, about 50 km from Nagpur and 60  km from Bhandara, is spread over Pauni Tahsil of Bhandara district and Umred, Kuhi and Bhivapur Taluka of Nagpur district.");
	txtrMelghatTigerReserve.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrMelghatTigerReserve.setWrapStyleWord(true);
	txtrMelghatTigerReserve.setLineWrap(true);
	txtrMelghatTigerReserve.setBounds(50, 136, 697, 112);
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
	txtrTheMelghatIs.setText("It is bounded roughly by the Wainganga river and the Gose Khurd Dam on the northeast, State Highway 9 and Bhiwapur Town on the south, Umred on the west and a narrow 10 km long range of 600 \u2013 800 m hills to the northwest. It is located 40 km north of Tadoba-Andhari Tiger Reserve and 50 km southwest of Nagzira Wildlife Sanctuary & 60 km from Nagpur, Maharashtra. Pench Tiger Reserve is 80 km to the northwest.");
	txtrTheMelghatIs.setLineWrap(true);
	txtrTheMelghatIs.setForeground(Color.BLACK);
	txtrTheMelghatIs.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrTheMelghatIs.setBackground(Color.WHITE);
	txtrTheMelghatIs.setBounds(777, 137, 697, 112);
	panel.add(txtrTheMelghatIs);
	txtrTheMelghatIs.setEditable(false);
	
	JLabel lb1 = new JLabel("");
	ImageIcon img= new ImageIcon(this.getClass().getResource("Karh1.jpg"));
	lb1.setIcon(img);
	//lb1.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\121.jpg"));
	lb1.setBackground(Color.BLACK);
	lb1.setBounds(65, 291, 300, 168);
	panel.add(lb1);
	
	JLabel lb2 = new JLabel("");
	ImageIcon img1= new ImageIcon(this.getClass().getResource("Karh2.jpg"));
	lb2.setIcon(img1);
	//lb2.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\181.jpg"));
	lb2.setBackground(Color.BLACK);
	lb2.setBounds(431, 291, 300, 168);
	panel.add(lb2);
	
	JLabel lb3 = new JLabel("");
	ImageIcon img2= new ImageIcon(this.getClass().getResource("Karh3.jpg"));
	lb3.setIcon(img2);
	//lb3.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\141.jpg"));
	lb3.setBackground(Color.BLACK);
	lb3.setBounds(792, 291, 300, 168);
	panel.add(lb3);
	
	JLabel lb4 = new JLabel("");
	ImageIcon img3= new ImageIcon(this.getClass().getResource("Karh4.jpg"));
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
	txtrSemadohIsThe.setText("Tibetian Camp Gothangaon, Gondia, Maharashtra\r\n\r\n\r\nBy Air\r\nAir Facility Available upto Dr. BAI Airport, Nagpur (MS).\r\nBy Train\r\nFrom Nagpur Railway Station to Warthi Railway Station ( Bhandara). ( One hour Journey )\r\nBy Road\r\nNagpur - Pardi - Bhandara, NH-6. ( 60 KM )\r\n\r\n");
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
	txtrTheBestTime.setText(" Time :6 AM to 8 AM & 2:30 PM to 4:30 PM.\r\n\r\nEntry fees :- 1000/- per\r\nGypsy fees :- 2000/-\r\nGuide :-350/-\r\nCamera fees :-200/-\r\n\r\n\r\n(Karhandala, Gothangaon Gate) - Monday Closed\r\n(Pauni Gate) - Tuesday Closed");
	txtrTheBestTime.setLineWrap(true);
	txtrTheBestTime.setForeground(Color.BLACK);
	txtrTheBestTime.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrTheBestTime.setBackground(Color.WHITE);
	txtrTheBestTime.setBounds(777, 522, 697, 240);
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
		new KarhandlaWildlife();
		
	
	}
}
