package com.ibik.pbo.reguler.pertemuan3;
//shepilla ghalia 212310042
import java.util.Scanner;

public class Latihan01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner input = new Scanner(System.in);
		System.out.print("masukan nilai = ");
		x = input.nextInt();
		
		System.out.println("selection if");
		if (x%2 == 0) {
			System.out.println("bilangan genap");
		} else {
			System.out.println("bilangan ganjil");
		}
		System.out.println("nested if");
		if(x > 0 && x <= 5) {
			System.out.println("diantara 1 sampai 5");
		} else if(x > 5 && x <= 10) {
			System.out.println("diantara 6 sampai 10");
		} else {
			System.out.println("nilai"+x);
		}
		
		System.out.println("short if");
		String y=(x%2 == 0) ? "genap":"ganjil";
		System.out.println(x+"adalah bilangan"+y);
		
	}

}
