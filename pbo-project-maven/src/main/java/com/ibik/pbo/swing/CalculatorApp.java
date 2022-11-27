package com.ibik.pbo.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class CalculatorApp extends JFrame {
	
	CalculatorApp(){
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(450,300);
		setTitle("Calculator Apps");
		GenerateUI(this);
	}


	public static void main(String[] args) {
		new CalculatorApp();
	}
	
	private void GenerateUI(CalculatorApp frame) {
		BorderLayout bl = new BorderLayout();
		JPanel windowPanel = new JPanel();
		windowPanel.setLayout(bl);
				
		JTextField text1 = new JTextField();
		text1.setText(String.valueOf(0));
		windowPanel.add("North",text1);
		
		JPanel panelBtnNum = new JPanel();
		panelBtnNum.setLayout(new GridLayout(4,3));
		JButton buttons[] = new JButton[10];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(String.valueOf(i));
			panelBtnNum.add(buttons[i]);
		}
		
		JButton buttonClear = new JButton("C");
		//panelBtnNum.add(buttonClear);
		
		JButton buttonEqual = new JButton("=");
		//panelBtnNum.add(buttonEqual);
		windowPanel.add("Center",panelBtnNum);
		
		JPanel panelBtnOperand = new JPanel();
		panelBtnOperand.setLayout(new GridLayout(2,2));
		String operand[] = {"+","-","x","/"};
		JButton buttonOperand[] = new JButton[operand.length];
		for (int i = 0; i < operand.length; i++) {
			buttonOperand[i] = new JButton(operand[i]);
			panelBtnOperand.add(buttonOperand[i]);
		}
		windowPanel.add("East",panelBtnOperand);
		
		frame.add(windowPanel);		
	}

}
