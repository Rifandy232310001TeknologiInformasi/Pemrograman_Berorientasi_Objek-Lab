
import java.io.*;
import javax.swing.JOptionPane;

class Biodata {

    private String fullname;
    private int usia;
    private String alamat;

    public void setFullname(String fullname) {
    	
        this.fullname = fullname;
        
    }

    public void setUsia(int usia) {
    	
        this.usia = usia;
        
    }

    public void setAlamat(String alamat) {
    	
        this.alamat = alamat;
        
    }

    public String getBiodata() {
    	
        return "Fullname: " + fullname + "\nUsia: " + usia + "\nAlamat: " + alamat;
        
    }
    
}

public class Latihan_02 {

	public static final String ANSI_RESET = "\u001B[0m";
	
	public static final String ANSI_CYAN = "\u001B[36m";
	
	public static final String ANSI_YELLOW = "\u001B[31m";
	
	public static void main(String[] args) {
		
		System.out.println(ANSI_YELLOW + "\n\n========================================================================" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "\t\t\t      PERTEMUAN 3 [Swing 1]" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "========================================================================" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Nama Lengkap\t: RIFANDY ARNAS\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "NIM/NPM\t\t: 232310001\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Kelas\t\t: TI - 23 - PA (Lab 2)\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Tanggal\t\t: 18 September 2024\n" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "Matkul\t\t: Pemrograman Berorientasi Objek" + ANSI_RESET);
		
		System.out.println("\n");
		
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 3 [Latihan 02]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
		Biodata biodata = new Biodata();

	        String fullname = JOptionPane.showInputDialog("Masukkan Nama Lengkap:");
	        String usiaStr = JOptionPane.showInputDialog("Masukkan Usia:");
	        String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");
	
		        int usia = Integer.parseInt(usiaStr);
		
			        biodata.setFullname(fullname);
			        biodata.setUsia(usia);
			        biodata.setAlamat(alamat);
			
			        	JOptionPane.showMessageDialog(null, biodata.getBiodata());
		
	}
	
}

















