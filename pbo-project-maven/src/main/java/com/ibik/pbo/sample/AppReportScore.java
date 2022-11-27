package com.ibik.pbo.sample;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppReportScore {

	public static void main(String[] args) {
		int jmlRow = 3;
		
		ArrayList<String> score_header = new ArrayList<>();
		score_header.add("Matakuliah");
		score_header.add("Mahasiswa");
		score_header.add("Nilai");
		
		ArrayList<String> matakuliah = new ArrayList<>();
//		for (int i = 0; i < jmlRow; i++) {
//			String valueMK = JOptionPane.showInputDialog(null, "Nama matakuliah","Data Matakuliah ke-"+i,JOptionPane.QUESTION_MESSAGE);
//			matakuliah.add(valueMK);
//		}
		matakuliah.add("Matematika");
		matakuliah.add("Inggris");
		matakuliah.add("Sunda");
		
		ArrayList<ArrayList<String>> scores = new ArrayList<ArrayList<String>>();
		
		for (int i = 0; i < matakuliah.size(); i++) {
			System.out.println("Matakuliah "+matakuliah.get(i));
			scores.add(new ArrayList<String>());
			ArrayList<ArrayList<String>> item = new ArrayList<ArrayList<String>>();
			for (int j = 0; j < jmlRow; j++) {
				for (int k = 0; k < jmlRow; k++) {
					item.add(new ArrayList<String>());
					if(k==0) { 
						item.get(j).add(k,matakuliah.get(i)); 
						System.out.println("["+j+"]["+k+"] = "+matakuliah.get(i));
					}else {
						String value = JOptionPane.showInputDialog(null, "Masukan "+score_header.get(k)+":", "Data "+matakuliah.get(i)+" ke-"+j, JOptionPane.QUESTION_MESSAGE);
						item.get(j).add(k,value);
						System.out.println("["+j+"]["+k+"] = "+value);
					}
					
				}
			}
			System.out.println(item);
			System.out.println(item.size());
			if(item.size() > 0) {
				scores.addAll(item);
			}
			
			System.out.println("====");
		}
		
		System.out.println(scores);
		
		for (int i = 0; i < scores.size(); i++) {
			for (int j = 0; j < scores.size(); j++) {
				System.out.println(score_header.get(j)+":"+scores.get(i).get(j));
			}
		}
	}

}
