

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
	    
	    public int getSemester(int value) {
	    	
	        this.Semester = value;
	        
	        return this.Semester;
	        
	    }
	    
	    public float getGPA(float value) {
	    	
	        this.GPA = value;
	        
	        return this.GPA;
	        
	    }
	
}

public class Latihan_08 {

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
		System.out.println(ANSI_CYAN + "\t\t\t      PERTEMUAN 1 [Latihan 08]" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "========================================================================" + ANSI_RESET);
		
			Scanner input = new Scanner(System.in);
	        Students myBio = new Students();
	        
		        System.out.print("Masukkan NPM: ");
		        int npm = input.nextInt();
		        myBio.getNPM(npm);
		        
		        System.out.print("Masukkan Nama Lengkap: ");
		        input.nextLine(); // membersihkan buffer
		        String fullname = input.nextLine();
		        myBio.getFullname(fullname);
		        
		        System.out.print("Masukkan Nama Kelas: ");
		        String className = input.nextLine();
		        myBio.getClassName(className);
		        
		        System.out.print("Masukkan Semester: ");
		        int semester = input.nextInt();
		        myBio.getSemester(semester);
		        
		        System.out.print("Masukkan IPK: ");
		        float gpa = input.nextFloat();
		        myBio.getGPA(gpa);
		        
			        System.out.println("NPM: " + npm);
			        System.out.println("Nama Lengkap: " + fullname);
			        System.out.println("Nama Kelas: " + className);
			        System.out.println("Semester: " + semester);
			        System.out.println("IPK: " + gpa);
		
	}
	
}





















