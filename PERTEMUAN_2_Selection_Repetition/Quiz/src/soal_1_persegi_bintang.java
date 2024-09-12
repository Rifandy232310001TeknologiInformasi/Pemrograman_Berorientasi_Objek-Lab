

import java.io.*;
import java.util.Scanner;

public class soal_1_persegi_bintang {

	public static final String ANSI_RESET = "\u001B[0m";
	
	public static final String ANSI_CYAN = "\u001B[33m";
	
	public static final String ANSI_YELLOW = "\u001B[32m";
	
	public static void main(String[] args) {
		
		System.out.println(ANSI_YELLOW + "\n\n========================================================================" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "\t\t\t      PERTEMUAN 2 [Selection Repetition]" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "========================================================================" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Nama Lengkap\t: RIFANDY ARNAS\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "NIM/NPM\t\t: 232310001\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Kelas\t\t: TI - 23 - PA (Lab 2)\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Tanggal\t\t: 11 September 2024\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Matkul\t\t: Pemrograman Berorientasi Objek" + ANSI_RESET);
		
		System.out.println("\n");
		
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 2 [Quiz-1 (nomor 1)]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Input besar persegi: ");
	        int besar = scanner.nextInt();
	        System.out.println("\n");
	        
		        for (int i = 1; i <= besar; i++) {
		        	
		            for (int j = 1; j <= besar; j++) {
		            	
		                System.out.print("*");
		                
		            }
		           
		            System.out.println();
		            
		        }
		        
		        scanner.close();
		
	}
	
}





















