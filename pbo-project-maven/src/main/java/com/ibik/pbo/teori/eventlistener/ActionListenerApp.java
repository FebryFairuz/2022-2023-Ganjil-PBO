package com.ibik.pbo.teori.eventlistener;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ActionListenerApp extends JFrame implements ActionListener{
    private JTextField txtName;
    private JButton btnAdd,btnClear;

    ActionListenerApp(){
        setVisible(true);
        pack();
        setTitle("Contoh Action Listener");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);
        setLayout(new GridLayout(0,1));
        initialize(this);
    }

    public static void main(String[] args) {
        new ActionListenerApp();
    }

    private void initialize(ActionListenerApp frame) {
        JLabel lblName = new JLabel();
        lblName.setText("Enter your name:");
        frame.add(lblName);

        txtName = new JTextField();
        frame.add(txtName);

        JPanel pnlBtn = new JPanel();
        pnlBtn.setLayout(new GridLayout());

        btnAdd = new JButton("Save");
        btnAdd.addActionListener(frame);
        pnlBtn.add(btnAdd);

        btnClear = new JButton("Clear");
        btnClear.addActionListener(frame);
        pnlBtn.add(btnClear);

        frame.add(pnlBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAdd){
            JOptionPane.showMessageDialog(null,
                                          "Your name is "+txtName.getText());
        }else if(e.getSource() == btnClear){
            txtName.setText("");
        }
    }
}
