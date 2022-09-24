package com.ibik.pbo.reguler.pertemuan3;

import java.util.Scanner;

// Ferdy Apriliyanto - 212310012

public class Latihan03 {
	public static void main(String[] args) {
		int x;
		String jwb;
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("DAFTAR BILANGAN");
		System.out.println("1. FACTORIAL ASC");
		System.out.println("2. FACTORIAL DESC");
		System.out.print("Masukkan pilihan : ");
		x = input.nextInt();
		
		switch (x) {
		case 1:
			faktorial(input);
			break;
		case 2:
			faktorial_desc(input);
			break;
		
			default:
				System.out.println("salah");
		}
		
		System.out.println("\nApa ingin mengulang (Y/N) ? = ");
		jwb = input.nextLine();
		}while (jwb.equals("Y"));
		
//		for(int a = 1; a <= x; a++) {
//			String k = (a == x) ? "" : ",";
//			System.out.print(a + k);
//		}
	
	}
	
	static void faktorial(Scanner input) {
		int sum = 1;
		
		System.out.print("Masukkan angka = ");
		int f = input.nextInt();
		
		for (int i = 1; i <= f; i ++) {
			sum = sum * i;
			String k = (i == f ) ? " = " + sum: " x ";
			System.out.print(i + k);
		}
	}
	
	static void faktorial_desc(Scanner input) {
		int sum = 1;
		
		System.out.print("Masukkan angka = ");
		int f = input.nextInt();
		
		for (int i = f; i >= 1; i--) {
			sum = sum * i;
			String k = (i == 1 ) ? " = " + sum: " x ";
			System.out.print(i + k);
		}
	}
}
