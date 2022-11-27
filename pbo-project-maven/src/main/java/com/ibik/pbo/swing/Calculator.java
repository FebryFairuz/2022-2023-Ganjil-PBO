package com.ibik.pbo.swing;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
	
    static JPanel windowPanel;
    static JTextField displayField;
    static JButton buttons[];
    static JButton buttonOperand[];
    static JPanel pl;

	public static void main(String[] args) {
	    JFrame frame = new JFrame("Calculator");
        createUI(frame);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
	
	public static void createUI(JFrame frame) {
		Calculator calculator = new Calculator();
		windowPanel= new JPanel();
        buttons = new JButton[10];

    // Set the layout manager for this panel
        BorderLayout bl = new BorderLayout();
        windowPanel.setLayout(bl);

    //Create the display field and place it in the North area of the window
        displayField = new JTextField(30);
        windowPanel.add("North",displayField);

    //Create button field and place it in the North area of the window
        for(int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttons[i].addActionListener(calculator);
        }
        
        String textOperand[] = {"+","-","/","x","="};
        buttonOperand = new JButton[textOperand.length];
        for (int i = 0; i < textOperand.length; i++) {
			buttonOperand[i] = new JButton(textOperand[i]);
			buttonOperand[i].addActionListener(calculator);
		}    
        
    //Create the panel with the GridLayout that will contain 12 buttons - 10 numeric ones, and button with the points
    //and the equal sign.
        pl = new JPanel ();
        GridLayout gl =new GridLayout(4,3);
        pl.setLayout(gl);
    //Add window controls to the panel pl.

        for(int i = 0; i < 10; i++) {
            pl.add(buttons[i]);
        }
        
        for (int i = 0; i < textOperand.length; i++) {
			pl.add(buttonOperand[i]);
		}

    //Add the panel pl to the center area of the window
        windowPanel.add("Center",pl);
        
        frame.setContentPane(windowPanel);
	}
	
	public void actionPerformed(ActionEvent e){
		String command = e.getActionCommand();
		
		System.out.println(command.charAt(0));
		if(command.charAt(0) == '=') {
			displayField.setText(evaluate(displayField.getText()));
		}else {
			displayField.setText(displayField.getText() + command);
		}
	}
	
	public static String evaluate(String expression) {
      char[] arr = expression.toCharArray();
      System.out.println(arr);
      
      String operand1 = "";String operand2 = "";String operator = "";
      double result = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
            if(operator.isEmpty()){
               operand1 += arr[i];
            }else{
               operand2 += arr[i];
            }
         }  

         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
            operator += arr[i];
         }
      }

      if (operator.equals("+"))
         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
      else if (operator.equals("-"))
         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
      else if (operator.equals("/"))
         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
      else
         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
      return operand1 + operator + operand2 + "=" +result;
   } 

}
