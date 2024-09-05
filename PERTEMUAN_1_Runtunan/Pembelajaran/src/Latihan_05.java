

import java.io.*;
import java.util.Scanner;

public class Latihan_05 {
	
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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 1 [Latihan 05]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			Scanner scanner = new Scanner(System.in);
			
				System.out.print(ANSI_CYAN + "\nMasukkan Usia: " + ANSI_RESET);
		        String usia = scanner.nextLine();
		        
		        System.out.print(ANSI_CYAN + "\nMasukkan Firstname: " + ANSI_RESET);
		        String firstname = scanner.nextLine();
		        
		        System.out.print(ANSI_CYAN + "\nMasukkan Lastname: " + ANSI_RESET);
		        String lastname = scanner.nextLine();
		        
		        System.out.print(ANSI_CYAN + "\nMasukkan NPM: " + ANSI_RESET);
		        String npm = scanner.nextLine();
		        
		        	String result = usia.concat(firstname).concat(lastname).concat(npm);
		        	
		        		System.out.println(ANSI_CYAN + "\nOutput: " + result + ANSI_RESET);
		        	
	}

}




















