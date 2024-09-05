

import java.io.*;

public class Latihan_07 {

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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 1 [Latihan 07]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			String npm = ANSI_YELLOW + "242410008" + ANSI_RESET;
	        String namaLengkap = ANSI_YELLOW + "Houshou Marin" + ANSI_RESET;
	        String namaKelas = ANSI_YELLOW + "IT - 24 - PKSJ" + ANSI_RESET;
	        
	        int semester = 7;
	        double ipk = 3.86;
	        
		        System.out.println(ANSI_CYAN + "\nNPM         : " + npm + ANSI_RESET);
		        System.out.println(ANSI_CYAN + "\nNama Lengkap: " + namaLengkap + ANSI_RESET);
		        System.out.println(ANSI_CYAN + "\nNama Kelas  : " + namaKelas + ANSI_RESET);
		        System.out.println(ANSI_CYAN + "\nSemester    : " + semester + ANSI_RESET);
		        System.out.println(ANSI_CYAN + "\nIPK         : " + ipk + ANSI_RESET);
		
	}
	
}

















