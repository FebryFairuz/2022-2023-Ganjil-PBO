package com.ibik.pbo.teori.eventlistener.modules;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class SampleActionListener2 extends JFrame{
	
	private JButton btn;

	SampleActionListener2(){
		setVisible(true);
        pack();
        setTitle("Contoh Action Listener pada Button");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new FlowLayout());
        
        btn = new JButton("Go to other frame");
        btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OtherWindow othFrame = new OtherWindow();
				othFrame.setVisible(true);
				dispose();
			}
        	
        });
        add(btn);
	}

	public static void main(String[] args) {
		new SampleActionListener2();
	}
	
	class OtherWindow extends JFrame{
		OtherWindow(){
			setVisible(true);
	        pack();
	        setTitle("Other Window Frame");
	        setSize(300, 300);
	        setVisible(false);
	        setLayout(new FlowLayout());
	        
	        JButton btn = new JButton("Back to first window");
	        btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					SampleActionListener2 frame2 = new SampleActionListener2();
					frame2.setVisible(true);
					dispose();
				}
	        	
	        });
	        add(btn);
		}
	}
	
}


















