package com.ibik.pbo.karyawan.pertemuan4;

import javax.swing.JOptionPane;

public class Latihan01 {

	public static void main(String[] args) {
		String NPM = JOptionPane.showInputDialog(null, //posisi window
						"Input NPM:", //label
						"Form Input", //title
						JOptionPane.ERROR_MESSAGE //icon
						);
		JOptionPane.showMessageDialog(null, "NPM :"+NPM);
		
		int isConfirm = JOptionPane.showConfirmDialog(null, 
							 "Apakah anda ingin keluar ?",
							 "Confirm", 
							 JOptionPane.YES_NO_OPTION //parameter tombol
							 );
		System.out.println(isConfirm);
	}

}
