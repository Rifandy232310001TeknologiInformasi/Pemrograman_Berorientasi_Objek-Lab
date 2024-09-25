import javax.swing.JOptionPane;

public class Latihan_05 {
    public static void main(String[] args) {
        String[] field = {"Nama Lengkap", "Alamat", "No Telp"};
        String[] data = new String[3];

  
        for (int i = 0; i < field.length; i++) {
            data[i] = JOptionPane.showInputDialog("Masukkan " + field[i] + ":");
        }

   
        StringBuilder output = new StringBuilder();
        output.append("Nama Lengkap: ").append(data[0]).append("\n");
        output.append("Alamat: ").append(data[1]).append("\n");
        output.append("No Telp: ").append(data[2]);

        JOptionPane.showMessageDialog(null, output.toString(), "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
}
