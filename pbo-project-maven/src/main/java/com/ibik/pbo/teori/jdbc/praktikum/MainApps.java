package com.ibik.pbo.teori.jdbc.praktikum;

import javax.swing.JOptionPane;

import com.ibik.pbo.teori.jdbc.ConnectionDB;

public class MainApps {
	MainApps(){
		
		ConnectionDB conn = new ConnectionDB();
    	try {
			conn.connect();
			new AppLogin().setVisible(true);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new MainApps();
	}
}
