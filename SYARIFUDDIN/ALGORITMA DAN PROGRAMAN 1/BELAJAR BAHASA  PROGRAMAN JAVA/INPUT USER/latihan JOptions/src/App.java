import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

            int harga = Integer.parseInt(JOptionPane.showInputDialog("harga barang "));
            int jumlah = Integer.parseInt(JOptionPane.showInputDialog("jumlah barang "));
            int diskon = Integer.parseInt(JOptionPane.showInputDialog("diskon barang "));
            int total = (harga*jumlah)-diskon;
            JOptionPane.showMessageDialog(null, "Total harga : " + total, "PEMBAYARAN", JOptionPane.INFORMATION_MESSAGE);

            int bayar = Integer.parseInt(JOptionPane.showInputDialog("dibayar  "));
            int totalsemua = bayar-total;
            JOptionPane.showMessageDialog(null,"kembalian : " + totalsemua, "PEMBAYARAN", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
