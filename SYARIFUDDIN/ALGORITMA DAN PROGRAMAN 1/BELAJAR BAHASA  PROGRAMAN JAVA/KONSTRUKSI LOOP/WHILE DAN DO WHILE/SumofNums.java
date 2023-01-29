import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        //MENGGUNAKAN PENGULANGAN DO-WHILE-LOOPO
        do {
            System.out.print("masukan bilangan bulat : ");
            int number = console.nextInt();
            sum += number; //NILAI YANG DIMASUKKAN PENGGUNA AKAN TERSIMPAN KEDALAM VARIABEL SUM KEMUDIAN DI TAMBAH DENGAN NILAI YANG DIMASUKKAN PENGGUNA 
            count++;

        } while (count < 10); { //AKAN MENGHENTIKA JIKA KONDISI SUDAH BERNILAI FALSE
            System.out.println("total angka yang dimasukkan adalah " + sum);
            
        }

        System.out.println("The sum is " + sum);

    }
}
