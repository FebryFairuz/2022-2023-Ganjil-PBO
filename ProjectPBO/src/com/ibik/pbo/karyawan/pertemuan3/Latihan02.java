package com.ibik.pbo.karyawan.pertemuan3;

import java.util.Scanner;

//21310016 Muhammad adrian yusna diaryana
//212310001 Zaki Aljabbar

public class Latihan02 {

	public static void main(String[] args) {
		Latihan02 func = new Latihan02();
		Scanner input = new Scanner(System.in);
		System.out.println("1. Mengurutkan angka");
		System.out.println("2. Bilangan Factorial ASC");
		System.out.println("3. Bilangan Factorial DESC");
		
		
		System.out.print("Pilih menu : ");
		int menu = input.nextInt();
		
		System.out.print("Masukan nilai X:");
		int x = input.nextInt();
		
		switch (menu) {
		case 1:
			loopNumber(x);
			break;
			
		case 2:
			func.ascFactorial(x);
			break;
			
		case 3:
			func.descFactorial(x);
			break;
			
		default:
			System.out.println("Menu tidak tersedia.");
			break;
		}	
		
		input.close();
		
	}
	
	
	static void loopNumber(int x) {
		for (int i = 1; i <= x; i++) {
			String Koma =  (i==x) ?"":",";
			System.out.print(i+Koma);
		}
	}

	void ascFactorial(int x) {
		int f = 1;
		for (int i = 1; i <= x; i++) {
			f = f * i;
			String Koma =  (i==x) ?" = "+f:" x ";
			System.out.print(i+Koma);
		}
	}
	
	void descFactorial(int x) {
		int f = 1;
		for (int i = x; i >= 1; i--) {
			f = f * i;
			String Koma =  (i==1) ?" = "+f:" x ";
			System.out.print(i+Koma);
		}
	}
}
