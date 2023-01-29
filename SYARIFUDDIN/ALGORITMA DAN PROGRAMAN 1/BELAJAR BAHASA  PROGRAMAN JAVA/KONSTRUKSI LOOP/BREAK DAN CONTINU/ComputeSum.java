import java.util.Scanner;
public class ComputeSum {
        public static void main(String[] args) {
            
            //MENYURUH INPUT UNTUK MEMASUKAN ANGKA SAMPAI 10 
            Scanner input = new Scanner(System.in);
            //DEKLARASI
            int num, sum = 0;
            //PERULANGAN
            for (int i = 1; i <= 10; i++) {
                //INPUT USER
                System.out.print("Masukkan angka ke-: ");
                num = input.nextInt();

                if (num == 0) {
                break;
                }
                sum += num;
             }
            System.out.println("Jumlah angka yang dimasukkan: " + sum);
    }
}



