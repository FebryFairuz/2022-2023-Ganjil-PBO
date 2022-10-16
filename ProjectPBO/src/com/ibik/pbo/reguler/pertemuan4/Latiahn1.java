package com.ibik.pbo.reguler.pertemuan4;

public class Latiahn1 {

	public static void main(String[] args) {
		//identifier
		int jml_arr = 3;
		int x[] = new int[jml_arr];
		//int x[] = {1,2,3};
		
		//input value array by index
		// x[0] = 1;
		// x[1] = 2;
		// x[2] = 3;
		
		//input value by loop
		for (int i = 0; i < jml_arr; i++) {
			x[i] = i*5;
		}
		
		
		//output
		System.out.println("=Output by index=");
		System.out.println( "x[2]="+x[2] );
		
		x[2] = 30; 
		
		System.out.println("=Ouput by loop=");
		for (int i = 0; i < jml_arr; i++) {	
			System.out.println( "x["+i+"]="+x[i] );
		}
		
		System.out.println(x);
		String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat","Sabtu", "Minggu"};
		System.out.println("Total array hari="+ hari.length );
		System.out.println("Total array x="+ x.length );
		
		
	}

}
