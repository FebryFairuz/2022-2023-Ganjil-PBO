package com.ibik.pbo.reguler.pertemuan4;

import javax.swing.JOptionPane;

// Daphne Holy 212310030
// Raden Rayyan Pratama Rakhmadie = 212310034

public class Latihan02 {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String input = jop.showInputDialog(null, "Masukkan jumlah array");
		int parseInput= Integer.parseInt(input);
		int x[] = new int[parseInput];
		
		for(int i = 0; i < x.length; i++) {
			String inputArray = jop.showInputDialog(null, "Masukkan input array ke - " + (i+1), "Data ke - " + (i + 1), jop.QUESTION_MESSAGE);
			int pArray = Integer.parseInt(inputArray);
			x[i] = pArray;
		}
		
		String output = "";
		String outputTotal = "";
		int total = 0;
		
		for(int j = 0; j < x.length; j++) {
//			jop.showMessageDialog(null, "Array ke - " + (j + 1) + " = " + x[j], "Array", jop.INFORMATION_MESSAGE);
			output += "Array ke - " + (j + 1) + " = " + x[j] + "\n";
			
			total += x[j];
		}
		output += "\nTotal Array = " + total;
		
		jop.showMessageDialog(null, output, "Array", jop.INFORMATION_MESSAGE);
		
	}

}
