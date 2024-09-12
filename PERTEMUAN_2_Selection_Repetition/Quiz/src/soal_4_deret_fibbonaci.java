

import java.io.*;
import java.util.Scanner;

public class soal_4_deret_fibbonaci {

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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 2 [Quiz-1 (nomor 4)]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			Scanner scanner = new Scanner(System.in);
			
				System.out.print("Jumlah deret Fibonacci yang diinginkan: ");
			
			        int jumlah = scanner.nextInt();
			        int fib1 = 0, fib2 = 1;
			        
			        System.out.print(fib1 + " " + fib2);
			        
				        for (int i = 2; i < jumlah; i++) {
				        	
				            int fibSelanjutnya = fib1 + fib2; 
				            System.out.print(" " + fibSelanjutnya);
				            
				            fib1 = fib2;
				            fib2 = fibSelanjutnya;
				            
				        }
	
				        System.out.println(); 
				        scanner.close();
		
	}
	
}


















