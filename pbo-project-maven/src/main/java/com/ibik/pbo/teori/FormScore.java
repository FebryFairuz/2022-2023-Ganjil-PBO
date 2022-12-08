package com.ibik.pbo.teori;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class FormScore extends JFrame {

	private JPanel contentPane;
	private JTextField txtNPM;
	private JTextField txtNama;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormScore frame = new FormScore();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormScore() {
		setTitle("Latihan 05");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,30));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Form Mahasiswa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNPM = new JLabel("NPM");
		panel.add(lblNPM);
		
		txtNPM = new JTextField();
		panel.add(txtNPM);
		txtNPM.setColumns(10);
		
		JLabel lblNama = new JLabel("Nama");
		panel.add(lblNama);
		
		txtNama = new JTextField();
		panel.add(txtNama);
		txtNama.setColumns(10);
		
		JLabel lblScore = new JLabel("Nilai");
		panel.add(lblScore);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdbtnA = new JRadioButton("A");
		panel_3.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		panel_3.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		panel_3.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		panel_3.add(rdbtnD);
		
		JRadioButton rdbtnE = new JRadioButton("E");
		panel_3.add(rdbtnE);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		panel_3.add(rdbtnF);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnA);
		bg.add(rdbtnB);
		bg.add(rdbtnC);
		bg.add(rdbtnD);
		bg.add(rdbtnE);
		bg.add(rdbtnF);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnSave = new JButton("Save");
		panel_4.add(btnSave);
		
		JButton btnDelete = new JButton("Delete");
		panel_4.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		panel_4.add(btnClear);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.EAST);
		
		String data[][]={ {"212310018","FATHURAHMAN AL FARIDZI","B"},    
                {"212310019","MUHAMMAD RAFI ZUHAIR ARTA","C"},    
                {"212310020","MUHAMAD SUBHAN RIZKI AFIA","A"}};    
		String column[]={"NPM","Nama","Nilai"}; 
		
		JTable jt=new JTable(data,column);    
		jt.setBounds(0,0,200,100);          
		JScrollPane sp=new JScrollPane(jt);
		panel_1.add(sp);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("FORM PENILAIAN MATAKULIAH PBO",SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		panel_2.add(lblNewLabel, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		
		String lblMenu[] = {"File","Edit","Help"};
		String lblSubMenuFile[] = {"New","Save","Exit"};

		JMenu menus[] = new JMenu[lblMenu.length];
		for (int i = 0; i < menus.length; i++) {
			menus[i] = new JMenu();
			menus[i].setText(lblMenu[i]);
			menuBar.add(menus[i]);
		}

		//add submenu for menu File
		JMenuItem subMenu[] = new JMenuItem[lblSubMenuFile.length];
		for (int i = 0; i < subMenu.length; i++) {
			subMenu[i] = new JMenuItem();
			subMenu[i].setText(lblSubMenuFile[i]);
			menus[0].add(subMenu[i]);
		}
		
		setJMenuBar(menuBar);
		
	}
}
