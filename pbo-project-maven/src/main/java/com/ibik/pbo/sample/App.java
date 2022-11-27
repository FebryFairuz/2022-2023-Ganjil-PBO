package com.ibik.pbo.sample;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
	
    public static void main( String[] args ){
        ArrayList<String> book_header = new ArrayList<>();
        book_header.add("Nama Lengkap");
        book_header.add("Alamat");
        book_header.add("No Telp");
        
        ArrayList<ArrayList<String>> book_contact = new ArrayList<ArrayList<String>>();
        /*book_contact.add(new ArrayList<String>());
        book_contact.get(0).add(0,"Septian");
        book_contact.get(0).add(1,"Dramaga");
        book_contact.get(0).add(2,"+6289999");
        
        book_contact.add(new ArrayList<String>());
        book_contact.get(1).add(0,"Isnan");
        book_contact.get(1).add(1,"Manunggal");
        book_contact.get(1).add(2,"+62899997");*/
        
        //input
        for (int i = 0; i < book_header.size(); i++) {
			for (int j = 0; j < book_header.size(); j++) {
				String value = JOptionPane.showInputDialog(null,"Masukan "+book_header.get(j)+":","Data kontak ke-"+i, JOptionPane.QUESTION_MESSAGE);
				book_contact.add(new ArrayList<String>());
		        book_contact.get(i).add(j,value);
			}
		}
        
        //output
        String output = "";
        for (int i = 0; i < book_header.size(); i++) {
        	for (int j = 0; j < book_header.size(); j++) {
        		output += book_header.get(j)+": "+ book_contact.get(i).get(j)+"\n";
			}
        	output += "-----------\n";
		}
        JOptionPane.showMessageDialog(null, output);
        
    }
    
}
