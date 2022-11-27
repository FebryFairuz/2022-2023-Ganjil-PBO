package com.ibik.pbo.swing;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TicTacToe{
	JFrame frame;
	JButton buttons[];
	int clicked = 0;
	
	TicTacToe(){
		frame = new JFrame("Tic Tac Toe");
		createUI(frame);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TicTacToe();
	}

	private void createUI(JFrame frame2) {
		int ordo = 9;
		
		JPanel buttonPanel = new JPanel();
		GridLayout gl =new GridLayout(3,3);
		buttonPanel.setLayout(gl);
		
		buttons = new JButton[ordo];
		for (int i = 0; i < ordo; i++) {
			buttons[i] = new JButton();
			buttons[i].addMouseListener(new MouseAdapter() {
				@Override
            	public void mouseClicked(MouseEvent evt) {
					AbstractButton EventSource = (AbstractButton)evt.getSource();
	            		if(clicked%2 == 0) {
	            			EventSource.setText("X");
	            		}else {
	            			EventSource.setText("O");
	            		}
	            		EventSource.setEnabled(false);
            		clicked++;
            		checkWinner();
            	}
			});
			buttonPanel.add(buttons[i]);
		}
		frame.add(buttonPanel);
	}
	
	public void checkWinner() {
		String value = "";
		//first condition
		if( buttons[0].getText().equals(buttons[1].getText()) && 
			buttons[1].getText().equals(buttons[2].getText()) ) { 
			value = buttons[0].getText() + " is winner!!";
			
		}else if( buttons[0].getText().equals(buttons[3].getText()) &&
				  buttons[3].getText().equals(buttons[6].getText())) {
			value = buttons[0].getText() + " is winner!!";
		}
		//dst
		
		if(value.length() > 0) {
			JOptionPane.showMessageDialog(null, value);
		}
	}

}
