

import java.io.*;

public class Latihan_02 {
	
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static final String ANSI_CYAN = "\u001B[36m";
	
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	public static double hitungLuasKerucut(double radius1, double garis_pelukis) {
		
		double luas = Math.PI * radius1 * (garis_pelukis + radius1);
		
		return luas;
		
	}
	
	public static double hitungKelilingKerucut(double diameter) {
		
		double keliling = Math.PI * diameter;
		
		return keliling;
		
	}
	
	
	public static double hitungVolumeTabung(int radius2, int tinggi2) {
		
        double volume = Math.PI * radius2 * radius2 * tinggi2;
        
        return volume;
        
    }
	
	public static void main(String[] args) {
		
		System.out.println(ANSI_YELLOW + "\n\n========================================================================" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "\t\t\t      PERTEMUAN 1 [Runtunan]" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "========================================================================" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Nama Lengkap\t: RIFANDY ARNAS\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "NIM/NPM\t\t: 232310001\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Kelas\t\t: TI - 23 - PA (Lab 2)\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Tanggal\t\t: 4 September 2024\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Matkul\t\t: Pemrograman Berorientasi Objek" + ANSI_RESET);
		
		System.out.println("\n");
		
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 1 [Latihan 02]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
			
			int radius1 = 15;
			int garis_pelukis = 24;
			
			int diameter = 25;
			
			int radius2 = 10;
	        int tinggi2 = 16;
	        
		        double luas = hitungLuasKerucut(radius1, garis_pelukis);
		        
		        double keliling = hitungKelilingKerucut(diameter);
		        
		        double volume = hitungVolumeTabung(radius2, tinggi2);
		        
		        	System.out.println(ANSI_CYAN + "Luas Kerucut\t: " + luas + ANSI_RESET);
		        	
		        	System.out.println(ANSI_CYAN + "\nKeliling Kerucut: " + keliling + ANSI_RESET);
		        	
	        		System.out.println(ANSI_CYAN + "\nVolume Tabung\t: " + volume + ANSI_RESET);
		
		
	}

}
