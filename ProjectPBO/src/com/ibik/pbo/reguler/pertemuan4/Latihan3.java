package com.ibik.pbo.reguler.pertemuan4;

public class Latihan3 {

	public static void main(String[] args) {
		int row =2, column=2;
		int x[][] = new int[row][column];
		
		//input by index
		x[0][0] = 1;
		x[0][1] = 2;
		x[1][0] = 3;
		x[1][1] = 4;
		
		//input by loop
		for (int i = 0; i < x.length; i++) { 
			for (int j = 0; j < x[0].length; j++) {
				x[i][j] = i*j;
			}
		}
		
		//output
		System.out.println("=Output by index=");
		System.out.println("x[1][0]" + x[1][0]);
		
		System.out.println("=Output by loop=");
		for (int i = 0; i < row; i++) { //loop untuk baris
			for (int j = 0; j < column; j++) { //loop untuk kolum
				System.out.println(x[i][j]);
			}
		}
		
		System.out.println("Total x baris="+ x.length );
		System.out.println("Total x kolum="+ x[0].length );
		
		
	}

}
