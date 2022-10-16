package com.ibik.pbo.reguler.pertemuan4;

import java.util.ArrayList;

public class Latihan5 {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		//add item
		x.add(1);
		x.add(2);
		x.add(3);
		
		//get item by index
		System.out.println("x[1]="+x.get(1));
		
		//update 
		x.set(1, 30);
		
		System.out.println("=before remove=");
		System.out.println(x);
		
		//remove by index
		x.remove(2);
		
		System.out.println("=after remove=");
		System.out.println(x);
		
		//remove all array
		x.clear();
		
		System.out.println("=remove all=");
		System.out.println(x);
		
		System.out.println("Total array X="+x.size());
	}
}
