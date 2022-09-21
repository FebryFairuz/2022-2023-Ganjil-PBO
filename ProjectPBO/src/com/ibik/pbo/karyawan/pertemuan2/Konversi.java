package com.ibik.pbo.karyawan.pertemuan2;

import java.util.Scanner;

// 212310001 - Zaki Aljabbar
// 212310053 - Emanuel Charel Alessando Soge
// 212310003 - Alfarizzy subhan
// 222310041 - Hapiz ilham maulana
// 212310027 - Muhammad Askah

public class Konversi {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Masukan Nilai Celcius : ");
		int celcius = input.nextInt();
		Konversi suhu = new Konversi();
		suhu.celciusToFahrenheit(celcius); 
		
		
		int reamur = celciusToReamur(celcius);
		System.out.println("Konversi dari celcius ke reamur");
		System.out.println("Hasil konversi = "+ reamur);
		
		int kelvin = celciusToKelvin(celcius);
		System.out.println("Konversi dari celcius ke kelvin");
		System.out.println("Hasil konversi = "+ kelvin);
		
		input.close();
	} 
	 void celciusToFahrenheit(int celcius){
		int fahrenheit = ((9/5)*celcius) + 32;
		System.out.println("Konversi dari celcius ke fahrenheit");
		System.out.println("Hasil konversi = " + fahrenheit);
	}
	static int celciusToReamur(int celcius){
		int reamur = (celcius*4/5);
		
		return reamur;
	}
	static int celciusToKelvin(int celcius){
		
		int kelvin = (celcius+273);
		return kelvin;
	}
}
