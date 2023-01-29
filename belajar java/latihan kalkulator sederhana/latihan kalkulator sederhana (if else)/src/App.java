import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner inputuser; //deklarasi
        float a, b, hasil;
        char operator;

        inputuser = new Scanner(System.in);

        System.out.print("masukkan angka pertama = ");
        a = inputuser.nextFloat();
        System.out.print("masukkan operator = ");
        operator = inputuser.next().charAt(0);
        System.out.print("masukkan angka kedua = ");
        b = inputuser.nextFloat();

        System.out.println("input user " + a + " " + operator + " " + b);

        if (operator == '+'){
            //penjumlahan
            hasil = a + b;
            System.out.println("hasilnya = " + hasil);
        }else if (operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("hasilnya = " + hasil);
        }else if (operator == '*'){
            //perkalian
            hasil = a * b;
            System.out.println("hasilnya = " + hasil);
        }else if (operator == '/'){
            //pembagian
            hasil = a / b;
            System.out.println("hasilnya = " + hasil);
        }else {
            System.out.println("mohon maaf operator yang anda masukkan salah");
        }

    }
}
