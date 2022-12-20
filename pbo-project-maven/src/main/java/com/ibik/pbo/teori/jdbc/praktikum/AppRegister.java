package com.ibik.pbo.teori.jdbc.praktikum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ibik.pbo.teori.eventlistener.modules.praktikum.Login;
import com.ibik.pbo.teori.jdbc.dao.students.Students;
import com.ibik.pbo.teori.jdbc.dao.students.StudentsDao;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class AppRegister extends JFrame { //212310011 MUHAMAD FAUZAN RINDU MAULANA

	private JPanel contentPane;
	private JTextField textEmail;
	private JPasswordField passwordField;
	private JPanel panel;
	private JPasswordField passwordRetype;
	private JTextField textFirstname;
	private JTextField textMiddlename;
	private JTextField textLastname;
	private JTextField textBirthdate;
	private JTextField textNpm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppRegister frame = new AppRegister();
					frame.getContentPane().setBackground(Color.white);
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
	public AppRegister() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AppRegister.class.getResource("/com/ibik/pbo/teori/jdbc/praktikum/images/ibik-favicon.ico")));
		setTitle("Register to Portal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 255, 339);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AppRegister.class.getResource("/com/ibik/pbo/teori/jdbc/praktikum/images/logo-ibik-white.jpeg")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("NPM");
		panel_3.add(lblNewLabel_8);
		
		textNpm = new JTextField();
		panel_3.add(textNpm);
		textNpm.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		panel_3.add(lblNewLabel_1);
		
		textEmail = new JTextField();
		panel_3.add(textEmail);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		panel_3.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		panel_3.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Re-Password");
		panel_3.add(lblNewLabel_3);
		
		passwordRetype = new JPasswordField();
		panel_3.add(passwordRetype);
		
		JLabel lblNewLabel_4 = new JLabel("Firstname");
		panel_3.add(lblNewLabel_4);
		
		textFirstname = new JTextField();
		panel_3.add(textFirstname);
		textFirstname.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Middlename");
		panel_3.add(lblNewLabel_5);
		
		textMiddlename = new JTextField();
		panel_3.add(textMiddlename);
		textMiddlename.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Lastname");
		panel_3.add(lblNewLabel_6);
		
		textLastname = new JTextField();
		panel_3.add(textLastname);
		textLastname.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Birthdate");
		panel_3.add(lblNewLabel_7);
		
		textBirthdate = new JTextField();
		textBirthdate.setText("2000-12-17");
		panel_3.add(textBirthdate);
		textBirthdate.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AppLogin().setVisible(true);
				dispose();
			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValidatorForm();
			}
		});
		panel_2.add(btnNewButton_1);
	}
	
	private void ValidatorForm() {
		if((!textNpm.getText().isEmpty()) && (!textFirstname.getText().isEmpty()) && (!textMiddlename.getText().isEmpty()) && (!textLastname.getText().isEmpty()) && (!textEmail.getText().isEmpty()) && (!textBirthdate.getText().isEmpty()) && (!passwordField.getText().isEmpty())  && (!passwordRetype.getText().isEmpty()) ){
            if(!(Arrays.equals(passwordField.getPassword(), passwordRetype.getPassword()))) {
            	JOptionPane.showMessageDialog(null, "Password tidak sesuai");
            }else {
            	
            	try {
					Insert2database();
					JOptionPane.showMessageDialog(null, "Successfully saved");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Failed save. Error:"+e.getMessage());
					e.printStackTrace();
				}
            	
            }
        }else{
            Object message = "Silakan mengisi data dengan benar";
            JOptionPane.showMessageDialog(null, message, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } 
	}
	
	private void Insert2database() throws Exception {
		Students students = new Students();
		students.setNpm(textNpm.getText());
		students.setFirstname(textFirstname.getText());
		students.setMiddlename(textMiddlename.getText());
		students.setLastname(textLastname.getText());
		students.setEmail(textEmail.getText());
		students.setBirthdate(textBirthdate.getText());
		
		StudentsDao stdDao = new StudentsDao();
		stdDao.saved(students);
	}

}
