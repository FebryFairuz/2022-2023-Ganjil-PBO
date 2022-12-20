package com.ibik.pbo.teori.eventlistener.modules;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

public class SampleMouseListener extends JFrame implements MouseInputListener{
    private JLabel lblImage;
    ImageIcon smile, angry, cry, surprised;
    
    SampleMouseListener(){
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
        new SampleMouseListener();
    }

    private void initialize(SampleMouseListener frame) {
        lblImage = new JLabel();
        lblImage.setVisible(true);
        lblImage.addMouseListener(frame);
        
        String packageName = "com/ibik/pbo/teori/eventlistener/modules/images/";
        URL smile_path = SampleMouseListener.class.getClassLoader().getResource(packageName+"smile.png");
        smile = new ImageIcon(smile_path);

        URL surprised_path = SampleMouseListener.class.getClassLoader().getResource(packageName+"surprised.png");
        surprised = new ImageIcon(surprised_path);

        URL cry_path = SampleMouseListener.class.getClassLoader().getResource(packageName+"cry.png");
        cry = new ImageIcon(cry_path);

        URL angry_path = SampleMouseListener.class.getClassLoader().getResource(packageName+"angry.png");
        angry = new ImageIcon(angry_path);

        lblImage.setIcon(smile);

        frame.add(lblImage);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
    	System.out.println("You just clicked");
    }


    @Override
    public void mousePressed(MouseEvent e) {
    	System.out.println("You just pressed");
    	lblImage.setIcon(angry);
    }


    @Override
    public void mouseReleased(MouseEvent e) {
    	System.out.println("You just released");
    	lblImage.setIcon(cry);
    }


    @Override
    public void mouseEntered(MouseEvent e) {
    	System.out.println("You just entered the frame");
    	lblImage.setIcon(surprised);
    }


    @Override
    public void mouseExited(MouseEvent e) {
    	System.out.println("You just exit the frame");
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
