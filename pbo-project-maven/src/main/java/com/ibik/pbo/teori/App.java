package com.ibik.pbo.teori;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class App extends JFrame {
	
	App(){
		setVisible(true);
		pack();
		setSize(500,200);
		setTitle("Latihan 04");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		GenerateUI(this);
	}

	public static void main(String[] args) {
		new App();
	}

	private void GenerateUI(App frame) {
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

		subMenu[0].addActionListener(new ActionListener(){ //sub menu New File
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();	
				
				//memilih directory path untuk membuat file baru
				int isChoosen = fileChooser.showSaveDialog(null); 
				
				if(isChoosen == JFileChooser.APPROVE_OPTION){ //jika file terpilih
					File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
					System.out.println(file);
				}else{
					System.out.println("Tidak ada file yang dipilih");
				}
			}
		});

		subMenu[1].addActionListener(new ActionListener(){ //submenu Open File
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();

				fileChooser.setCurrentDirectory(new File("."));

				//memilih file yang akan dibuka
				int isChoosen = fileChooser.showOpenDialog(null); 
				
				if(isChoosen == JFileChooser.APPROVE_OPTION){ //jika file terpilih
					File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
					System.out.println(file);
				}else{
					System.out.println("Tidak ada file yang dipilih");
				}
			}
		});

		frame.setJMenuBar(menuBar);
	}

	private void ExpMenu(App frame) {
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		JMenuItem item1 = new JMenuItem("Item 1");
		JMenuItem item2 = new JMenuItem("Item 2");
		JMenuItem item3 = new JMenuItem("Item 3");

		fileMenu.add(item1);
		fileMenu.add(item2);
		fileMenu.add(item3);

		frame.setJMenuBar(menuBar);
	}

	private void ExpTable(App frame) {
		String data[][]={ {"212310018","FATHURAHMAN AL FARIDZI","B"},    
                          {"212310019","MUHAMMAD RAFI ZUHAIR ARTA","C"},    
                          {"212310020","MUHAMAD SUBHAN RIZKI AFIA","A"}};    
		String column[]={"Student ID","Name","Score"};         
		JTable jt=new JTable(data,column);    
		jt.setBounds(30,40,200,300);          
		JScrollPane sp=new JScrollPane(jt);  

		frame.add(sp);
	}

	private void ExpFormBio(App frame) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		frame.setContentPane(mainPanel);

		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		mainPanel.add(panel1,BorderLayout.NORTH);

		JLabel lblFullname = new JLabel("Fullname");
		lblFullname.setBounds(22, 23, 80, 16);
		panel1.add(lblFullname);
		
		JTextField textFullname = new JTextField();
		textFullname.setBounds(105, 18, 169, 30);
		textFullname.setText("Febry D F");
		panel1.add(textFullname);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(22, 69, 61, 16);
		panel1.add(lblEmail);
		
		JTextField textEmail = new JTextField();
		textEmail.setBounds(105, 64, 169, 30);
		panel1.add(textEmail);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(22, 109, 61, 16);
		panel1.add(lblPhone);
		
		JTextField txtPhone = new JTextField();
		txtPhone.setBounds(105, 104, 169, 30);
		panel1.add(txtPhone);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(22, 150, 61, 16);
		panel1.add(lblGender);

		JRadioButton radioGender1 = new JRadioButton("Female");
		radioGender1.setBounds(105, 145, 100, 30);
		panel1.add(radioGender1);
		JRadioButton radioGender2 = new JRadioButton("Male");
		radioGender2.setBounds(200, 145, 100, 30);
		panel1.add(radioGender2);

		ButtonGroup bg=new ButtonGroup();
		bg.add(radioGender1);bg.add(radioGender2);

		JLabel lblCityzen= new JLabel("Citizenship");
		lblCityzen.setBounds(22, 185, 100, 16);
		panel1.add(lblCityzen);

		String country[]={"Indonesia","India","Aus","U.S.A","England","Newzealand"}; 
		JComboBox selectCitizen = new JComboBox(country);
		selectCitizen.setBounds(105, 180, 169, 30);
		panel1.add(selectCitizen);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(105, 220, 169, 40);
		panel1.add(btnSubmit);

		JLabel lblCopyright = new JLabel("copyright IBIK @ 2022",SwingConstants.CENTER);
		lblCopyright.setBackground(Color.BLUE);
		lblCopyright.setSize(300, 50);
		//lblCopyright.setPreferredSize(panel1.getPreferredSize());
		mainPanel.add(lblCopyright,BorderLayout.SOUTH);

		frame.add(panel1);
	}

	private void ExpCheckBox(App frame) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		frame.setContentPane(mainPanel);

		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		mainPanel.add(panel1,BorderLayout.NORTH);

		JLabel lblUsername = new JLabel("Email");
		lblUsername.setBounds(22, 23, 80, 16);
		panel1.add(lblUsername);
		
		JTextField textUsername = new JTextField();
		textUsername.setBounds(105, 18, 169, 30);
		panel1.add(textUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(22, 69, 61, 16);
		panel1.add(lblPassword);
		
		JPasswordField textPassword = new JPasswordField();
		textPassword.setBounds(105, 64, 169, 30);
		panel1.add(textPassword);

		JCheckBox chkRemember = new JCheckBox("Remember password ?");
		chkRemember.setBounds(105, 90, 173, 40);
		panel1.add(chkRemember);

		JButton btnSubmit = new JButton("Login");
		btnSubmit.setBounds(105, 140, 169, 40);
		panel1.add(btnSubmit);

		JLabel lblCopyright = new JLabel("copyright IBIK @ 2022",SwingConstants.CENTER);
		lblCopyright.setBackground(Color.BLUE);
		lblCopyright.setSize(300, 50);
		mainPanel.add(lblCopyright,BorderLayout.SOUTH);

		frame.add(panel1);
	}

	private void ExpTextarea(App frame) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		JLabel lblWord = new JLabel("Masukan kalimat:");
		mainPanel.add(lblWord, BorderLayout.NORTH);

		String word = "Hai";
		JTextArea textWord = new JTextArea();
		textWord.setText(word);
		textWord.insert(" kamu nanya?", word.length());
		textWord.append("\nBertanya-tanya");
		mainPanel.add(textWord, BorderLayout.CENTER);
		frame.setContentPane(mainPanel);

		JLabel lblCopyright = new JLabel("copyright IBIK @ 2022",SwingConstants.CENTER);
		lblCopyright.setBackground(Color.BLUE);
		mainPanel.add(lblCopyright,BorderLayout.SOUTH);
	}

	private void ExpTextField(App frame) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		frame.setContentPane(mainPanel);

		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		mainPanel.add(panel1,BorderLayout.NORTH);

		JLabel lblFullname = new JLabel("Fullname");
		lblFullname.setBounds(22, 23, 80, 16);
		panel1.add(lblFullname);
		
		JTextField textFullname = new JTextField();
		textFullname.setBounds(105, 18, 169, 30);
		textFullname.setEditable(false);
		textFullname.setText("Febry D F");
		textFullname.setBackground(Color.LIGHT_GRAY);
		panel1.add(textFullname);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(22, 69, 61, 16);
		panel1.add(lblEmail);
		
		JTextField textEmail = new JTextField();
		textEmail.setBounds(105, 64, 169, 30);
		panel1.add(textEmail);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(22, 109, 61, 16);
		panel1.add(lblPhone);
		
		JTextField txtPhone = new JTextField();
		txtPhone.setBounds(105, 104, 169, 30);
		panel1.add(txtPhone);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(105, 152, 169, 40);
		panel1.add(btnSubmit);

		JLabel lblCopyright = new JLabel("copyright IBIK @ 2022",SwingConstants.CENTER);
		lblCopyright.setBackground(Color.BLUE);
		lblCopyright.setSize(300, 50);
		mainPanel.add(lblCopyright,BorderLayout.SOUTH);

		frame.add(panel1);
	}

	private void ExpPanel(App frame) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		frame.setContentPane(mainPanel);

		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		mainPanel.add(panel1,BorderLayout.NORTH);

		JButton button1 = new JButton();

		//button1.setText("Klik saya");
		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Anda baru saja klik button");
			}  
		});
		button1.setBounds(10,20, 475, 200);
		button1.setIcon(new ImageIcon("/Users/febryfairuz/Documents/IBIK/2022-2023/Ganjil/Pemograman-Berbasis-Object/Workspace/pbo-project-maven/src/main/java/com/ibik/pbo/teori/btn_click.jpeg"));
		panel1.add(button1);

		JLabel lblCopyright = new JLabel("copyright IBIK @ 2022",SwingConstants.CENTER);
		lblCopyright.setBackground(Color.BLUE);
		mainPanel.add(lblCopyright,BorderLayout.SOUTH);

		frame.add(panel1);
	}

	private void ExpLabel(App frame) {
		JLabel label1 = new JLabel("IBI Kesatuan");
		label1.setBounds(10,20, 150, 50);

		JLabel label2 = new JLabel();
		label2.setText("Teknologi Informasi");
		label2.setBounds(10,70, 150, 50);
		
		
		frame.add(label1);
		frame.add(label2);
		frame.setLayout(null);
	}

	private void ExpButton(App frame) {
		JButton button1 = new JButton();

		//button1.setText("Klik saya");
		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Anda baru saja klik button");
			}  
		});
		button1.setBounds(10,20, 475, 200);
		button1.setIcon(new ImageIcon("d:\\btn_click.jpeg"));
		
		frame.add(button1);
		frame.setLayout(null);
	}

	private void BorderLayout(App frame) {
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");

		// frame.add(button1);frame.add(button2);frame.add(button3);
		// frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

		frame.add(button1, BorderLayout.NORTH);
		frame.add(button2, BorderLayout.SOUTH);
		frame.add(button3, BorderLayout.EAST);
		frame.add(button4, BorderLayout.WEST);
		frame.add(button5, BorderLayout.CENTER);
	}

	private void GridLayout(App frame) {
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");

		frame.add(button1);frame.add(button2);frame.add(button3);frame.add(button4);
		frame.setLayout(new GridLayout());
	}

	private void NonLayout(App frame) {
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");

		button1.setBounds(25,30, 100, 50);
		button2.setBounds(250,200, 100, 50);
		button3.setBounds(200,30, 100, 50);
		button4.setBounds(25,100, 100, 50);

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.setLayout(null);
	}
}
