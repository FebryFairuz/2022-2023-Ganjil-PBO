package com.ibik.pbo.teori;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainApp {

    int clicked = 1;
    JButton Button[];
	
	MainApp(){
		JFrame frame = new JFrame("Contoh Window Frame");
		frame.setVisible(true);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setSize(300,300);
		//frame.setTitle("App IBIK");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setResizable(true);
        GenerateUI(frame);
	}
	
    public static void main(String[] args) {
        new MainApp();
    }


    //MUHAMAD ILHAM FACHRIRIZAL
    private void GenerateUI(JFrame frame) {
        JPanel panelButton=new JPanel();
        panelButton.setLayout(new GridLayout(3,3));
        Button=new JButton[9];
        for( int i = 0 ;i< Button.length;i++) {
            Button[i] =new JButton();
            Button[i].addMouseListener(new MouseAdapter() {
				@Override
            	public void mouseClicked(MouseEvent evt) {
					AbstractButton EventSource = (AbstractButton)evt.getSource();
                    if(clicked%2 == 1){
                        EventSource.setText("X");
                    }else{
                        EventSource.setText("O");
                    }
                    clicked++;
                    checkWinner();
            	}
			});
            panelButton.add(Button[i]);
            
        }
        frame.add(panelButton);

    }

//Katarina Andrea Laurentia
    private void checkWinner() {
        String output = "";
        if(Button[0].getText().equals(Button[1].getText())&&Button[1].getText().equals(Button[2].getText())){
            output = Button[0].getText();
        }else if(Button[0].getText().equals(Button[3].getText())&&Button[3].getText().equals(Button[6].getText())){
            output = Button[0].getText();
        }
        
        if(output.length() > 0){
            JOptionPane.showMessageDialog(null,output+ " is winner!!");
        }

    }
}
