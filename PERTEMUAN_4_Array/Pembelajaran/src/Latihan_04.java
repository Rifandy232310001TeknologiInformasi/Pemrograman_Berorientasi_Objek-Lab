import javax.swing.JOptionPane;

public class Latihan_04 {
    public static void main(String[] args) {

        int jumlahArray = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah array:"));
        int[] array = new int[jumlahArray];

   
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka ke-" + i + ":"));
        }

 
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

    
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            output.append("x[").append(i).append("]=").append(array[i]).append("\n");
        }
        output.append("Nilai terbesar adalah ").append(max).append("\n");
        output.append("Nilai terkecil adalah ").append(min);

        JOptionPane.showMessageDialog(null, output.toString(), "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}
