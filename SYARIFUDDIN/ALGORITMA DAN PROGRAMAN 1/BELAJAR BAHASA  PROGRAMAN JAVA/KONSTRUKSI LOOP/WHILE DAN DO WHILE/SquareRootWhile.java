import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[]) {

    System.out.println("Type a non-negative integer: ");
    
    //MEMANGGIL SCANNER
    Scanner input = new Scanner(System.in);
	
    //DEKLARASI INT NUMBER
    int number;

    //PENGULANGAN
    while (true) { //DISINI MENGGUNAKAN TRUE KARENA JIKA FALSE TIDAK AKAN BERJALAN

        //INPUT USER
        System.out.print("masukan angka : ");
        number = input.nextInt();

        //INISIALISASI VARIABEL NUMBER
            if (number >= 0){
                break; //AKAN BERHENTI
            }
        //APABILA KONDISI FALSE
        System.out.println(number + " angka salah coba lagi");
    }
    //APABILA KONDISI TRUE
    double akarKuadrat = Math.sqrt(number);//CLASS UNTUK MENGHITUNG AKAR KUADRAT SECARA CEPAT DAN BISA JUGA MENGGUNAKAN MANUAL
    System.out.println("Akar kuadrat dari " + number + " adalah " + akarKuadrat);

    //CARA MANUAL UNTUK MENGHITUNG AKAR KUADRAT
    // double a = number;
    // double b = (a + number / a) / 2;
    // while (Math.abs(a - b) > 0.0001) {
    //   a = b;
    //   b = (a + number / a) / 2;
    }
    
}
