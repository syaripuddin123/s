import javax.swing.JOptionPane;

public class main2 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("masukan nama anda ");
        int nilai = Integer.parseInt(JOptionPane.showInputDialog("masukan nilai 1 : "));

        if (nilai >= 90) {
            JOptionPane.showMessageDialog(null,   "nama : " + nama + "\nselamat anda mendapatkan nilai A+", "nilai",JOptionPane.INFORMATION_MESSAGE);
        }else if (nilai >= 85) {
            JOptionPane.showMessageDialog(null,   "nama : " + nama + "\nselamat anda mendapatkan nilai A-", "nilai",JOptionPane.INFORMATION_MESSAGE);
        }else if (nilai >= 80) {
            JOptionPane.showMessageDialog(null,   "nama : " + nama + "\nselamat anda mendapatkan nilai B+", "nilai",JOptionPane.INFORMATION_MESSAGE);
        }else if (nilai >= 75) {
            JOptionPane.showMessageDialog(null,   "nama : " + nama + "\nselamat anda mendapatkan nilai B", "nilai",JOptionPane.INFORMATION_MESSAGE);
        }else if (nilai >= 70) {
            JOptionPane.showMessageDialog(null,   "nama : " + nama + "\nselamat anda mendapatkan nilai B-", "nilai",JOptionPane.INFORMATION_MESSAGE);
        }else if (nilai >= 60) {
            JOptionPane.showMessageDialog(null,   "nama : " + nama + "\nselamat anda mendapatkan nilai C+", "nilai",JOptionPane.INFORMATION_MESSAGE);
        }else if (nilai >= 50) {
            JOptionPane.showMessageDialog(null,   "nama : " + nama + "\nselamat anda mendapatkan nilai C", "nilai",JOptionPane.INFORMATION_MESSAGE);
        }else if (nilai <= 50) {
            JOptionPane.showMessageDialog(null,   "nama : " + nama + "\nmohon maaf, anda mendapatkan nilai E", "nilai",JOptionPane.INFORMATION_MESSAGE);
        }
        
       
    }
    
}
