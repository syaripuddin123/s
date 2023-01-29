import java.util.Scanner;
public class SwitchEx1 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String bulan;
        System.out.print("masukkan nama bulan : ");
        bulan = input.next();

        switch (bulan) {
            case "januari":
                System.out.println("ini bulan januari");
                break;
            case "februari":
                System.out.println("ini bulan februari");
                break;
            case "maret":
                System.out.println("ini bulan maret");
                break;
            case "april":
                System.out.println("ini bulan april");
            case "mei":
                System.out.println("Vini bulan mei");
                break;
            case "juni":
                System.out.println("ini bulan juni");
                break;
            case "juli":
                System.out.println("ini bulan juli");
                break;
            case "agustus":
                System.out.println("ini bulan agustus");
                break;
            case "september":
                System.out.println("ini bulan setember");
                break;
            case "oktober":
                System.out.println("ini bulan oktober");
                break;
            case "novembar":
                System.out.println("ini bulan november");
                break;
            case "desember":
                System.out.println("ini bulan desember");
                break;
            default:
                System.out.println("nama bulan yang anda masukkan salah");
        }
    }
}
