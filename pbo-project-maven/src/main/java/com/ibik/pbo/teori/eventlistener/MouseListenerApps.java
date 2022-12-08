package com.ibik.pbo.teori.eventlistener;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.event.MouseInputListener;

public class MouseListenerApps extends JFrame implements MouseInputListener{
    private JLabel lblImage;
    ImageIcon smile, angry, cry, surprised;
    

    MouseListenerApps(){
        setVisible(true);
        pack();
        setTitle("Contoh Mouse Listener");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(520, 520);
        setLayout(new GridLayout());
        initialize(this);
    }


    public static void main(String[] args) {
        new MouseListenerApps();
    }


    private void initialize(MouseListenerApps frame) {
        lblImage = new JLabel();
        // lblImage.setBackground(Color.RED);
        // lblImage.setOpaque(true);
        lblImage.setVisible(true);
        lblImage.addMouseListener(frame);
        
        String packageName = "com/ibik/pbo/teori/eventlistener/images/";
        URL smile_path = MouseListenerApps.class.getClassLoader().getResource(packageName+"smile.png");
        smile = new ImageIcon(smile_path);

        URL surprised_path = MouseListenerApps.class.getClassLoader().getResource(packageName+"surprised.png");
        surprised = new ImageIcon(surprised_path);

        URL cry_path = MouseListenerApps.class.getClassLoader().getResource(packageName+"cry.png");
        cry = new ImageIcon(cry_path);

        URL angry_path = MouseListenerApps.class.getClassLoader().getResource(packageName+"angry.png");
        angry = new ImageIcon(angry_path);

        lblImage.setIcon(smile);

        frame.add(lblImage);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
    	
    }


    @Override
    public void mousePressed(MouseEvent e) {
    	lblImage.setIcon(angry);
    }


    @Override
    public void mouseReleased(MouseEvent e) {
    	lblImage.setIcon(cry);
    }


    @Override
    public void mouseEntered(MouseEvent e) {
    	lblImage.setIcon(surprised);
    }


    @Override
    public void mouseExited(MouseEvent e) {
    	lblImage.setIcon(smile);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
    }


    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
    }
}
