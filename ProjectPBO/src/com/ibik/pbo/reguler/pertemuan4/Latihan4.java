package com.ibik.pbo.reguler.pertemuan4;

import javax.swing.JOptionPane;

public class Latihan4 {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String baris = jop.showInputDialog(null, "Masukan baris array");
		String kolum = jop.showInputDialog(null, "Masukan kolum array");
		
		int row =Integer.parseInt(baris), column=Integer.parseInt(kolum);
		int x[][] = new int[row][column];
		
		//input by loop
		for (int i = 0; i < x.length; i++) { 
			for (int j = 0; j < x[0].length; j++) {
				String value = jop.showInputDialog(null,"Masukan angka","Data["+i+"]["+j+"]",jop.QUESTION_MESSAGE);
				x[i][j] = Integer.parseInt(value);
			}
		}
		
		//output
		String output = "";
		for (int i = 0; i < row; i++) { //loop untuk baris
			for (int j = 0; j < column; j++) { //loop untuk kolum
				output += "x["+i+"]["+j+"]="+x[i][j]+"\n";
			}
		}
		
		jop.showMessageDialog(null, output);
		

	}

}
