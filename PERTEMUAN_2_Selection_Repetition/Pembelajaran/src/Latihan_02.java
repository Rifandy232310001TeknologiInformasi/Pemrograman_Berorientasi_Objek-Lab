

import java.io.*;
import java.util.Scanner;

public class Latihan_02 {

	
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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 2 [Latihan 02]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			Scanner input = new Scanner(System.in);
	        System.out.print("Masukkan NPM: ");
	        int npm = input.nextInt();
	        
			        if (isPrime(npm)) {
			        	
			            System.out.println("Termasuk bilangan PRIMA");
			            
			        } 
			        
			        else {
			        	
			            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
			            
			        }
			        
			        input.close();
		
	}
	
	
	public static boolean isPrime(int number) {
		
		if (number < 2) {
			
            return false;
            
        }
		
        for (int i = 2; i <= Math.sqrt(number); i++) {
        	
            if (number % i == 0) {
            	
                return false;
                
            }
            
        }
        
        return true;
		
	}
	
}























