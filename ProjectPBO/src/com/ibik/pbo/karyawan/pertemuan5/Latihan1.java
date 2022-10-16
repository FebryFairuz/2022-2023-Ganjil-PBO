package com.ibik.pbo.karyawan.pertemuan5;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Latihan1 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String[] matakuliah = {"PBO","Lab PBO"};
		int jml_arr = matakuliah.length;
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		for (int i = 0; i < jml_arr; i++) {
			String value = jop.showInputDialog(null, "Masukan nilai "+matakuliah[i]+":",
			"Input data ke-"+i,
			jop.QUESTION_MESSAGE);
			x.add(Integer.parseInt(value));
		}
		
		//output
		String output = "";
		for (int i = 0; i < jml_arr; i++) {
			output += "Nilai matakuliah "+matakuliah[i]+"="+ x.get(i) +"\n";
		}
		
		jop.showMessageDialog(null, output,"Hasil Nilai", jop.INFORMATION_MESSAGE);
	}
	
	
	public void manualArray1Dimensi() {
		int jml_arr = 3;
		int x[] = new int[jml_arr];
		
		
		//input value by index
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		
		int y[] = {1,2,3};
		
		//input value by
		for (int i = 0; i < jml_arr; i++) {
			x[i] = i+5;
		}
		
		//output
		System.out.println("=Output by index=");
		System.out.println( "x[0]="+x[0] );
		System.out.println( "x[1]="+x[1] );
		System.out.println( "x[2]="+x[2] );
		
		System.out.println("=Output by loop=");
		for (int i = 0; i < jml_arr; i++) {
			System.out.println("x["+i+"]="+x[i]);
		}
	}
	
	public void arr1DimensiWithJOP() {
		JOptionPane jop = new JOptionPane();
		String inputJML = jop.showInputDialog(null, "Masukan jumlah array:");
		int jml_arr = Integer.parseInt(inputJML);
		int x[] = new int[jml_arr]; //jml_arr = 3
		
		for (int i = 0; i < jml_arr; i++) {
			String value = jop.showInputDialog(null, "Masukan angka:",
													 "Input data ke-"+i,
													 jop.QUESTION_MESSAGE);
			x[i] = Integer.parseInt(value);
		}
		
		//output
		String output = "";
		for (int i = 0; i < jml_arr; i++) {
			output += "x["+i+"]="+x[i]+"\n";
		}
		
		jop.showMessageDialog(null, output,"Hasil Array", jop.INFORMATION_MESSAGE);
		
	}
		
	public void arrMultidimensi() {
		JOptionPane jop = new JOptionPane();
		String baris = jop.showInputDialog(null, "Masukan jumlah baris:");
		String kolum = jop.showInputDialog(null, "Masukan jumlah kolum:");
		int row = Integer.parseInt(baris);
		int column = Integer.parseInt(kolum);
		int x[][] = new int[row][column];
		
		//INPUT
		for (int i = 0; i < row; i++) { //iterasi untuk Baris
			for (int j = 0; j < column; j++) { //iterasi untuk kolum
				String value = jop.showInputDialog(null, "Masukan angka:",
														 "Input data["+i+"]["+j+"]",
														 jop.QUESTION_MESSAGE);
				x[i][j] = Integer.parseInt(value);
			}
		}
		
		//OUTPUT
		String output = "";
		int total = 0;
		for (int i = 0; i < row; i++) { //iterate baris
			for (int j = 0; j < column; j++) { //iterate column
				output += "x["+i+"]["+j+"]="+x[i][j]+"\n";
				total += x[i][j];
			}
		}
		
		output += "Total array baris :"+ x.length +"\n";
		output += "Total array kolum :"+ x[0].length +"\n";
		output += "Sum = "+ total;
		
		jop.showMessageDialog(null, output,"Hasil Array", jop.INFORMATION_MESSAGE);
	}
	
	public void arrList() {
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		//input data / item
		x.add(1);
		x.add(3);
		x.add(5);
		
		//ouput all
		System.out.println(x);
		//ouput by index
		System.out.println("x[1]="+ x.get(1));
		System.out.println("Total array x = "+ x.size() );
		
		//update
		x.set(1, 30);
		System.out.println(x);
		
		//remove
		x.remove(1);
		System.out.println(x);
		x.clear(); //menghapus seluruh item yg ada pada array
		System.out.println(x);
		
		System.out.println("Total array x = "+ x.size() );
	}
}
