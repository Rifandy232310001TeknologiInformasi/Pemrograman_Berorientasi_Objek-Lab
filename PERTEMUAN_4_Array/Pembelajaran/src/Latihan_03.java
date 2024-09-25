import javax.swing.JOptionPane;

public class Latihan_03 {
    public static void main(String[] args) {
   
        int jumlahArray = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah array:"));
        int[] array = new int[jumlahArray];


        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka ke-" + i + ":"));
        }

 
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            output.append("x[").append(i).append("]=").append(array[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, output.toString(), "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}
