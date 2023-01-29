import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        int a;
        boolean b = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Berapa usia anda = ");
        a = input.nextInt();

        if (a >= 18) {
            System.out.println("selamat");
        }else{
            System.out.println("ditolak");
        }
            
        }


       
    }

