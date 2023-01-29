import java.util.Scanner;

public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        // Scanner keyboard = new Scanner(System.in);
        // int age = keyboard.nextInt();
        // int fare;
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("masukkan usia anda = ");
        a  = input.nextInt();

        if (a < 11) {
            System.out.println("tariff 3");
        }else if (a > 11) {
            System.out.println("tarif 3");
        }else {
            System.out.println("tarif 3");
        }
    }
}
