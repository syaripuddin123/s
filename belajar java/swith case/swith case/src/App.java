import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        
        //CONTOH ABSEN SEDERHANA MENGGUNAKAN SWITCH CASE
        String input; //deklarasi input

        Scanner inputuser = new Scanner(System.in); //memanggil scanner

        System.out.print("masukkan nama anda = ");
        input = inputuser.next(); //menyuruh user untuk memasukkan input 

        switch(input){ //pengulangan
            case "otong": //aksi 1
                System.out.println("saya otong dan hadir boss");
                break;
            case "ucup": //aksi 2
                System.out.println("saya ucup dan hadir boss");
                break;
            default: //jika pernya
                System.out.println(input + " tidak hadir boss");


        }
    }
}
