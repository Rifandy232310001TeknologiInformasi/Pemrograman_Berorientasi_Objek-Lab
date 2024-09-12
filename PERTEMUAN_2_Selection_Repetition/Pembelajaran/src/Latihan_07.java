

import java.io.*;

public class Latihan_07 {

	public static final String ANSI_RESET = "\u001B[0m";
	
	public static final String ANSI_CYAN = "\u001B[33m";
	
	public static final String ANSI_YELLOW = "\u001B[32m";
	
	public class Resto {

	    private long harga;

	    public void chooseMenu(int pilihan) {
	    	
	        switch (pilihan) {
	        
	            case 1:
	            	
	                System.out.println("Anda memesan Nasi Goreng.");
	                break;
	                
	            case 2:
	            	
	                System.out.println("Anda memesan Bubur Ayam.");
	                break;
	                
	            case 3:
	            	
	                System.out.println("Anda memesan Soto Ayam.");
	                break;
	                
	            default:
	            	
	                System.out.println("Maaf, menu yang anda masukkan salah.");
	                break;
	                
	        }

	        setHarga(pilihan);
	        
	    }

	    private long getPrices(int pilihan) {
	    	
	        switch (pilihan) {
	        
	            case 1:
	            	
	                return 22000;
	                
	            case 2:
	            	
	                return 15000;
	                
	            case 3:
	            	
	                return 25000;
	                
	            default:
	            	
	                return 0;
	                
	        }
	        
	    }

	    private void setHarga(int pilihan) {
	    	
	        this.harga = getPrices(pilihan);
	        
	    }

	    public long getHarga() {
	    	
	        return harga;
	        
	    }
	    
	}

	
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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 2 [Latihan 07]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			Scanner input = new Scanner(System.in);
	        Resto resto = new Resto();
	        String pesanLagi;
	
	        do {
	        	
	            System.out.println("Menu Sarapan:");
	            System.out.println("1. Nasi Goreng");
	            System.out.println("2. Bubur Ayam");
	            System.out.println("3. Soto Ayam");
	
	            System.out.print("Masukkan pilihan menu: ");
	            int pilihan = input.nextInt();
	
	            resto.chooseMenu(pilihan);
	
		            if (resto.getHarga() > 0) {
		                System.out.println("Harga pesanan Anda adalah Rp " + resto.getHarga() + ",-");
		            }
		
		            System.out.print("Apakah Anda akan memesan kembali? [yes/no]: ");
		            pesanLagi = input.next();
		
		        } while (pesanLagi.equalsIgnoreCase("yes"));
		
		        System.out.println("Terima kasih telah memesan.");
		        input.close();
		
	}
	
}
























