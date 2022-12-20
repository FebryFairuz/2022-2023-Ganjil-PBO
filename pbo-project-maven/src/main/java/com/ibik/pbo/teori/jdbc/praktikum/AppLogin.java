package com.ibik.pbo.teori.jdbc.praktikum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import java.awt.event.ActionEvent;

public class AppLogin extends JFrame {
//faturahman 212310018
	private JPanel contentPane;
	private JTextField textEmail;
	private JPasswordField passwordField;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppLogin frame = new AppLogin();
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
	public AppLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AppLogin.class.getResource("/com/ibik/pbo/teori/jdbc/praktikum/images/ibik-favicon.ico")));
		setTitle("Login to Portal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AppLogin.class.getResource("/com/ibik/pbo/teori/jdbc/praktikum/images/logo-ibik-white.jpeg")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		panel_3.add(lblNewLabel_1);
		
		textEmail = new JTextField();
		panel_3.add(textEmail);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		panel_3.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		panel_3.add(passwordField);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AppRegister().setVisible(true);
				dispose();
				
			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentsDao stdDao = new StudentsDao();
				String message = "";
				try {
					Students std = stdDao.findByAccount(textEmail.getText(), passwordField.getText());
					message = "Welcome to the apps "+std.getFirstname();
				} catch (Exception e1) {
					e1.printStackTrace();
					message = "Data not found.";
				}
				
				JOptionPane.showMessageDialog(null,message);
				
				new ScoreApps().setVisible(true);
				dispose();
			}
		});
		panel_2.add(btnNewButton_1);
	}

}
