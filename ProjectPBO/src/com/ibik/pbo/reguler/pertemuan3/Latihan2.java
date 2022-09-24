//Frila Cahya Wardani - 212310014
package com.ibik.pbo.reguler.pertemuan3;

import java.util.Scanner;

public class Latihan2 {
	public static void main(String[] args) {
		int x;
		Scanner input = new Scanner(System.in);
		//System.out.print("masukan nilai = ");
		
		
		System.out.println("DAFTAR BILANGAN");
		System.out.println("1. Bilangan Ganjil/Genap");
		System.out.println("2. Exit");
		System.out.print("Masukkan menu : ");
		x = input.nextInt();
		
		switch (x) {
		case 1:
			String hasil = GanjilGenap(input);
			System.out.println(hasil);
			break;
			
		case 2:
			System.out.println("exit");
			break;
		
			default:
				System.out.println("salah");
		}
		
	}
	
	static String GanjilGenap (Scanner input) {
		System.out.print("Masukkan nilai = ");
		int x = input.nextInt();
		String y=(x%2 == 0) ? "genap":"ganjil";
		return x + " adalah " + y;
	}
}
