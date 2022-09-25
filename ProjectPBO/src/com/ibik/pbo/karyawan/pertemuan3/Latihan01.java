package com.ibik.pbo.karyawan.pertemuan3;

import java.util.Scanner;

public class Latihan01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan nilai X:");
		int x = input.nextInt();
		
		System.out.println("==Switch Case==");
		switch (x%2) {
		case 0:
			System.out.println("Genap");
			break;

		default:
			System.out.println("Ganjil");
			break;
		}
		
		input.close();
	}
	
	static void contohSelectionIF() {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan nilai X:");
		int x = input.nextInt();
		
		System.out.println("==SELECTION IF==");
		if( x%2 == 0 ) {
			System.out.println(x+" adalah bilangan genap");
		}else {
			System.out.println(x+" adalah bilangan ganjil");
		}
		
		System.out.println("==NESTED IF==");		
		if( (x > 1) && (x <= 5) ) {
			System.out.println(x+" termasuk nilai diantara 1-5");
		}else if( (x >= 6) && (x <= 10) ) {
			System.out.println(x+" termasuk nilai diantara 6-10");
		}else {
			System.out.println("Nilai X =" +x);
		}
		
		System.out.println("==SHORT IF==");
		String y = ( x%2 == 0 ) ? "genap" : "ganjil";
		System.out.println(x+" adalah bilangan "+y);
		
		System.out.print("Masukan nama:");
		String nama = input.next();
		if( nama.equals("febri") ) {
			System.out.println("Kamu admin");
		}
		
		input.close();
	}
}
