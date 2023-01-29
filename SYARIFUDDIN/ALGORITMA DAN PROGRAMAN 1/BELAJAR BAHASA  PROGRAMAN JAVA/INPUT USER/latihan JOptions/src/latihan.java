import javax.swing.JOptionPane;

public class latihan {
    public static void main(String[] args) {
        
        String nama = JOptionPane.showInputDialog("masukkan nama anda");
        int nim = Integer.parseInt(JOptionPane.showInputDialog("No induk mahasiswa"));
        String[] pilihan = {"Teknik Informatika", "Teknik Elektro", "Teknik Sipil", "Teknik Pengairan"};
        int jurusan = JOptionPane.showOptionDialog(null, "silahkan pilih jurusan", "jurusan", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pilihan , pilihan[0]);
        int angkatan = Integer.parseInt(JOptionPane.showInputDialog("masukkan angkatan "));

        JOptionPane.showMessageDialog(null, "Nama : " + nama + "\nNim : " + nim + "\njurusan : " + pilihan[jurusan] + "\nangkatan : " + angkatan, "Informasi Pribadi", JOptionPane.INFORMATION_MESSAGE);
    }
}
