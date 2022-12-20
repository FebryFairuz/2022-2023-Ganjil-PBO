package com.ibik.pbo.teori.eventlistener.modules;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

public class SampleKeyListenerApps2 extends JFrame implements KeyListener{
    private ImageIcon rocket, rocket2;
    private JLabel lblBox;
    private SampleKeyListenerApps2 frame_;

    SampleKeyListenerApps2(){
        setVisible(true);
        pack();
        setTitle("Contoh Key Listener");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 200);
        //setLayout(null);
        addKeyListener(this);
        getContentPane().setBackground(Color.BLUE);
        initialize(this);
    }

    public static void main(String[] args) {
        new SampleKeyListenerApps2();
    }

    private void initialize(SampleKeyListenerApps2 frame) {
    	frame.setLayout(new GridLayout());
    	JPanel panelDraw = new JPanel();
    	panelDraw.setBackground(Color.BLUE);
        lblBox = new JLabel();
        String packageName = "/com/ibik/pbo/teori/eventlistener/modules/images/";
        URL rocket_path = SampleKeyListenerApps2.class.getResource(packageName+"rocket2.png");
        rocket = new ImageIcon(rocket_path);
        //rocket = new ImageIcon("/Users/febryfairuz/Documents/IBIK/2022-2023/Ganjil/Pemograman-Berbasis-Object/Workspace/pbo-project-maven/src/main/java/com/ibik/pbo/teori/eventlistener/modules/images/rocket2.png");
        //rocket2 = new ImageIcon("/Users/febryfairuz/Documents/IBIK/2022-2023/Ganjil/Pemograman-Berbasis-Object/Workspace/pbo-project-maven/src/main/java/com/ibik/pbo/teori/eventlistener/modules/images/rocket3.png");
        URL rocket2_path = SampleKeyListenerApps2.class.getResource(packageName+"rocket3.png");
        rocket2 = new ImageIcon(rocket2_path);
        
        lblBox.setIcon(rocket);
        lblBox.setBounds(0, 0, 105, 50);
        panelDraw.add(lblBox);
        
        frame.add(panelDraw);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    	int newX = lblBox.getX(), newY=lblBox.getY();
    	int frameHeight = this.getHeight();
    	int frameWidth = this.getWidth();
        switch (e.getKeyChar()) {
            case 'a':
            	if(lblBox.getX() < 0) {
            		newX = 0;
            		lblBox.setIcon(rocket);
            	}else {
            		newX = lblBox.getX()-10;
            	}
                lblBox.setLocation(newX, newY);
                break;
            case 'w':
            	if(lblBox.getY() < 0) {
            		newY = 0;
            	}else {
            		newY = lblBox.getY()-10;
            	}
            	lblBox.setLocation(newX, newY); 
                break;
            case 's':
            	if(lblBox.getY() + lblBox.getHeight() > frameHeight - lblBox.getHeight() ) {
            		newY = (frameHeight - lblBox.getHeight()) - lblBox.getHeight();
            	}else {
            		newY = lblBox.getY()+10;
            	}
                lblBox.setLocation(newX, newY); 
                break;
            case 'd':
            	if(lblBox.getX() + lblBox.getWidth() > frameWidth) {
            		newX = frameWidth - lblBox.getWidth();
            		lblBox.setIcon(rocket2);
            	}else {
            		newX = lblBox.getX()+10;
            	}
            	lblBox.setLocation(newX, newY);  
                break;
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    	int newX = lblBox.getX(), newY=lblBox.getY();
    	int frameHeight = this.getHeight();
    	int frameWidth = this.getWidth();
        switch (e.getKeyCode()) {
            case 37:
            	if(lblBox.getX() < 0) {
            		newX = 0;
            		lblBox.setIcon(rocket);
            	}else {
            		newX = lblBox.getX()-10;
            	}
                lblBox.setLocation(newX, newY);
                break;
            case 38:
            	if(lblBox.getY() < 0) {
            		newY = 0;
            	}else {
            		newY = lblBox.getY()-10;
            	}
            	lblBox.setLocation(newX, newY);  
                break;
            case 40:
            	if(lblBox.getY() + lblBox.getHeight() > frameHeight - lblBox.getHeight() ) {
            		newY = (frameHeight - lblBox.getHeight()) - lblBox.getHeight();
            	}else {
            		newY = lblBox.getY()+10;
            	}
                lblBox.setLocation(newX, newY);  
                break;
            case 39:
            	if(lblBox.getX() + lblBox.getWidth() > frameWidth) {
            		newX = frameWidth - lblBox.getWidth();
            		lblBox.setIcon(rocket2);
            	}else {
            		newX = lblBox.getX()+10;
            	}
            	lblBox.setLocation(newX, newY); 
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
