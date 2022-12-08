package com.ibik.pbo.teori.eventlistener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

public class KeyListenerApps extends JFrame implements KeyListener{
    private ImageIcon rocket;
    private JLabel lblBox;

    KeyListenerApps(){
        setVisible(true);
        pack();
        setTitle("Contoh Key Listener");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);
        addKeyListener(this);
        getContentPane().setBackground(Color.BLUE);
        initialize(this);
    }

    public static void main(String[] args) {
        new KeyListenerApps();
    }

    private void initialize(KeyListenerApps frame) {
        lblBox = new JLabel();
        String packageName = "com/ibik/pbo/teori/eventlistener/images/";
        URL rocket_path = MouseListenerApps.class.getClassLoader().getResource(packageName+"rocket.png");
        rocket = new ImageIcon(rocket_path);
        lblBox.setIcon(rocket);
        lblBox.setBounds(0, 0, 50, 105);
        frame.add(lblBox);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                lblBox.setLocation(lblBox.getX()-10, lblBox.getY());
                break;
            case 'w':
                lblBox.setLocation(lblBox.getX(), lblBox.getY()-10); 
                break;
            case 's':
                lblBox.setLocation(lblBox.getX(), lblBox.getY()+10); 
                break;
            case 'd':
                lblBox.setLocation(lblBox.getX()+10, lblBox.getY()); 
                break;
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                lblBox.setLocation(lblBox.getX()-10, lblBox.getY());
                break;
            case 38:
                lblBox.setLocation(lblBox.getX(), lblBox.getY()-10); 
                break;
            case 40:
                lblBox.setLocation(lblBox.getX(), lblBox.getY()+10); 
                break;
            case 39:
                lblBox.setLocation(lblBox.getX()+10, lblBox.getY()); 
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You released key char: "+e.getKeyChar());
        System.out.println("You released key code: "+e.getKeyCode());
    }
}
