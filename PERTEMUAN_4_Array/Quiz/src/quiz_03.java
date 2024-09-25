import java.util.Scanner;

public class quiz_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

     
        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}
