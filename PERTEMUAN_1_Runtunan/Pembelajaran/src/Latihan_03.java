

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan_03 {
	
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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 1 [Latihan 03]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
		System.out.println("\n");
		
			final int hargaSatuan = 6300;
	        final double diskon = 0.05;
	        
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Masukkan jumlah produk dibeli: ");
		        
		        int jumlahProduk = scanner.nextInt();
		        
			        LocalDateTime sekarang = LocalDateTime.now();
			        
			        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd MMMM yyyy (HH:mm)");
			        
			        String waktuSekarang = sekarang.format(formatWaktu);
			        	
			        	double totalDiskon = 0;
			        	int totalHarga = jumlahProduk * hargaSatuan;
			        	
				        	if (jumlahProduk % 3 == 0) {
				        		
				                totalDiskon = totalHarga * diskon;
				                
				            }
				        
				        double subTotal = totalHarga - totalDiskon;
			
		System.out.println("\n=========================================================");
        System.out.println("\t\tTOKO SERBAGUNA IBIK");
        System.out.println("=========================================================");
        System.out.println("Masukkan jumlah produk dibeli: " + jumlahProduk);
        System.out.println();
        System.out.println(waktuSekarang);
        System.out.println();
        System.out.println("=========================================================");
        System.out.println("   ITEM\t\tQTY\tHARGA\t\tTOTAL");
        System.out.println("=========================================================");
        System.out.printf("ROTI ENAK\t%d\tRp %,d\tRp %,d\n", jumlahProduk, hargaSatuan, totalHarga);
        System.out.println("=========================================================");
        System.out.printf("Diskon\t\t: %.0f%%\n", totalDiskon > 0 ? 5.0 : 0.0);
        System.out.printf("Sub Total\t: Rp %,.2f\n", subTotal);
				        	
		
	}

}


















