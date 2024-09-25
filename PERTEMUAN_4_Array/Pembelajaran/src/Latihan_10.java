import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan_10 {
    public static void main(String[] args) {

        ArrayList<String[]> dataKontak = new ArrayList<>();
        

        dataKontak.add(new String[]{"Septian Cahyadi", "Dramaga Cantik Residance II, Bogor", "+62 899-9506-210"});
        dataKontak.add(new String[]{"Isnan Mulia", "Jl. Manunggal, Bogor", "+62 819-3208-0875"});
        dataKontak.add(new String[]{"Edi Nurachmad", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384"});
        
 
        StringBuilder output = new StringBuilder();
        for (String[] kontak : dataKontak) {
            output.append("Nama: ").append(kontak[0]).append("\n");
            output.append("Alamat: ").append(kontak[1]).append("\n");
            output.append("No Telp: ").append(kontak[2]).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Data Kontak", JOptionPane.INFORMATION_MESSAGE);
    }
}
