import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.*;


import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class visitorMain {

	private JFrame frame;
	private JLabel one;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static ArrayList<String> cos=new ArrayList<String>();//An ArrayList for cosmetic
	private static ArrayList<String> med=new ArrayList<String>();//An ArrayList for medicine
	private static cosmetic c1;
	private static cosmetic c2;
	private static medicine m1;
	private static medicine m2;
	JComboBox<String> comboBox;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField textField_6;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
		
					c1=new cosmetic("Gel καθαρισμού",25,1);
					c2=new cosmetic("Moisture",32,1);
					m1=new medicine("Αντιβίωση",15,0.25);
					m2=new medicine("Παυσίπονο",12,1);
					cos.add(c1.name);
					cos.add(c2.name);
					med.add(m1.name);
					med.add(m2.name);
					
					visitorMain window = new visitorMain();
					window.frame.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void clock() {
		Calendar cal=new GregorianCalendar();
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int month=cal.get(Calendar.MONTH);//January equals to 0 in output!
		int year=cal.get(Calendar.YEAR);
		lblNewLabel_9.setText("Ημερομηνία: "+day+":"+month+":"+year);
		
	}


	/**
	 * Create the application.
	 */
	public visitorMain() {
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 803, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton button = new JButton("Καταχώρηση καλλυντικού");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText((String) comboBox.getSelectedItem());
				if((String) comboBox.getSelectedItem()=="Gel καθαρισμού")
					textField_1.setText(Integer.toString(c1.price(25, 2)));
				else if ((String) comboBox.getSelectedItem()=="Ενυδατική λοσιόν")
					textField_1.setText(Integer.toString(c1.price(30, 2)));
				else {textField_1.setText(Integer.toString(c1.price(10, 2)));
				}
				textField_2.setText(Integer.toString(c1.getCounterCosm()));
				
				
			}
		});
		button.setBounds(203, 330, 201, 23);
		frame.getContentPane().add(button);
		
		one = new JLabel("Επιλέξτε ένα καλλυντικό.");
		one.setBounds(21, 148, 176, 23);
		frame.getContentPane().add(one);
		
		textField = new JTextField();
		textField.setBounds(237, 214, 128, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(237, 245, 69, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(237, 276, 48, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gel \u03BA\u03B1\u03B8\u03B1\u03C1\u03B9\u03C3\u03BC\u03BF\u03CD", "\u0395\u03BD\u03C5\u03B4\u03B1\u03C4\u03B9\u03BA\u03AE \u03BB\u03BF\u03C3\u03B9\u03CC\u03BD"}));
		comboBox.setEditable(true);
		comboBox.setBounds(237, 167, 128, 20);
		frame.getContentPane().add(comboBox);
		
		lblNewLabel = new JLabel("\u03A4\u03B9\u03BC\u03AE \u03C3\u03B5 \u03B5\u03C5\u03C1\u03CE:");
		lblNewLabel.setBounds(157, 248, 81, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\u0395\u03BD\u03B1\u03BB\u03BB\u03B1\u03BA\u03C4\u03B9\u03BA\u03AC \u03C0\u03BB\u03B7\u03BA\u03C4\u03C1\u03BF\u03BB\u03BF\u03B3\u03AE\u03C3\u03C4\u03B5 \u03AD\u03BD\u03B1 \u03BD\u03AD\u03BF.");
		lblNewLabel_1.setBounds(21, 170, 247, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		label = new JLabel("\u03A0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1:");
		label.setBounds(157, 279, 67, 14);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03B1\u03C4\u03B5:");
		label_1.setBounds(157, 217, 81, 14);
		frame.getContentPane().add(label_1);
		
		lblNewLabel_2 = new JLabel("          \u039A\u0391\u039B\u039B\u03A5\u039D\u03A4\u0399\u039A\u0391");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(112, 114, 194, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("\u03A6\u0391\u03A1\u039C\u0391\u039A\u0391");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(547, 118, 128, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		//medicine components
		
		JLabel lblNewLabel_4 = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03AD\u03BD\u03B1 \u03C6\u03AC\u03C1\u03BC\u03B1\u03BA\u03BF");
		lblNewLabel_4.setBounds(393, 152, 151, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u0395\u03BD\u03B1\u03BB\u03BB\u03B1\u03BA\u03C4\u03B9\u03BA\u03AC \u03C0\u03BB\u03B7\u03BA\u03C4\u03C1\u03BF\u03BB\u03BF\u03B3\u03AE\u03C3\u03C4\u03B5 \u03AD\u03BD\u03B1 \u03BD\u03AD\u03BF:");
		lblNewLabel_5.setBounds(393, 170, 230, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u0391\u03BD\u03C4\u03B9\u03B2\u03AF\u03C9\u03C3\u03B7", "\u03A0\u03B1\u03C5\u03C3\u03AF\u03C0\u03BF\u03BD\u03BF"}));
		comboBox_1.setBounds(615, 167, 109, 20);
		frame.getContentPane().add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(615, 214, 104, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(615, 245, 69, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(615, 276, 54, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03B1\u03C4\u03B5:");
		lblNewLabel_6.setBounds(475, 220, 69, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u03A4\u03B9\u03BC\u03AE \u03C3\u03B5 \u03B5\u03C5\u03C1\u03CE:");
		lblNewLabel_7.setBounds(475, 248, 81, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u03A0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1:");
		lblNewLabel_8.setBounds(475, 279, 81, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		
	
		
		
		JButton btnNewButton = new JButton("Καταχώρηση φαρμάκου");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_3.setText((String) comboBox_1.getSelectedItem());
				if((String) comboBox_1.getSelectedItem()=="Αντιβίωση")
					textField_4.setText(Double.toString(m1.compute(0.25, 15)));
				else if ((String) comboBox_1.getSelectedItem()=="Παυσίπονο")
					{textField_4.setText(Double.toString(m1.compute(0.5, 12)));}
				else {textField_4.setText(Double.toString(m1.compute(0.35, 25)));
				}
				textField_6.setText(Double.toString(m1.getsimmetoxi())+" % συμμετοχή");
				textField_5.setText(Integer.toString(m1.getCounterMed()));
				if (m1.getCounterMed()>=10 ){
					JOptionPane.showMessageDialog(null,"Δεν υπάρχουν διαθέσιμα φάρμακα..");
					comboBox_1.removeAllItems();
				}
				else if (m1.getCounterMed()>=6)
					JOptionPane.showMessageDialog(null,"Η ποσότητα των φαρμάκων εξαντλείται");
			
			}
			});
		btnNewButton.setBounds(523, 330, 201, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0395\u039E\u039F\u0394\u039F\u03A3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(688, 11, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_9 = new JLabel("Date");
		lblNewLabel_9.setBounds(10, 0, 214, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("\u03A6\u0391\u03A1\u039C\u0391\u039A\u0395\u0399\u039F");
		lblNewLabel_10.setForeground(Color.GRAY);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_10.setBounds(279, 5, 206, 40);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(670, 276, 117, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u039C\u03B1\u03C1\u03AF\u03B1");
		rdbtnNewRadioButton.setBounds(21, 48, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton.setEnabled(true);
				button.setEnabled(false);
				comboBox_1.setEnabled(true);
				comboBox.setEnabled(false);
			}
			});
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u0395\u03BB\u03AD\u03BD\u03B7");
		rdbtnNewRadioButton_1.setBounds(21, 74, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton.setEnabled(false);
				button.setEnabled(true);
				comboBox_1.setEnabled(false);
				comboBox.setEnabled(true);
			}
			});

		ButtonGroup myButtonGroup = new ButtonGroup();
		myButtonGroup.add(rdbtnNewRadioButton);
		myButtonGroup.add(rdbtnNewRadioButton_1);
		
		
		
	}
}
