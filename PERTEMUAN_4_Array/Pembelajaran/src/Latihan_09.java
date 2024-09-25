import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan_09 {
    public static void main(String[] args) {
   
        ArrayList<Integer> array = new ArrayList<>();
        
    
        int jumlahArray = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah array:"));
        

        for (int i = 0; i < jumlahArray; i++) {
            array.add(Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka ke-" + i + ":")));
        }

  
        int max = array.get(0);
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }

       
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.size(); i++) {
            output.append("x[").append(i).append("]=").append(array.get(i)).append("\n");
        }
        output.append("Nilai terbesar adalah ").append(max).append("\n");
        output.append("Nilai terkecil adalah ").append(min);

        JOptionPane.showMessageDialog(null, output.toString(), "Output ArrayList", JOptionPane.INFORMATION_MESSAGE);
    }
}
