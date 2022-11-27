package com.ibik.pbo.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class SwingApp {
	
	SwingApp(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.pack();
		//frame.setLocationRelativeTo(null);
		frame.setSize(300,350);
		frame.setTitle("Contoh Form Input");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(frame);
	}
	
	public static void main(String[] args) {
		new SwingApp();
	}
	
	private void GenerateUI(JFrame frame) {
		
		JLabel labelUsername=new JLabel("Username:");    
		labelUsername.setBounds(20,20, 80,30); 
		
		final JTextField textUsername = new JTextField();  
		textUsername.setBounds(100,20, 160,30); 
		
		JLabel labelPass=new JLabel("Password:");    
		labelPass.setBounds(20,75, 80,30); 
		
		JPasswordField textPass = new JPasswordField();   
		textPass.setBounds(100,75,160,30);
		
		JLabel labelAddress=new JLabel("Address:");    
		labelAddress.setBounds(20,130, 80,30); 
		
		JTextArea textarea = new JTextArea();
		textarea.setBounds(100, 135, 160, 50);
		
		JButton button = new JButton("SUBMIT");  
		button.setBounds(20,220, 250,50); 
		
		frame.add(textPass); 
		frame.add(labelUsername); 
		frame.add(labelPass); 
		frame.add(labelAddress); 
		frame.add(button); 
		frame.add(textUsername);  
		frame.add(textarea);  
		
		frame.setLayout(null); 
	                
	}
}






















