package com.ibik.pbo.reguler.pertemuan2;
import java.util.Scanner;
//Muhammad Alfan (212310017)
//Muhammad Rafi  (212310019)
//Muhamad Subhan (212310020)
//Katarina Andrea Laurentia (212310008)
//Cindy Kevina (212310021)

import javax.swing.JOptionPane;

class Dog{
	String breed;
	int age;
	String color;
	
	void barking() {
		System.out.println("woof..woof..");
	}
	
	int showAge() {
		age = 12;
		return age;
	}
	
	String showColor(String value, int x){
		color = value + x;
		return color;
	}
	
}

public class MainApps {

	public static void main(String[] args) {
		//object
		/*Dog mydog = new Dog();
		mydog.barking();
		int age = mydog.showAge();
		System.out.println("age dog = "+age);
		String color = mydog.showColor("black",3);
		System.out.println("color = "+color);
		
		MainApps main = new MainApps();
		int number = main.setNumber();
		
		float jumlah = setAngka(10,5);
		System.out.println("Call function by Object "+ number);
		System.out.println("Call function by static "+ jumlah);*/
		
		//inputStudents();
		
		String name = JOptionPane.showInputDialog(null,"Masukan nama:");
		System.out.println("Nama:"+name);
		JOptionPane.showMessageDialog(null, name);

	}
	
	int setNumber() {
		int jml = 2*2;
		return jml;
	}
	
	static float setAngka(int x, int y){
		
		return (x + y);
	}
	static void inputStudents() {
		Scanner input = new Scanner(System.in);
		Students myBio = new Students();
		System.out.println("Masukan Nama = ");
		String textnama = input.nextLine();
		String FullName = myBio.GetFullName(textnama);
		System.out.print("Masukan NPM = ");
		int textnpm = input.nextInt();
		int NPM = myBio.GetNPM(textnpm);
		outputStudents(NPM, FullName);
		
		input.close();
	}
	static void outputStudents(int NPM, String FullName) {
		System.out.println("=====OUTPUT=====");
		Students myBio = new Students();
		System.out.println("NPM Mahasiswa = " +NPM);
		System.out.println("Nama Mahasiswa = " +FullName);
		String ClassName = myBio.GetClassName("TI-21_PA");
		System.out.println("Kelas Mahasiswa = " +ClassName);
		int Semester = myBio.GetSemester(3);
		System.out.println("Semester = " +Semester);
		double GPA = myBio.GetGPA(4.0);
		System.out.println("IPK = " +GPA);	
	}
	
}
