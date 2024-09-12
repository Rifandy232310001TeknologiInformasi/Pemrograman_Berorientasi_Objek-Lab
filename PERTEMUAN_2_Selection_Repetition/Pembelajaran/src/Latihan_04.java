

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Latihan_04 {

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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 2 [Latihan 04 (NPM Ganjil -> Descending)]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			Scanner scanner = new Scanner(System.in);
	        int number;
	        
		        do {
		        	
		            System.out.print("Masukkan angka (minimal 20): ");
		            number = scanner.nextInt();
		            
		        } while (number < 20);
	
		        ArrayList<Integer> factors = new ArrayList<>();
		        
			        for (int i = 1; i <= number; i++) {
			        	
			            if (number % i == 0) {
			            	
			                factors.add(i);
			                
			            }
			            
			        }
		
			        Collections.sort(factors, Collections.reverseOrder());
		
			        System.out.println("Faktor dari " + number + " secara Descending:");
			        
				        for (int factor : factors) {
				        	
				            System.out.print(factor + " ");
				            
				        }
		
	}
	
}
























