

import java.io.*;
import java.util.Scanner;

public class Latihan_03 {
	
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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 2 [Latihan 03]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			Scanner input = new Scanner(System.in);
			
				System.out.println("Menu Sarapan:");
		        System.out.println("1. Nasi Goreng");
		        System.out.println("2. Bubur Ayam");
		        System.out.println("3. Soto Ayam");
		        
		        System.out.print("Masukkan pilihan menu: ");
		        int pilihan = input.nextInt();
		        
			        switch (pilihan) {
			        
		            case 1:
		            	
		                System.out.println("Anda memesan Nasi Goreng dengan harga Rp 22.000,-");
		                break;
		                
		            case 2:
		            	
		                System.out.println("Anda memesan Bubur Ayam dengan harga Rp 15.000,-");
		                break;
		                
		            case 3:
		            	
		                System.out.println("Anda memesan Soto Ayam dengan harga Rp 25.000,-");
		                break;
		                
		            default:
		            	
		                System.out.println("Maaf menu yang anda masukkan salah.");
		                
			        }
			        
			        input.close();
		
	}

}

























