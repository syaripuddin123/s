import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        String s;
        System.out.print("Enter the movie ticket price");
        s = input.next();
        
        int a, b; //a = harga film, b = peringkat film
        System.out.print("masukkam harga film = ");
        a = input.nextInt();

        System.out.print("masukkam ranting film = ");
        b = input.nextInt();

        if (a >= 12 && b == 5) {
            System.out.println("saya tertarik nontong film ini");
        }else {
            System.out.println("saya tidak tertarik nontonh");
        }
    }
}
