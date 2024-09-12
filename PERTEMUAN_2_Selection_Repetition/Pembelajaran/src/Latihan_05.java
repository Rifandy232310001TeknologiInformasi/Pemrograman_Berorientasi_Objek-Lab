

import java.io.*;
import java.util.Scanner;

public class Latihan_05 {

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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 2 [Latihan 05 (NPM Ganjil -> WHILE)]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter the number of rows: ");
	        int n = scanner.nextInt();  
	        
	        int i = 1;
	        
		        while (i <= n) {
		        	
		            int j = 1; 
		            
		            while (j <= n) {
		            	
		                if (i == 1 || i == n || j == 1 || j == n || i == j || j == (n - i + 1)) {
		                	
		                    System.out.print("* "); 
		                    
		                } 
		                
		                else {
		                	
		                    System.out.print("  ");  
		                    
		                }
		                
		                j++; 
		                
		            }
		            
		            System.out.println(); 
		            
		            i++;  
		        }
		
		    
		        
	}
	
}






















