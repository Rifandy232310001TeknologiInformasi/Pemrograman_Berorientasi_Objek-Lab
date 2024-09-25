import javax.swing.JOptionPane;

public class Latihan_07 {
    public static void main(String[] args) {
 
        int[][] A = {{3, 5}, {9, 4}};
      
        int[][] B = {{4, 5}, {6, 3}};
        
     
        int[][] C = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

      
        StringBuilder output = new StringBuilder("Hasil dari Matriks C (A + B):\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output.append(C[i][j]).append(" ");
            }
            output.append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Output Matriks C", JOptionPane.INFORMATION_MESSAGE);
    }
}
