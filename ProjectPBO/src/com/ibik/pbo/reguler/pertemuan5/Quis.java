package com.ibik.pbo.reguler.pertemuan5;

import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Quis {

    public static ArrayList<String> orders = new ArrayList<>();
    public static JOptionPane jop;
    public static boolean isExit = false;

    public static void main(String[] args) throws Exception {
    	Quis main = new Quis();
        jop = new JOptionPane();
        String[] menus = { "Input Order", "Tracking Order" };
        String labels = "Pilih menu dibawah ini:\n";
        
        for (int i = 0; i < menus.length; i++) {
        	labels += (i+1)+". "+menus[i]+"\n";
        }
        
        do {
	        String chooseMenu = jop.showInputDialog(null, labels);
	        
	        if(chooseMenu != null) {
		        switch (Integer.parseInt(chooseMenu)) {
				case 1:
					main.InputOrder();
					break;
				case 2:
					main.TrackingOrder();
					break;
		
				default:
					main.ExitApps("");
					break;
				}
	        }else {
	        	main.ExitApps("");
	        }
        }while(!isExit);
        
        
    }

    public void InputOrder() {
        jop = new JOptionPane();
        String[] field = { "Berat Barang (gr)", "Jarak Lokasi (km)" };
        for (int j = 0; j < field.length; j++) {
            String values = jop.showInputDialog(null, "Masukan " + field[j] + ":", "Input "+field[j],
                    jop.QUESTION_MESSAGE);
            orders.add(values);
        }
        
        CetakResi();
        
        
    }
    
    

    
    public void TrackingOrder() {
        /*if(...){
            jop = new JOptionPane();
            String resi = jop.showInputDialog(null, "Masukan resi:");
            if(resi.equals(orders.get(2))){
                CetakResi();
            }else{
                ExitApps("Data tidak ditemukan.\n");
            }
        }else{
            ExitApps("Data tidak ditemukan.\n");
        }  */      
    }
    
    

    public void CetakResi() {
        jop = new JOptionPane();
        
        int berat = Integer.parseInt(orders.get(0));
        int jarak = Integer.parseInt(orders.get(1));

        long TotalPay = CalculatePayment(berat, jarak);        
        String resi = "XYZ001";

        orders.add(2, ""+TotalPay );
        orders.add(3, resi);

        String label = "Berat paket: "+berat+"(gr) \n";
        label += "Jarak lokasi: "+jarak+"(km) \n";
        label += "Total Bayar: Rp "+TotalPay+" \n";
        label += "No Resi: "+resi+" \n";

        jop.showMessageDialog(null, label, "Info Order", jop.INFORMATION_MESSAGE);
    }

    
    public Long CalculatePayment(int berat, int jarak){
        long hargaBarang = 500, hargaJarak = 8000;
        long TotalPay = 0;
        TotalPay = hargaBarang + hargaJarak;
        
        return TotalPay;
    }

    
    public void ExitApps(String value){
        int isConfirm = jop.showConfirmDialog(null, value+"Apakah ingin keluar?", "Konfirmasi",jop.YES_NO_OPTION);
        isExit = (isConfirm == 1) ? false : true ;
    }
}
