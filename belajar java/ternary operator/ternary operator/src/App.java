import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        int input, x; //deklarasi8

        Scanner inputuser = new Scanner(System.in); //pemanggilan scanner

        System.out.print("masukkan angka = ");
        input = inputuser.nextInt(); //menyuruh user memasukkan input

        //variabel x = ekspresi ? statement true : statement false
        
        x = (input == 10) ? (input*input) : (input/2); //jika user memasukkan angka 10 maka input akan dikali input, jika bukan 10 maka masukan input akan dibagi2


        System.out.println("hasilnya " + x );
    }
}
