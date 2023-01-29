import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double hargaBarang, jumlahBarang, diskon, totalHarga, bayar, kembalian;

        System.out.println("Program Kasir Sederhana");
        System.out.print("Harga Barang: Rp. ");
        hargaBarang = input.nextDouble();

        System.out.print("Jumlah Barang: ");
        jumlahBarang = input.nextDouble();

        System.out.print("Diskon       : Rp. ");
        diskon = input.nextDouble();

        totalHarga = (hargaBarang * jumlahBarang) - diskon;
        System.out.println("Total Harga   : Rp. " + totalHarga);
        System.out.print("Bayar         : Rp. ");
        bayar = input.nextDouble();

        kembalian = bayar - totalHarga;
        System.out.println("Kembalian      : Rp. " + kembalian);
    }
}
