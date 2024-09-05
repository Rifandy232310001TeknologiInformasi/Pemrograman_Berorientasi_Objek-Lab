

import java.io.*;

public class Latihan_01 {
	
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static final String ANSI_CYAN = "\u001B[36m";
	
	public static final String ANSI_YELLOW = "\u001B[33m";
	
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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 1 [Latihan 01]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			double celsius = 25.0;
	        double fahrenheit = celsius * 9/5 + 32;
	        double reamur = celsius * 4/5;
	        double kelvin = celsius + 273.15;
	        
		        System.out.println(ANSI_CYAN + "Celsius\t\t: " + celsius + ANSI_RESET);
		        System.out.println(ANSI_CYAN + "\nFahrenheit\t: " + fahrenheit + ANSI_RESET);
		        System.out.println(ANSI_CYAN + "\nReamur\t\t: " + reamur + ANSI_RESET);
		        System.out.println(ANSI_CYAN + "\nKelvin\t\t: " + kelvin + ANSI_RESET);
		        
		
	}

}























