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

public class NavegaonWildlife  {
	NavegaonWildlife(){
		JFrame f= new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setTitle("Wildlife Tourism :NavegaonInfo page");
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
	txtrMelghatWildlifeSanctuary.setText(" Navegaon Wildlife Sanctuary ");
	txtrMelghatWildlifeSanctuary.setBounds(506, 23, 536, 48);
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
	txtrMelghatTigerReserve.setText("Navegaon National Park is a National park located in the Arjuni Morgaon subdivision of Gondia district in state of Maharashtra, India. The Dr Salim Ali Bird Sanctuary, Navegaon is home to almost 60% of the bird species found in entire Maharashtra. Every winter, flocks of migratory birds visit the lake. The national park has diverse type of vegetation ranging from dry mixed forest to moist forest. The forest type is 5 A/C3. Southern tropical dry deciduous forest");
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
	txtrGeography.setBounds(780, 70, 227, 31);
	panel.add(txtrGeography);
	 txtrGeography.setEditable(false);
	
	JTextArea textArea_1 = new JTextArea();
	textArea_1.setBackground(Color.BLACK);
	textArea_1.setBounds(780, 105, 120, 5);
	panel.add(textArea_1);
	
	JTextArea txtrTheMelghatIs = new JTextArea();
	txtrTheMelghatIs.setWrapStyleWord(true);
	txtrTheMelghatIs.setText("Navegaon National Park is located in the Bhandara (Gondia) district of the state of Maharashtra. The area around the lake is known as the Dr. Salim Ali Bird Sanctuary.\r\nFlowing through the Navegaon Wildlife Park is the beautiful Navegaon Lake that flows with crystal clear water. The area around the lake is known as the Dr. Salim Ali Bird Sanctuary.\r\nThere is also a high watch towers inside the wildlife park, from where you can get awesome views of the entire region. Total area of the park is 133.88 Km2.\r\nThe vegetation here is mainly of the Southern mixed dry deciduous type, comprising of Teak, Haldu, Jamun, Kawat, Mahua, Ain, Bhel & Bhor trees.\r\n");
	txtrTheMelghatIs.setLineWrap(true);
	txtrTheMelghatIs.setForeground(Color.BLACK);
	txtrTheMelghatIs.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrTheMelghatIs.setBackground(Color.WHITE);
	txtrTheMelghatIs.setBounds(777, 113, 697, 168);
	panel.add(txtrTheMelghatIs);
	txtrTheMelghatIs.setEditable(false);
	
	JLabel lb1 = new JLabel("");
	ImageIcon img= new ImageIcon(this.getClass().getResource("Nave1.jpg"));
	lb1.setIcon(img);
	//lb1.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\121.jpg"));
	lb1.setBackground(Color.BLACK);
	lb1.setBounds(65, 291, 300, 168);
	panel.add(lb1);
	
	JLabel lb2 = new JLabel("");
	ImageIcon img1= new ImageIcon(this.getClass().getResource("Nave2.jpg"));
	lb2.setIcon(img1);
	//lb2.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\181.jpg"));
	lb2.setBackground(Color.BLACK);
	lb2.setBounds(431, 291, 300, 168);
	panel.add(lb2);
	
	JLabel lb3 = new JLabel("");
	ImageIcon img2= new ImageIcon(this.getClass().getResource("Nave3.jpg"));
	lb3.setIcon(img2);
	//lb3.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\141.jpg"));
	lb3.setBackground(Color.BLACK);
	lb3.setBounds(792, 291, 300, 168);
	panel.add(lb3);
	
	JLabel lb4 = new JLabel("");
	ImageIcon img3= new ImageIcon(this.getClass().getResource("Nave4.jpg"));
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
	txtrSemadohIsThe.setText("1)Nagzira Wildlife Sanctuary.( 60 km)\r\n2)Itiadoh Dam. (20 km)\r\n3)Tibetan Camp. (15 km   )\r\n4)Pratapgad. ( 15 km  )\r\n\r\n\r\nBy Road. The nearest bus stand is Navegaon 10-km away from the park.\r\nBy Rail. Nearest railway station is Gondia railway station around 65 kms away.\r\nBy Air. The nearest airport is Nagpur at 150 kms.");
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
	txtrTheBestTime.setText("Weather : 26\u00B0 C\r\nTimings : 6:00 AM - 6:00 PM\r\n\r\nEntry Fee : Adult (above 18 years) \u2013 INR 30\r\nStudent (above five years) \u2013 INR 15\r\nAdult foreign national (above 18 years) \u2013 INR 60\r\nAdult international student (above five years) \u2013 INR 30\r\nFree entry for kids below the age of 5.\r\nEntry fee for vehicles\r\nJeep/ Car \u2013 INR 100 per vehicle\r\nMinibus \u2013 INR 150 per vehicle");
	txtrTheBestTime.setLineWrap(true);
	txtrTheBestTime.setForeground(Color.BLACK);
	txtrTheBestTime.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrTheBestTime.setBackground(Color.WHITE);
	txtrTheBestTime.setBounds(777, 532, 697, 240);
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
		new NavegaonWildlife();
		
	
	}
}
