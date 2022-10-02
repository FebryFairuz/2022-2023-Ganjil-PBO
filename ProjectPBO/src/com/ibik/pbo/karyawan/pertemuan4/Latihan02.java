//Muhammad Firdaus - 212310036
//Septiawan Pratama - 212310055
package com.ibik.pbo.karyawan.pertemuan4;

import javax.swing.JOptionPane;

public class Latihan02 {
	
	static Latihan02 lat2 = new Latihan02();

	public static void main(String[] args) {
		boolean isExit = false;
		
		do {
			
			String label = "1.Mengurutkan Angka\n";
				   label += "2.Bilangan Faktorial ASC\n";
				   label += "3.Bilangan Faktorial DESC\n";
				   label += "Masukan Pilihan Menu : ";
				
			String menu = JOptionPane.showInputDialog(null,label,"Pilih Menu", JOptionPane.QUESTION_MESSAGE);
			//validasi window menu
			if(menu == null) { //cek apakah click tombol cancel pada window menu
				int isConfirm = lat2.confirmExit();
				isExit = (isConfirm == 1) ? false : true;
			}else if(lat2.isNumber(menu)){ //cek apakah input masukan berupa numerik
				int convertMenu = Integer.parseInt(menu); //conversi dari string ke int
				lat2.chooseMenu(convertMenu);
			}
			//end validasi window menu
			
		}while(!isExit);
		
	}
	
	public void chooseMenu(int menu) {
		int x = 0;
		switch (menu) {		
		case 1:
			x = lat2.inputNilaiX();
			if(x != 0)
				lat2.loopNumber(x);
			break;
			
		case 2:
			x = lat2.inputNilaiX();
			if(x != 0)
				lat2.ascFactorial(x);
			break;
			
		case 3:
			x = lat2.inputNilaiX();
			if(x != 0)
				lat2.descFactorial(x);
			break;
			
		default:
			JOptionPane.showMessageDialog(null,
										  "Menu tidak tersedia",
										  "Error",
										  JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
	
	public boolean isNumber(String number) { //cek apakah nilai input berupa numerik
		//error handler try_catch
		try {
			//statement logic jika benar
			Integer.parseInt(number);
			return true;
		} catch (Exception e) {
			//statement logic jika salah
			JOptionPane.showMessageDialog(null, "Masukan nilai numerik","Warning",JOptionPane.WARNING_MESSAGE);
			return false;
		}
	}
	
	public int inputNilaiX() {
		String nilai = JOptionPane.showInputDialog(null,"Masukan Nilai : ");
		if(isNumber(nilai)) {
			return Integer.parseInt(nilai);	
		}
		
		return 0;
	}
	
	public int confirmExit() {
		int isConfirm = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
		return isConfirm;
	}
	
	public void loopNumber(int x) {
		String result = "";
		for (int i = 1; i <= x; i++) {
			String Koma =  (i==x) ?"":",";
			result += i+Koma;
		}
		JOptionPane.showMessageDialog(null, result,"Hasil Loop Number",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void ascFactorial(int x) {
		String result = "";
		int f = 1;
		for (int i = 1; i <= x; i++) {
			f = f * i;
			String Koma =  (i==x) ?" = "+f:" x ";
			result += i + Koma; 
		}
		JOptionPane.showMessageDialog(null, result,"Hasil Bilangan Factorial ASC",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void descFactorial(int x) {
		String result = "";
		int f = 1;
		for (int i = x; i >= 1; i--) {
			f = f * i;
			String Koma =  (i==1) ?" = "+f:" x ";
			result += i + Koma;
		}
		JOptionPane.showMessageDialog(null, result,"Hasil Bilangan Factorial DESC",JOptionPane.INFORMATION_MESSAGE);
	}

}
