import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;

public class info_page  {
	info_page(){
		JFrame f= new JFrame();
		f.setBackground(Color.WHITE);
		f.setTitle("Wildlife Tourism : Info page");
		f.getContentPane().setBackground(Color.BLACK);
	 f.setBounds(100,100,1550,830);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setBounds(66, 23, 300, 246);
	panel.setBackground(Color.WHITE);
	f.getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel lb = new JLabel("");
	ImageIcon img= new ImageIcon(this.getClass().getResource("111.jpg"));
	lb.setIcon(img);
	//lb.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\111.jpg"));
	lb.setBounds(0, 0, 300, 168);
	panel.add(lb);
	
	JTextArea txtrKarnalaBirdSanctuary = new JTextArea();
	txtrKarnalaBirdSanctuary.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new KarnalaWildlife();
			f.setVisible(false);
			
		}
	});
	txtrKarnalaBirdSanctuary.setForeground(Color.YELLOW);
	txtrKarnalaBirdSanctuary.setBackground(Color.BLACK);
	txtrKarnalaBirdSanctuary.setWrapStyleWord(true);
	txtrKarnalaBirdSanctuary.setLineWrap(true);
	txtrKarnalaBirdSanctuary.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrKarnalaBirdSanctuary.setText("     Karnala Bird Sanctuary");
	txtrKarnalaBirdSanctuary.setBounds(0, 170, 300, 76);
	panel.add(txtrKarnalaBirdSanctuary);
	txtrKarnalaBirdSanctuary.setEditable(false);
	
	JPanel panel_3 = new JPanel();
	panel_3.setBounds(426, 23, 300, 246);
	panel_3.setLayout(null);
	panel_3.setBackground(Color.WHITE);
	f.getContentPane().add(panel_3);
	
	JLabel lb1 = new JLabel("");
	ImageIcon img1= new ImageIcon(this.getClass().getResource("121.jpg"));
	lb1.setIcon(img1);
	//lb1.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\121.jpg"));
	lb1.setBounds(0, 0, 300, 168);
	panel_3.add(lb1);
	
	JTextArea txtrMelghatWildlifeSanctuary = new JTextArea();
	txtrMelghatWildlifeSanctuary.setBackground(Color.BLACK);
	txtrMelghatWildlifeSanctuary.setForeground(Color.YELLOW);
	txtrMelghatWildlifeSanctuary.addMouseListener(new MouseAdapter() {
		
		
		public void mouseClicked(MouseEvent e) {
			f.setVisible(false);
			new Melghat_info();
			
		
			
		}
	});
	txtrMelghatWildlifeSanctuary.setWrapStyleWord(true);
	txtrMelghatWildlifeSanctuary.setText("  Melghat Wildlife Sanctuary");
	txtrMelghatWildlifeSanctuary.setLineWrap(true);
	txtrMelghatWildlifeSanctuary.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrMelghatWildlifeSanctuary.setBounds(0, 170, 300, 76);
	panel_3.add(txtrMelghatWildlifeSanctuary);
	txtrMelghatWildlifeSanctuary.setEditable(false);
	
	JPanel panel_4 = new JPanel();
	panel_4.setBounds(791, 26, 300, 246);
	panel_4.setLayout(null);
	panel_4.setBackground(Color.WHITE);
	f.getContentPane().add(panel_4);
	
	JLabel lb2 = new JLabel("");
	ImageIcon img2= new ImageIcon(this.getClass().getResource("131.jpg"));
	lb2.setIcon(img2);
	//lb2.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\131.jpg"));
	lb2.setBounds(0, 0, 300, 168);
	panel_4.add(lb2);
	
	JTextArea txtrKoynaWildlifeSanctuary = new JTextArea();
	txtrKoynaWildlifeSanctuary.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new BorWildlife();
			f.setVisible(false);
		}
	});
	txtrKoynaWildlifeSanctuary.setForeground(Color.YELLOW);
	txtrKoynaWildlifeSanctuary.setBackground(Color.BLACK);
	txtrKoynaWildlifeSanctuary.setWrapStyleWord(true);
	txtrKoynaWildlifeSanctuary.setText("     Bor Wildlife Sanctuary");
	txtrKoynaWildlifeSanctuary.setLineWrap(true);
	txtrKoynaWildlifeSanctuary.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrKoynaWildlifeSanctuary.setBounds(0, 169, 300, 77);
	panel_4.add(txtrKoynaWildlifeSanctuary);
	txtrKoynaWildlifeSanctuary.setEditable(false); 
	
	JPanel panel_4_1 = new JPanel();
	panel_4_1.setLayout(null);
	panel_4_1.setBackground(Color.WHITE);
	panel_4_1.setBounds(1160, 26, 300, 246);
	f.getContentPane().add(panel_4_1);
	
	JLabel lb3 = new JLabel("");
	ImageIcon img3= new ImageIcon(this.getClass().getResource("141.jpg"));
	lb3.setIcon(img3);
	//lb3.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\141.jpg"));
	lb3.setBounds(0, 0, 300, 168);
	panel_4_1.add(lb3);
	
	JTextArea txtrBhimashankarWildlifeSanctuary = new JTextArea();
	txtrBhimashankarWildlifeSanctuary.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new BhimashankarWild();
			f.setVisible(false);
		}
	});
	txtrBhimashankarWildlifeSanctuary.setForeground(Color.YELLOW);
	txtrBhimashankarWildlifeSanctuary.setBackground(Color.BLACK);
	txtrBhimashankarWildlifeSanctuary.setWrapStyleWord(true);
	txtrBhimashankarWildlifeSanctuary.setText("     Bhimashankar Wildlife \r\n             Sanctuary");
	txtrBhimashankarWildlifeSanctuary.setLineWrap(true);
	txtrBhimashankarWildlifeSanctuary.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrBhimashankarWildlifeSanctuary.setBounds(0, 166, 300, 80);
	panel_4_1.add(txtrBhimashankarWildlifeSanctuary);
	txtrBhimashankarWildlifeSanctuary.setEditable(false);
	
	JPanel panel_1 = new JPanel();
	panel_1.setLayout(null);
	panel_1.setBackground(Color.WHITE);
	panel_1.setBounds(66, 290, 300, 246);
	f.getContentPane().add(panel_1);
	
	JLabel lb4 = new JLabel("");
	ImageIcon img4= new ImageIcon(this.getClass().getResource("161.jpg"));
	lb4.setIcon(img4);
	//lb4.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\161.jpg"));
	lb4.setBounds(0, 0, 300, 168);
	panel_1.add(lb4);
	
	JTextArea txtrPeriyarWildlifeSanctuary = new JTextArea();
	txtrPeriyarWildlifeSanctuary.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new TadobaWildlife();
			f.setVisible(false);
		}
	});
	txtrPeriyarWildlifeSanctuary.setForeground(Color.YELLOW);
	txtrPeriyarWildlifeSanctuary.setBackground(Color.BLACK);
	txtrPeriyarWildlifeSanctuary.setWrapStyleWord(true);
	txtrPeriyarWildlifeSanctuary.setText("   Tadoba  Wildlife Sanctuary");
	txtrPeriyarWildlifeSanctuary.setLineWrap(true);
	txtrPeriyarWildlifeSanctuary.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrPeriyarWildlifeSanctuary.setBounds(0, 170, 300, 76);
	panel_1.add(txtrPeriyarWildlifeSanctuary);
	txtrPeriyarWildlifeSanctuary.setEditable(false);
	
	JPanel panel_2 = new JPanel();
	panel_2.setLayout(null);
	panel_2.setBackground(Color.CYAN);
	panel_2.setBounds(66, 546, 300, 246);
	f.getContentPane().add(panel_2);
	
	JLabel lb9 = new JLabel("");
	ImageIcon img5= new ImageIcon(this.getClass().getResource("211.jpg"));
	lb9.setIcon(img5);
	//lb9.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\211.jpg"));
	lb9.setBounds(0, 0, 300, 168);
	panel_2.add(lb9);
	
	JTextArea txtrCorbettNationalPark = new JTextArea();
	txtrCorbettNationalPark.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new PenchWildlife();
			f.setVisible(false);
		}
	});
	txtrCorbettNationalPark.setForeground(Color.YELLOW);
	txtrCorbettNationalPark.setBackground(Color.BLACK);
	txtrCorbettNationalPark.setWrapStyleWord(true);
	txtrCorbettNationalPark.setText("Pench wildlife sanctuary");
	txtrCorbettNationalPark.setLineWrap(true);
	txtrCorbettNationalPark.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrCorbettNationalPark.setBounds(0, 167, 300, 79);
	panel_2.add(txtrCorbettNationalPark);
	txtrCorbettNationalPark.setEditable(false);
	
	JPanel panel_5 = new JPanel();
	panel_5.setLayout(null);
	panel_5.setBackground(Color.WHITE);
	panel_5.setBounds(426, 290, 300, 246);
	f.getContentPane().add(panel_5);
	
	JLabel lb5 = new JLabel("");
	ImageIcon img6= new ImageIcon(this.getClass().getResource("171.jpg"));
	lb5.setIcon(img6);
	//lb5.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\171.jpg"));
	lb5.setBounds(0, 0, 300, 168);
	panel_5.add(lb5);
	
	JTextArea txtrSundarbansNationalPark = new JTextArea();
	txtrSundarbansNationalPark.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new KarhandlaWildlife();
			f.setVisible(false);
		}
	});
	txtrSundarbansNationalPark.setBackground(Color.BLACK);
	txtrSundarbansNationalPark.setForeground(Color.YELLOW);
	txtrSundarbansNationalPark.setWrapStyleWord(true);
	txtrSundarbansNationalPark.setText(" Karhandla Wildlife Sanctuary");
	txtrSundarbansNationalPark.setLineWrap(true);
	txtrSundarbansNationalPark.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrSundarbansNationalPark.setBounds(0, 170, 300, 76);
	panel_5.add(txtrSundarbansNationalPark);
	txtrSundarbansNationalPark.setEditable(false);
	
	JPanel panel_6 = new JPanel();
	panel_6.setLayout(null);
	panel_6.setBackground(Color.WHITE);
	panel_6.setBounds(791, 290, 300, 246);
	f.getContentPane().add(panel_6);
	
	JLabel lb6 = new JLabel("");
	ImageIcon img7= new ImageIcon(this.getClass().getResource("181.jpg"));
	lb6.setIcon(img7);
	//lb6.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\181.jpg"));
	lb6.setBounds(0, 0, 300, 168);
	panel_6.add(lb6);
	
	JTextArea txtrKazirangaNationalPark = new JTextArea();
	txtrKazirangaNationalPark.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new RadhanagariWild();
			f.setVisible(false);
		}
	});
	txtrKazirangaNationalPark.setBackground(Color.BLACK);
	txtrKazirangaNationalPark.setForeground(Color.YELLOW);
	txtrKazirangaNationalPark.setWrapStyleWord(true);
	txtrKazirangaNationalPark.setText("  Radhanagari wildlife                            sanctuary ");
	txtrKazirangaNationalPark.setLineWrap(true);
	txtrKazirangaNationalPark.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrKazirangaNationalPark.setBounds(0, 170, 300, 76);
	panel_6.add(txtrKazirangaNationalPark);
	txtrKazirangaNationalPark.setEditable(false);
	
	JPanel panel_7 = new JPanel();
	panel_7.setLayout(null);
	panel_7.setBackground(Color.WHITE);
	panel_7.setBounds(1160, 290, 300, 246);
	f.getContentPane().add(panel_7);
	
	JLabel lb8 = new JLabel("l");
	ImageIcon img8= new ImageIcon(this.getClass().getResource("191.jpg"));
	lb8.setIcon(img8);
	//lb8.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\191.jpg"));
	lb8.setBounds(0, 0, 300, 168);
	panel_7.add(lb8);
	
	JTextArea txtrRanthamboreNationalPark = new JTextArea();
	txtrRanthamboreNationalPark.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new NavegaonWildlife();
			f.setVisible(false);
		}
	});
	txtrRanthamboreNationalPark.setForeground(Color.YELLOW);
	txtrRanthamboreNationalPark.setBackground(Color.BLACK);
	txtrRanthamboreNationalPark.setWrapStyleWord(true);
	txtrRanthamboreNationalPark.setText("Navegaon Wildlife sanctuary");
	txtrRanthamboreNationalPark.setLineWrap(true);
	txtrRanthamboreNationalPark.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrRanthamboreNationalPark.setBounds(0, 170, 300, 76);
	panel_7.add(txtrRanthamboreNationalPark);
	txtrRanthamboreNationalPark.setEditable(false);
	
	JPanel panel_9 = new JPanel();
	panel_9.setLayout(null);
	panel_9.setBackground(Color.WHITE);
	panel_9.setBounds(426, 546, 300, 246);
	f.getContentPane().add(panel_9);
	
	JLabel lb10 = new JLabel("");
	ImageIcon img9= new ImageIcon(this.getClass().getResource("221.jpg"));
	lb10.setIcon(img9);
	//lb10.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\221.jpg"));
	lb10.setBounds(0, 0, 300, 168);
	panel_9.add(lb10);
	
	JTextArea txtrKanhaNationalPark = new JTextArea();
	txtrKanhaNationalPark.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new NagziraWildlife();
			f.setVisible(false);
		}
	});
	txtrKanhaNationalPark.setForeground(Color.YELLOW);
	txtrKanhaNationalPark.setBackground(Color.BLACK);
	txtrKanhaNationalPark.setWrapStyleWord(true);
	txtrKanhaNationalPark.setText("Nagzira wildlife sanctuary");
	txtrKanhaNationalPark.setLineWrap(true);
	txtrKanhaNationalPark.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrKanhaNationalPark.setBounds(0, 170, 300, 76);
	panel_9.add(txtrKanhaNationalPark);
	txtrKanhaNationalPark.setEditable(false);
	
	JPanel panel_10 = new JPanel();
	panel_10.setLayout(null);
	panel_10.setBackground(Color.WHITE);
	panel_10.setBounds(791, 546, 300, 246);
	f.getContentPane().add(panel_10);
	
	JLabel lb11 = new JLabel("");
	ImageIcon img10= new ImageIcon(this.getClass().getResource("231.jpg"));
	lb11.setIcon(img10);
	//lb11.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\231.jpg"));
	lb11.setBounds(0, 0, 300, 168);
	panel_10.add(lb11);
	
	JTextArea txtrBandipurNationalPark = new JTextArea();
	txtrBandipurNationalPark.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new SagareshwarWildlife();
			f.setVisible(false);
		}
	});
	txtrBandipurNationalPark.setBackground(Color.BLACK);
	txtrBandipurNationalPark.setForeground(Color.YELLOW);
	txtrBandipurNationalPark.setWrapStyleWord(true);
	txtrBandipurNationalPark.setText("Sagareshwar Wildlife                        Sanctuary");
	txtrBandipurNationalPark.setLineWrap(true);
	txtrBandipurNationalPark.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrBandipurNationalPark.setBounds(0, 170, 300, 76);
	panel_10.add(txtrBandipurNationalPark);
	txtrBandipurNationalPark .setEditable(false);
	
	JPanel panel_8 = new JPanel();
	panel_8.setLayout(null);
	panel_8.setBackground(Color.WHITE);
	panel_8.setBounds(1160, 546, 300, 246);
	f.getContentPane().add(panel_8);
	
	JLabel lb12 = new JLabel("");
	ImageIcon img12= new ImageIcon(this.getClass().getResource("151.jpg"));
	lb12.setIcon(img12);
	//lb12.setIcon(new ImageIcon("C:\\Users\\vedang mule\\eclipse-workspace\\Tourism\\img\\151.jpg"));
	lb12.setBounds(0, 0, 300, 168);
	panel_8.add(lb12);
	
	JTextArea txtrBandhavgarhNationalPark = new JTextArea();
	txtrBandhavgarhNationalPark.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			new SanjayGandhi();
			f.setVisible(false);
		}
	});
	txtrBandhavgarhNationalPark.setForeground(Color.YELLOW);
	txtrBandhavgarhNationalPark.setBackground(Color.BLACK);
	txtrBandhavgarhNationalPark.setWrapStyleWord(true);
	txtrBandhavgarhNationalPark.setText("Sanjay Gandhi national park");
	txtrBandhavgarhNationalPark.setLineWrap(true);
	txtrBandhavgarhNationalPark.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
	txtrBandhavgarhNationalPark.setBounds(0, 170, 300, 76);
	panel_8.add(txtrBandhavgarhNationalPark);
	f.setVisible(true);
	txtrBandhavgarhNationalPark.setEditable(false);
	
	JMenuBar mb= new JMenuBar();
	mb.setBackground(new Color(135, 206, 250));
	f.setJMenuBar(mb);
	JMenu mnBack=new JMenu("Back");
	mnBack.addMenuListener(new MenuListener() {
		public void menuCanceled(MenuEvent e) {
		}
		public void menuDeselected(MenuEvent e) {
		}
		public void menuSelected(MenuEvent e) {
			new HomeA();
			f.setVisible(false);
		}
	});
	mnBack.setFont(new Font("Arial", Font.BOLD, 14));
	f.setVisible(true);
	mb.add(mnBack);
	
	}

	
	public static void main(String[] args) {
		new info_page();
		
	}
}


