import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a;
        int b, harga, pajak, total;

        System.out.print("nama barang = ");
        a = input.next();
        System.out.print("total barang = ");
        b = input.nextInt();

        harga = 50;
        pajak = 1;
        total = (harga * b) * pajak;

        if (b > 5) {
            System.out.println("barang tidak tersedia");
        }else {
            System.out.println("total yang akan dibayar = " + total);
        }
    }
}
	// numeric fields
        	

	// Calculating total cost
        