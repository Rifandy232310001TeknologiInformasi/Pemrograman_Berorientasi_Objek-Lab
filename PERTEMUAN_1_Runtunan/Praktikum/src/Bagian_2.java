
import java.util.Scanner;

public class LuasSegitiga {

	public static void main(String[] args) {
		
		double luas; int alas, tinggi;
		
			Scanner input = new Scanner(System.in);
			
				System.out.println("== Program hitung luas Segitiga ==");
				System.out.println("== Input alas: ");
					
					alas = input.nextInt();
		
				System.out.println("Input tinggi: ");
		
					tinggi = input.nextInt();
					
						luas = Double.valueOf((alas * tinggi)/2);
					
							System.out.println("Luas = " + luas);
						
								input.close();	
		
	}
	
}
