package com.ibik.pbo.teori;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class App extends JFrame {
	
	App(){
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,300);
		setTitle("App IBIK");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new App();
	}

}
