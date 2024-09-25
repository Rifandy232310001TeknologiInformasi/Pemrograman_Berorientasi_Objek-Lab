import javax.swing.JOptionPane;

public class quiz_01 {
    public static void main(String[] args) {
     
        String nama = JOptionPane.showInputDialog("Masukkan Nama:");
        String usia = JOptionPane.showInputDialog("Masukkan Usia:");
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");
        
        
        String biodata = "Biodata:\n"
                       + "Nama: " + nama + "\n"
                       + "Usia: " + usia + "\n"
                       + "Alamat: " + alamat;
        
       
        JOptionPane.showMessageDialog(null, biodata, "Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}
