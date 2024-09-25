import javax.swing.JOptionPane;

public class Latihan_08 {
    public static void main(String[] args) {
   
        String[][] dataKontak = {
            {"Septian Cahyadi", "Dramaga Cantik Residance II, Bogor", "+62 899-9506-210"},
            {"Isnan Mulia", "Jl. Manunggal, Bogor", "+62 819-3208-0875"},
            {"Edi Nurachmad", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384"}
        };

 
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < dataKontak.length; i++) {
            output.append("Nama: ").append(dataKontak[i][0]).append("\n");
            output.append("Alamat: ").append(dataKontak[i][1]).append("\n");
            output.append("No Telp: ").append(dataKontak[i][2]).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Data Kontak", JOptionPane.INFORMATION_MESSAGE);
    }
}
