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

public class NagziraWildlife  {
	NagziraWildlife(){
		JFrame f= new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setTitle("Wildlife Tourism :NagziraInfo page");
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
	txtrMelghatWildlifeSanctuary.setText(" Nagzira Wildlife Sanctuary ");
	txtrMelghatWildlifeSanctuary.setBounds(506, 23, 525, 48);
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
	txtrMelghatTigerReserve.setText("Nagzira wildlife sanctuary is located between Bhandara-Gondia district of Maharashtra. Closest National Highway is NH-53. Nagzira Wildlife Sanctuary is locked in the arms of nature and adorned with a picturesque landscape, luxuriant vegetation and serves as a living outdoor museum to explore and appreciate nature. This sanctuary has a number of fish, 34 species of mammals, 166 species of birds, 36 species of reptiles and four species of amphibians.[1] The invertebrate fauna includes a number of butterfly and other insect species.");
	txtrMelghatTigerReserve.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrMelghatTigerReserve.setWrapStyleWord(true);
	txtrMelghatTigerReserve.setLineWrap(true);
	txtrMelghatTigerReserve.setBounds(50, 136, 697, 129);
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
	txtrTheMelghatIs.setText(" The sanctuary has 36 species of mammals and 14 out of these are endangered. There are around 49 species alone of butterfly along with common Mormon, common Indian crow, lime butterfly and black rajah. This small wildlife sanctuary covers an area of 152 sq km in the north east corner of Maharashtra in the Bhandara district. Nestled within the Vidarbha mountain range, it is often referred to as the 'green oases of the region. Its rocky and undulating terrain is covered with thick Teak forests that support healthy populations of some of India's most endangered floral and faunal biodiversity.");
	txtrTheMelghatIs.setLineWrap(true);
	txtrTheMelghatIs.setForeground(Color.BLACK);
	txtrTheMelghatIs.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrTheMelghatIs.setBackground(Color.WHITE);
	txtrTheMelghatIs.setBounds(777, 136, 697, 145);
	panel.add(txtrTheMelghatIs);
	txtrTheMelghatIs.setEditable(false);
	
	JLabel lb1 = new JLabel("");
	ImageIcon img= new ImageIcon(this.getClass().getResource("Ngz1.jpg"));
	lb1.setIcon(img);
	//lb1.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\121.jpg"));
	lb1.setBackground(Color.BLACK);
	lb1.setBounds(65, 291, 300, 168);
	panel.add(lb1);
	
	JLabel lb2 = new JLabel("");
	ImageIcon img1= new ImageIcon(this.getClass().getResource("Ngz2.jpg"));
	lb2.setIcon(img1);
	//lb2.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\181.jpg"));
	lb2.setBackground(Color.BLACK);
	lb2.setBounds(431, 291, 300, 168);
	panel.add(lb2);
	
	JLabel lb3 = new JLabel("");
	ImageIcon img2= new ImageIcon(this.getClass().getResource("Ngz3.jpg"));
	lb3.setIcon(img2);
	//lb3.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\141.jpg"));
	lb3.setBackground(Color.BLACK);
	lb3.setBounds(792, 291, 300, 168);
	panel.add(lb3);
	
	JLabel lb4 = new JLabel("");
	ImageIcon img3= new ImageIcon(this.getClass().getResource("Ngz4.jpg"));
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
	txtrSemadohIsThe.setText("\r\nOn a trip to Nagzira Wildlife, stop by Navegaon National Park (50 km), Itiadoh Dam (65 km), Tibetan Camp at Gothangaon (60 km) and Pratapgad (70 km).\r\n\r\nSakoli is the nearest bus stand to the Nagzira Wildlife Sanctuary that is located at about 22 kms from the Nagzira Wildlife Sanctuary.\r\n\r\nThe closest railway stations are Nagpur (122 kms ), Gondia (45 kms) and Bhandara (75 kms); from the Nagzira Wildlife Sanctuary. \r\n\r\nIf you want to go by flight, then you have to fly to Nagpur first, since Nagpur is the nearest airport to the Nagzira Sanctuary. ");
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
	txtrTheBestTime.setText("The is open for visitors from October to June. It is open from 1st October to 15th June, closing for the monsoons from 16th June to 30th September. Here best time to visit Nagzira is from November to April.");
	txtrTheBestTime.setLineWrap(true);
	txtrTheBestTime.setForeground(Color.BLACK);
	txtrTheBestTime.setFont(new Font("Georgia", Font.PLAIN, 16));
	txtrTheBestTime.setBackground(Color.WHITE);
	txtrTheBestTime.setBounds(777, 555, 697, 156);
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
		new NagziraWildlife();
		
	
	}
}
