
import java.io.*;
import javax.swing.JOptionPane;

class Biodata2 {
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

    public String getBiodata2() {
        return "Fullname: " + fullname + "\nUsia: " + usia + "\nAlamat: " + alamat;
    }
}

public class Latihan_04 {

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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 3 [Latihan 04]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
        Biodata2 biodata = new Biodata2();
        boolean isExit = false;

	        while (!isExit) {

	            String fullname;
	            
		            while (true) {
		            	
		                fullname = JOptionPane.showInputDialog("Masukkan Nama Lengkap:");
		                
			                if (fullname == null) {
			                	
			                    if (confirmExit()) return; 
			                    
			                } 
			                
			                else if (fullname.trim().isEmpty()) {
			                	
			                    JOptionPane.showMessageDialog(null, "Bagian fullname tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
			                
			                } 
			                
			                else {
			                	
			                    break;
			                    
			                }
		                
		            }

	            String usiaStr;
	            int usia = 0;
	            
		            while (true) {
		            	
		                usiaStr = JOptionPane.showInputDialog("Masukkan Usia:");
		                
			                if (usiaStr == null) {
			                	
			                    if (confirmExit()) return; 
			                    
			                } 
			                
			                else if (usiaStr.trim().isEmpty()) {
			                	
			                    JOptionPane.showMessageDialog(null, "Bagian usia tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
			                
			                } 
			                
			                else {
			                	
			                    try {
			                    	
			                        usia = Integer.parseInt(usiaStr);
			                        break;
			                        
			                    } 
			                    
			                    catch (NumberFormatException e) {
			                    	
			                        JOptionPane.showMessageDialog(null, "Isian usia harus angka", "Error", JOptionPane.ERROR_MESSAGE);
			                    
			                    }
			                    
			                }
		                
		            }

		        String alamat;
		        
		            while (true) {
		            	
		                alamat = JOptionPane.showInputDialog("Masukkan Alamat:");
		                
			                if (alamat == null) {
			                	
			                    if (confirmExit()) return; 
			                    
			                } 
			                
			                else if (alamat.trim().isEmpty()) {
			                	
			                    JOptionPane.showMessageDialog(null, "Bagian alamat tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
			                
			                } 
			                
			                else if (alamat.length() < 10) {
			                	
			                    JOptionPane.showMessageDialog(null, "Masukkan alamat minimum 10 karakter", "Warning", JOptionPane.WARNING_MESSAGE);
			                
			                } 
			                
			                else {
			                	
			                    break;
			                    
			                }
		                
		            }


		            biodata.setFullname(fullname);
		            biodata.setUsia(usia);
		            biodata.setAlamat(alamat);
		
		            JOptionPane.showMessageDialog(null, biodata.getBiodata2(), "Informasi Biodata", JOptionPane.INFORMATION_MESSAGE);

		            int exitOption = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
		            
			            if (exitOption == JOptionPane.YES_OPTION) {
			            	
			                isExit = true; 
			                
			            }
			            
	        }
		
	}
	
	private static boolean confirmExit() {
		
        int option = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
        
        return option == JOptionPane.YES_OPTION;
        
    }
	
}






















