package com.ibik.pbo.teori.eventlistener.modules;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class SampleActionListener extends JFrame implements ActionListener{
	
	private JButton btn;

	SampleActionListener(){
		setVisible(true);
        pack();
        setTitle("Contoh Action Listener pada Button");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new FlowLayout());
        
        btn = new JButton("Click me");
        btn.addActionListener(this);
        add(btn);
	}

	public static void main(String[] args) {
		new SampleActionListener();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			JOptionPane.showMessageDialog(null,"You just click this button");
		}
		
	}

}


















