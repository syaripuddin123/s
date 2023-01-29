import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan opsi = ");
        char opsi = input.next().charAt(0);

        int hitunga = 20, hitungb = 0, hitungc = 0;

        switch (opsi) {
            case 'A':
                hitunga++;
                System.out.println("hasil : " + hitunga);
                break;
            case 'B':
                hitungb++;
                System.out.println("hasil : " + hitungb);
                break;
            case 'C':
                hitungc++;
                System.out.println("hasil : " + hitungc);
            default:
                System.out.println("opsi yang anda masukkan salah");
        }
        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan opsi: ");
        // char opsi = input.next().charAt(0);
       
        // int hitunga = 0, hitungb = 0, hitungc = 0;
    
        // switch (opsi) {
        //     case 'A':
        //         hitunga++;
        //         System.out.println("hasilnya " + hitunga);
        //         break;
        //     case 'B':
        //         hitungb++;
        //         System.out.println("hasilnya = " + hitungb);
        //         break;
        //     case 'C':
        //         hitungc++;
        //         System.out.println("hasilnya = " + hitungc);
        //         break;
        //     default:
        //         System.out.println("salah");
        // }
    }
}
