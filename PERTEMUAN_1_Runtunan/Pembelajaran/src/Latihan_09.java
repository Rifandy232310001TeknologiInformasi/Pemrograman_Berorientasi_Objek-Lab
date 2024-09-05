

import java.io.*;
import java.util.Scanner;

class Students {
	
	private String Fullname;
    private String ClassName;
    
	private int NPM;
    private int Semester;
    
    private float GPA;
    
	    public int getNPM(int value) {
	        this.NPM = value;
	        return this.NPM;
	    }
	    
	    public String getFullname(String value) {
	        this.Fullname = value;
	        return this.Fullname;
	    }
	    
	    public String getClassName(String value) {
	        this.ClassName = value;
	        return this.ClassName;
	    }
	    
	    public String getClassName(String value) {
	        this.ClassName = value;
	        return this.ClassName;
	    }
	    
	    public float getGPA(float value) {
	        this.GPA = value;
	        return this.GPA;
	    }
	
}

public class Latihan_09 {

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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 1 [Latihan 01]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			Scanner input = new Scanner(System.in);
	        Students member = new Students();
	        
		        System.out.print("Masukkan Nama Member: ");
		        String memberName = input.nextLine();
		        member.getFullname(memberName);
		        
		        	System.out.println("Member Name: " + memberName);
		
	}
	
}















