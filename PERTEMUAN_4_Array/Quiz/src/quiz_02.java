import java.util.Scanner;

public class quiz_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();
        
        
        for (int i = tinggi; i > 0; i--) {
            
            for (int j = 0; j < tinggi - i; j++) {
                System.out.print(" ");
            }
            
         
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            
      
            System.out.println();
        }
    }
}
